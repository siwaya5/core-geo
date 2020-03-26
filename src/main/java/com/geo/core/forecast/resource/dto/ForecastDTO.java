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
public class ForecastDTO {
    
    private double longitud; 
    private double latitud; 
    private List<ForecastFechaDTO> listFecha;

    public ForecastDTO() {
    }

    public ForecastDTO(double longitud, double latitud, List<ForecastFechaDTO> listFecha) {
        this.longitud = longitud;
        this.latitud = latitud;
        this.listFecha = listFecha;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public List<ForecastFechaDTO> getListFecha() {
        return listFecha;
    }

    public void setListFecha(List<ForecastFechaDTO> listFecha) {
        this.listFecha = listFecha;
    }
    
}
