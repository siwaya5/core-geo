/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geo.core.forecast.model;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 *
 * @author Simon
 */
public interface ForecastRepository extends MongoRepository<Forecast, String> {

    @Query("{'location.coordinates': [?0,?1]}")
    public List<Forecast> findByCoordenadas(double longitud, double latitud);

}
