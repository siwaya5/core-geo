/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geo.core.forecast.service;

import com.geo.core.forecast.model.Forecast;
import com.geo.core.forecast.model.ForecastRepository;
import com.geo.core.forecast.resource.dto.ForecastDTO;
import com.geo.core.forecast.resource.dto.ForecastFechaDTO;
import com.geo.core.forecast.resource.dto.PropertiesDTO;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

/**
 *
 * @author Simon
 */
@Service
public class ForecastServiceImpl implements ForecastService {

    @Autowired
    private ForecastRepository forecastRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public Forecast guardar(Forecast forecast) {
        return forecastRepository.save(forecast);
    }

    @Override
    public List<Forecast> findAll() {
        return forecastRepository.findAll();
    }

    @Override
    public Forecast findById(String idE) {
        return forecastRepository.findOne(idE);
    }

    @Override
    public ForecastDTO findByCoordenadas(double longitud, double latitud) {
        List<Forecast> list = forecastRepository.findByCoordenadas(longitud, latitud);
        List<String> listFechasDistinct = new ArrayList<>();
        
        list.forEach((forcast) -> {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            String dateString = format.format(forcast.getForecast_at());

            if (!listFechasDistinct.contains(dateString)) {
                listFechasDistinct.add(dateString);
            }
        });

        ForecastDTO forecastDTO = new ForecastDTO(longitud, latitud, new ArrayList<>());

        listFechasDistinct.forEach((distinctFecha) -> {
            List<PropertiesDTO> listPropertiesDTO = new ArrayList<>();

            list.forEach((forcast) -> {
                SimpleDateFormat formatCompare = new SimpleDateFormat("yyyy-MM-dd");
                String dateString = formatCompare.format(forcast.getForecast_at());

                if (distinctFecha.equals(dateString)) {
                    SimpleDateFormat formatTime = new SimpleDateFormat("HH:mm:ss");
                    String hour = formatTime.format(forcast.getForecast_at());
                    PropertiesDTO propertiesDTO = new PropertiesDTO(hour,
                            forcast.getProperties().getRelative_humidity(),
                            forcast.getProperties().getAtmosphere_presure(),
                            forcast.getProperties().getTemperature(),
                            forcast.getProperties().getPrecipitation(),
                            forcast.getProperties().getWind_speed(),
                            forcast.getProperties().getWs_direction());

                    listPropertiesDTO.add(propertiesDTO);
                }
            });

            forecastDTO.getListFecha().add(new ForecastFechaDTO(distinctFecha, listPropertiesDTO));
        });

        return forecastDTO;
    }
}
