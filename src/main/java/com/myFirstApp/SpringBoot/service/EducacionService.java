
package com.myFirstApp.SpringBoot.service;

import com.myFirstApp.SpringBoot.model.Educacion;
import com.myFirstApp.SpringBoot.model.Experiencia;
import com.myFirstApp.SpringBoot.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EducacionService implements IEducacionService {

    @Autowired
    public EducacionRepository repository;
    
    @Override
    public List<Educacion> obtenerEducacion() {
        return repository.findAll();
    }

    @Override
    public Educacion crearEducacion(Educacion educacion) {
        return repository.save(educacion);
    }

    @Override
    public void borrarEducacion(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Educacion obtenerEducacion(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void modificarEducacion(Educacion educacion) {
        repository.save(educacion);
    }

    public List<Experiencia> obtenerExperiencia() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Experiencia crearExperiencia(Experiencia experiencia) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void borrarExperiencia(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Experiencia obtenerExperiencia(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void modificarExperiencia(Experiencia experiencia) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
