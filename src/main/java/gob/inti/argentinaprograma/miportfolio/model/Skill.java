/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gob.inti.argentinaprograma.miportfolio.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author Jorge Panigo <jorgepanigo@gmail.com>
 */

@Entity
@Getter @Setter
public class Skill {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    
    @Basic
    private String type;
    private String name;
    private int progress; 
    
//    @OneToOne
//    private Person person;

    public Skill(long id, String type, String name, int progress) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.progress = progress;
    }

    public Skill() {
    }

    


}
