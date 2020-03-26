/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geo.core.forecast.model;

import com.geo.compartido.ValueObject;
import java.util.Calendar;

/**
 *
 * @author Simon
 */
public class created_at implements ValueObject<created_at> {
    
    private Calendar $date;

    public created_at() {
    }

    public created_at(Calendar $date) {
        this.$date = $date;
    }

    @Override
    public boolean sameValueAs(created_at other) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Calendar get$date() {
        return $date;
    }

    public void set$date(Calendar $date) {
        this.$date = $date;
    }

    
}
