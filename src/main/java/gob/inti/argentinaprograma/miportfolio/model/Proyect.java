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

public class Proyect {
    
    @Id
    private long id;
    
    private String title;
    private String description;
    private String githubLink;
    private String image;
    private String category;

    public Proyect(long id, String title, String description, String githubLink, String image) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.githubLink = githubLink;
        this.image = image;
    }
    

    
}
