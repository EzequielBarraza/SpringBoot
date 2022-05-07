
package com.myFirstApp.SpringBoot.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Basic
    private String cargo;
    private String institucion;
    private String periodo;
   

    public Experiencia() {
    }

    public Experiencia(String cargo, String institucion, String periodo) {
        this.cargo = cargo;
        this.institucion = institucion;
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return "Experiencia{" + "id=" + id + ", cargo=" + cargo + ", institucion=" + institucion + ", periodo=" + periodo + '}';
    }
}
