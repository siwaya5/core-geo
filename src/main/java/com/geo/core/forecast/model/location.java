/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geo.core.forecast.model;

import com.geo.compartido.ValueObject;
import java.util.List;

/**
 *
 * @author Simon
 */
public class location implements ValueObject<location> {

    private String type;
    private List<String> coordinates;

    public location() {
    }

    public location(String type, List<String> coordinates) {
        this.type = type;
        this.coordinates = coordinates;
    }
    
    @Override
    public boolean sameValueAs(location other) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<String> coordinates) {
        this.coordinates = coordinates;
    }

    
    
}
