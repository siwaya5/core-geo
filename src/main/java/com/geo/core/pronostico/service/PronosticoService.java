/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geo.core.pronostico.service;

import com.geo.core.pronostico.model.Pronostico;
import java.util.List;

/**
 *
 * @author Simon
 */
public interface PronosticoService {
    
    Pronostico guardar(Pronostico pronostico);
    List<Pronostico> findAll();
    Pronostico findById(String idE);
    
    List<Pronostico> findByMarOrderByDesc(String mar);
    
}
