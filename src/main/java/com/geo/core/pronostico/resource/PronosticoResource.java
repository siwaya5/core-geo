/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geo.core.pronostico.resource;

import com.geo.core.pronostico.model.Pronostico;
import com.geo.core.pronostico.service.PronosticoService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Simon
 */
@RestController
@RequestMapping("/Pronostico")
public class PronosticoResource {

    @Autowired
    private PronosticoService pronosticoService;

    @RequestMapping(value = "registrarForecast", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Pronostico registrarForecast(@RequestBody @Valid Pronostico pronostico) {
        return pronosticoService.guardar(pronostico);
    }

    @RequestMapping(value = "findAll", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Pronostico> findAll() {
        return pronosticoService.findAll();
    }

    @RequestMapping(value = "findById/{id}", method = RequestMethod.GET)
    public Pronostico findById(@PathVariable String id) {
        return pronosticoService.findById(id);
    }

    @RequestMapping(value = "findByMar/{mar}", method = RequestMethod.GET)
    public List<Pronostico> findByMar(@PathVariable String mar) {
        return pronosticoService.findByMarOrderByDesc(mar);
    }

}
