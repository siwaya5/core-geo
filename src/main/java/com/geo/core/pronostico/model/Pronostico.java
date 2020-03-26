/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geo.core.pronostico.model;

import java.util.Calendar;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Simon
 */
@Document(collection = "pronostico")
public class Pronostico {
    
    @Id
    private String id;
    private Calendar fecha;
    private String usuario;
    private String idUsuario;
    private String mar;
    private String descripcion;

    public Pronostico() {
    }

    public Pronostico(String id, Calendar fecha, String usuario, String idUsuario, String mar, String descripcion) {
        this.id = id;
        this.fecha = fecha;
        this.usuario = usuario;
        this.idUsuario = idUsuario;
        this.mar = mar;
        this.descripcion = descripcion;
    }


    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getMar() {
        return mar;
    }

    public void setMar(String mar) {
        this.mar = mar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
}
