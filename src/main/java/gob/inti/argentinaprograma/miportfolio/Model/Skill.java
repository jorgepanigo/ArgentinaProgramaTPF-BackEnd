/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gob.inti.argentinaprograma.miportfolio.Model;

import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author Jorge Panigo <jorgepanigo@gmail.com>
 */
@Getter @Setter
public class Skill {
    
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
