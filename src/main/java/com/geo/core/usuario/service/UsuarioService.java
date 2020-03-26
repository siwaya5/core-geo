/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geo.core.usuario.service;

import com.geo.core.usuario.model.Usuario;

/**
 *
 * @author solinces-sparta
 */
public interface UsuarioService {

    public Usuario consultarPorUserName(String userName);

    public Usuario consultarPorEmail(String email);

    public Usuario crearUsuario(Usuario usuario);

    public Usuario consultarPorFuncionario(Long id);

    public Usuario consultarPorId(String idUsuario);

    public Usuario updateUsuario(Usuario usuario);

}
