/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geo.core.pronostico.service;

import com.geo.core.pronostico.model.Pronostico;
import com.geo.core.pronostico.model.PronosticoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Simon
 */
@Service
public class PronosticoServiceImpl implements PronosticoService{
    
    @Autowired
    private PronosticoRepository pronosticoRepository;

    @Override
    public Pronostico guardar(Pronostico pronostico) {
        return pronosticoRepository.save(pronostico);
    }

    @Override
    public List<Pronostico> findAll() {
        return pronosticoRepository.findAll();
    }

    @Override
    public Pronostico findById(String idE) {
        return pronosticoRepository.findOne(idE);
    }
    
    public Pronostico findLastToOcean(String Ocean) {
        return pronosticoRepository.findOne(Ocean);
    }

    @Override
    public List<Pronostico> findByMarOrderByDesc(String mar) {
        return pronosticoRepository.findTop1ByMarDesc(mar);
    }
}
