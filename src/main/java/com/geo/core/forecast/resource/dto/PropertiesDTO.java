/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geo.core.forecast.resource.dto;

import java.util.List;

/**
 *
 * @author Simon
 */
public class PropertiesDTO {

    private String hora;
    private String relative_humidity;
    private String atmosphere_presure;
    private String temperature;
    private String precipitation;
    private String wind_speed;
    private String ws_direction;

    public PropertiesDTO() {
    }

    public PropertiesDTO(String hora, String relative_humidity, String atmosphere_presure, String temperature, String precipitation, String wind_speed, String ws_direction) {
        this.hora = hora;
        this.relative_humidity = relative_humidity;
        this.atmosphere_presure = atmosphere_presure;
        this.temperature = temperature;
        this.precipitation = precipitation;
        this.wind_speed = wind_speed;
        this.ws_direction = ws_direction;
    }

    public String getRelative_humidity() {
        return relative_humidity;
    }

    public void setRelative_humidity(String relative_humidity) {
        this.relative_humidity = relative_humidity;
    }

    public String getAtmosphere_presure() {
        return atmosphere_presure;
    }

    public void setAtmosphere_presure(String atmosphere_presure) {
        this.atmosphere_presure = atmosphere_presure;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(String precipitation) {
        this.precipitation = precipitation;
    }

    public String getWind_speed() {
        return wind_speed;
    }

    public void setWind_speed(String wind_speed) {
        this.wind_speed = wind_speed;
    }

    public String getWs_direction() {
        return ws_direction;
    }

    public void setWs_direction(String ws_direction) {
        this.ws_direction = ws_direction;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

}
