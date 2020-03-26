/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geo.core.pronostico.model;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 *
 * @author Simon
 */
public interface PronosticoRepository extends MongoRepository<Pronostico, String>{
    
    @Query("{'mar': ?0}.limit(1)")
    List<Pronostico> findTop1ByMarDesc(String mar);
    
}
