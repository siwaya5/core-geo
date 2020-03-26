/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geo.core.forecast.model;

import com.geo.compartido.ValueObject;

/**
 *
 * @author Simon
 */
public class _id implements ValueObject<_id> {

    private String $oid;

    public _id() {
    }

    public _id(String $oid) {
        this.$oid = $oid;
    }

    @Override
    public int hashCode() {
        return $oid.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean sameValueAs(_id other) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String get$oid() {
        return $oid;
    }

    public void set$oid(String $oid) {
        this.$oid = $oid;
    }

}
