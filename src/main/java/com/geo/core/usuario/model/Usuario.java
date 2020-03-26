/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geo.core.usuario.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Simon
 */
@Document(collection = "usuario")
public class Usuario {

    @Id
    private Long id;
    private String identificacion;
    private String nombres;
    private String apellidos;
    private String email;
    /**
     * credenciales del usuario nombre de usuario(diferente al nombre de la
     * persona) y pasabordo
     */
    private String userName;
    private String password;
    private String estado;
    private Long idFuncionario;

    public Usuario() {
    }

    public Usuario(Long id, String identificacion, String nombres, String apellidos, String email, String userName, String password, String estado, Long idFuncionario) {
        this.id = id;
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.estado = estado;
        this.idFuncionario = idFuncionario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Long getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Long idFuncionario) {
        this.idFuncionario = idFuncionario;
    }
    
    
    
    

}
