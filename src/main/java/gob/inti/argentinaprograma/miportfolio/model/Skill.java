/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gob.inti.argentinaprograma.miportfolio.model;

import javax.persistence.Entity;
import javax.persistence.Id;
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
    private long id;
    private String type;
    private String name;
    private int progress;   

    public Skill(long id, String type, String name, int progress) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.progress = progress;
    }



}
