/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geo.core.usuario.model;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 *
 * @author Simon
 */
public interface UsuarioRepository extends MongoRepository<Usuario, String> {

    public Usuario findByUserName(String userName);

//    @Query(value = " select * from usuario where email COLLATE Latin1_General_CS_AS = ?1", nativeQuery = true)
    public Usuario findByEmail(String email);

    public Usuario findByIdFuncionario(Long idFuncionario);

}
