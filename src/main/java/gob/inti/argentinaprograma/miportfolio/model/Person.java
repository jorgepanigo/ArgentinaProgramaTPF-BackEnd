/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gob.inti.argentinaprograma.miportfolio.model;

import javax.persistence.Basic;
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
public class Person {

    @Id
    private long id;
    
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

    public Person(long id, String profileBackground, String profileImage, String firstName, String lastName, String city, String country, String profession, String mail, String phone, String aboutMe) {
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
        this.aboutMe = aboutMe;
    }
    
    
    
}
