
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
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Basic
    private String school;
    private String title;
    private int score;
    private String start;
    private String end;

    public Educacion() {
    }

    public Educacion(String school, String title, int score, String start, String end) {
        this.school = school;
        this.title = title;
        this.score = score;
        this.start = start;
        this.end =end;
    }

    @Override
    public String toString() {
        return "Educacion{" + "id=" + id + ", school=" + school + ", title=" + title + ", score=" + score + ", start=" + start+ ", end=" + end + '}';
    }
}
