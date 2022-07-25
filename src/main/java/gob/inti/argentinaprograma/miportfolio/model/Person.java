/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gob.inti.argentinaprograma.miportfolio.model;

import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author Jorge Panigo <jorgepanigo@gmail.com>
 */
@Entity
@Getter @Setter
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    
    
    @Basic
    private String profileBackground;
    private String profileImage;
    private String firstName;
    private String lastName;
    private String city;
    private String country;
    private String profession;
    private String mail; 
    private String phone;
    private String aboutMe;
    private String linkedin;
    private String github;

   
    @OneToMany(cascade={CascadeType.ALL}, orphanRemoval=true)
    private List<Education> education;
    
    @OneToMany(cascade={CascadeType.ALL}, orphanRemoval=true)
    private List<Experience> experience;
    
    @OneToMany(cascade={CascadeType.ALL}, orphanRemoval=true)
    private List<Skill> skill;
    
    @OneToMany(cascade={CascadeType.ALL}, orphanRemoval=true)
    private List<Proyect> proyect;
    
    
    

    public Person(long id, String profileBackground, String profileImage, String firstName, String lastName, String city, String country, String profession, String mail, String phone, String github, String linkedin) {
        this.id = id;
        this.profileBackground = profileBackground;
        this.profileImage = profileImage;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.country = country;
        this.profession = profession;
        this.mail = mail;
        this.phone = phone;
        this.linkedin = linkedin;
        this.github = github;
   
    }

    public Person() {
    }
    

}
