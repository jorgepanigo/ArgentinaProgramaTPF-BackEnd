/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gob.inti.argentinaprograma.miportfolio.model;

import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author Jorge Panigo <jorgepanigo@gmail.com>
 */
@Getter @Setter
public class Person {

    private long id;
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
    
}
