/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geo.core.forecast.resource;

import com.geo.core.forecast.model.Forecast;
import com.geo.core.forecast.resource.dto.ForecastDTO;
import com.geo.core.forecast.service.ForecastService;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Simon
 */
@RestController
@RequestMapping("/Forecast")
public class ForecastResource {

    @Autowired
    private ForecastService forecastService;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Forecast registrarForecast(@RequestBody @Valid Forecast forecast) {
        return forecastService.guardar(forecast);
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Forecast> findAll() {
        return forecastService.findAll();
    }

    @RequestMapping(value = "findById/{id}", method = RequestMethod.GET)
    public Forecast findById(@PathVariable String id) {
        return forecastService.findById(id);
    }

    @RequestMapping(value = "findByCoordenadas/{longitud}/{latitud}", method = RequestMethod.GET)
    public ForecastDTO findById(@PathVariable String longitud, @PathVariable String latitud) {
        return forecastService.findByCoordenadas(Double.parseDouble(longitud), Double.parseDouble(latitud)); 
    }

}
