/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geo.core.forecast.service;

import com.geo.core.forecast.model.Forecast;
import com.geo.core.forecast.resource.dto.ForecastDTO;
import java.util.List;

/**
 *
 * @author Simon
 */
public interface ForecastService {
    
    Forecast guardar(Forecast forecast);
    List<Forecast> findAll();
    ForecastDTO findByCoordenadas(double longitud, double latitud);
    Forecast findById(String idE);
    
}
