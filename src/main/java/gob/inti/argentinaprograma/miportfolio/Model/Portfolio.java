/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gob.inti.argentinaprograma.miportfolio.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author Jorge Panigo <jorgepanigo@gmail.com>
 */


@Getter @Setter
public class Portfolio {
    
    private long id;
    private String perfileBackgound;
    private String profileImage;
    private String firstName;
    private String lastName;
    private String city;
    private String country;
    private String profession;
    private String mail; 
    private String phone;
    private String aboutMe; 
    private List<Education> educationList;
    private List<Experience> experienceList;
    private List<Skill> skillList;
    private List<Proyect> proyectList;
    
    
    
    
    public Portfolio(){
        
    educationList = new ArrayList<Education>();
    experienceList = new ArrayList<Experience>();
    skillList = new ArrayList<Skill>();
    proyectList = new ArrayList<Proyect>();
        
        Education ed1 = new Education(0, "FRLP - UTN", "", "Ingenieria en Sistemas", new Date(), new Date());
        Education ed2 = new Education(1, "EEM Nro 4", "", "Bachiller", new Date(), new Date());
        Education ed3 = new Education(2, "Escuela 49 Gral Jose de San Martin", "", "", new Date(), new Date());
        educationList.add(ed1);
        educationList.add(ed2);
        educationList.add(ed3);
        
        
        Experience ex1 = new Experience(0, "Fravega", "", "Jefe de Salon", new Date(), new Date());
        Experience ex2 = new Experience(1, "Musimundo", "", "Subgerente", new Date(), new Date());
        Experience ex3 = new Experience(2, "Soho", "", "Encargado", new Date(), new Date());
        experienceList.add(ex1);
        experienceList.add(ex2);
        experienceList.add(ex3);
        
       
        Skill sk1 = new Skill(0, "Hard", "Javascript", 45);
        Skill sk2 = new Skill(1, "Hard", "Java", 75);
        Skill sk3 = new Skill(2, "Hard", "HTML", 90);
        skillList.add(sk1);
        skillList.add(sk2);
        skillList.add(sk3);
        
        
        Proyect py1 = new Proyect(0, "Agencia de Viajes", "Proyecto final del curso dictado por el Silicon Misiones en 2021. Sistema de gestion de paquetes turisticos para agencia de viajes.", "#", "#");
        Proyect py2 = new Proyect(1, "TAGAT", "Terminal Autoservicio para cubrir la demanda de mostrador del dto de alumnos de la UTN FRLP.", "#", "#");
        Proyect py3 = new Proyect(2, "Challeges 1 ONE", "Encriptador de Texto desarrollado en HTML, CSS y JavaScript", "#", "#");
        proyectList.add(py1);
        proyectList.add(py2);
        proyectList.add(py3);
        
       
        
    }
    
    
    
    
    
    
    
}



