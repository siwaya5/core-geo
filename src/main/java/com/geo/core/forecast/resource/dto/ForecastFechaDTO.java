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
public class ForecastFechaDTO {

    private String fecha;
    private List<PropertiesDTO> propertiesDTO;

    public ForecastFechaDTO() {
    }

    public ForecastFechaDTO(String fecha, List<PropertiesDTO> propertiesDTO) {
        this.fecha = fecha;
        this.propertiesDTO = propertiesDTO;
    }


    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public List<PropertiesDTO> getPropertiesDTO() {
        return propertiesDTO;
    }

    public void setPropertiesDTO(List<PropertiesDTO> propertiesDTO) {
        this.propertiesDTO = propertiesDTO;
    }

}
