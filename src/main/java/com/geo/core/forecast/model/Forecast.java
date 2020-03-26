/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geo.core.forecast.model;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Simon
 */
@Document(collection = "forecast")
public class Forecast {
    
    @Id
    private String _id;
    private Date created_at;
    private Date forecast_at;
    private location location;
    private properties properties;

    public Forecast() {
    }

    public Forecast(String _id, Date created_at, Date forecast_at, location location, properties properties) {
        this._id = _id;
        this.created_at = created_at;
        this.forecast_at = forecast_at;
        this.location = location;
        this.properties = properties;
    }


    public location getLocation() {
        return location;
    }

    public void setLocation(location location) {
        this.location = location;
    }

    public properties getProperties() {
        return properties;
    }

    public void setProperties(properties properties) {
        this.properties = properties;
    }

    public String getId() {
        return _id;
    }

    public void setId(String _id) {
        this._id = _id;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getForecast_at() {
        return forecast_at;
    }

    public void setForecast_at(Date forecast_at) {
        this.forecast_at = forecast_at;
    }

    
}
