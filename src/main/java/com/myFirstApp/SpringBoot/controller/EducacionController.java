
package com.myFirstApp.SpringBoot.controller;

import com.myFirstApp.SpringBoot.model.Educacion;
import com.myFirstApp.SpringBoot.service.EducacionService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EducacionController {

    @Autowired
    public EducacionService service;
    
    @GetMapping("/educacion")
    @ResponseBody
    public List<Educacion> obtenerEducacion() {
        return service.obtenerEducacion();
    }
    
    @PostMapping("/educacion/create")
    @ResponseBody
    public Educacion crearEducacion(@RequestBody Educacion educacion) {
        return service.crearEducacion(educacion);
    }
    
    @DeleteMapping("/educacion/{id}")
    public void borrarEducacion(@PathVariable Long id) {
        service.borrarEducacion(id);
    }
    
    @GetMapping("/educacion/{id}")
    @ResponseBody
    public Educacion obtenerEducacion(@PathVariable Long id) {
        return service.obtenerEducacion(id);
    }
    
    @PutMapping("/educacion/update")
    public void modificarEducacion(@RequestBody Educacion educacion) {
        System.out.println(educacion);
        service.modificarEducacion(educacion);
    }
    
}
