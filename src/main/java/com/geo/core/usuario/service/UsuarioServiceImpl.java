/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geo.core.usuario.service;

import com.geo.core.usuario.model.Usuario;
import com.geo.core.usuario.model.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository userRepository;

    @Override
    public Usuario consultarPorUserName(String userName) {
        return userRepository.findByUserName(userName);
    }

    public Usuario consultarUsuarioPorUserName(String userName) {
        return userRepository.findByUserName(userName);
    }

    @Override
    public Usuario consultarPorEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public Usuario consultarUsuarioPorEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public Usuario crearUsuario(Usuario usuario) {
        return userRepository.save(usuario);
    }

    @Override
    public Usuario consultarPorFuncionario(Long idFuncionario) {
        return userRepository.findByIdFuncionario(idFuncionario);
    }

    @Override
    public Usuario consultarPorId(String idUsuario) {
        return userRepository.findOne(idUsuario);
    }

    @Override
    public Usuario updateUsuario(Usuario usuario) {
        return userRepository.save(usuario);
    }
}
