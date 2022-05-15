/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gob.inti.argentinaprograma.miportfolio.dto;

import gob.inti.argentinaprograma.miportfolio.model.Education;
import gob.inti.argentinaprograma.miportfolio.model.Experience;
import gob.inti.argentinaprograma.miportfolio.model.Person;
import gob.inti.argentinaprograma.miportfolio.model.Proyect;
import gob.inti.argentinaprograma.miportfolio.model.Skill;
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
public class PortfolioDTO {
    
    
    
    private long id;
    
    private Person person;
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
    private List<Education> educationList;
    private List<Experience> experienceList;
    private List<Skill> skillList;
    private List<Proyect> proyectList;
    
    
    
    
    public PortfolioDTO(){
        
       
        
        
        
        
//       setId(12345676);
//       setFirstName("Jorge");
//       setLastName("Panigo");
//       setMail("jorgepanigo@gmail.com");
//       setCountry("Argentina");
//       setCity("La Plata");
//       setPhone("2215988023");
//       setProfession("Jr FullStack Developer");
//       setAboutMe("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
// 
//        
//        educationList = new ArrayList<Education>();
//        experienceList = new ArrayList<Experience>();
//        skillList = new ArrayList<Skill>();
//        proyectList = new ArrayList<Proyect>();
//        
//        Education ed1 = new Education(0, "FRLP - UTN", "", "Ingenieria en Sistemas", new Date(), new Date());
//        Education ed2 = new Education(1, "EEM Nro 4", "", "Bachiller", new Date(), new Date());
//        Education ed3 = new Education(2, "Escuela 49 Gral Jose de San Martin", "", "", new Date(), new Date());
//        educationList.add(ed1);
//        educationList.add(ed2);
//        educationList.add(ed3);
//        
//        
//        Experience ex1 = new Experience(0, "Fravega", "", "Jefe de Salon", new Date(), new Date());
//        Experience ex2 = new Experience(1, "Musimundo", "", "Subgerente", new Date(), new Date());
//        Experience ex3 = new Experience(2, "Soho", "", "Encargado", new Date(), new Date());
//        experienceList.add(ex1);
//        experienceList.add(ex2);
//        experienceList.add(ex3);
//        
//       
//        Skill sk1 = new Skill(0, "Hard", "Javascript", 45);
//        Skill sk2 = new Skill(1, "Hard", "Java", 75);
//        Skill sk3 = new Skill(2, "Hard", "HTML", 90);
//        skillList.add(sk1);
//        skillList.add(sk2);
//        skillList.add(sk3);
//        
//        
//        Proyect py1 = new Proyect(0, "Agencia de Viajes", "Proyecto final del curso dictado por el Silicon Misiones en 2021. Sistema de gestion de paquetes turisticos para agencia de viajes.", "#", "#");
//        Proyect py2 = new Proyect(1, "TAGAT", "Terminal Autoservicio para cubrir la demanda de mostrador del dto de alumnos de la UTN FRLP.", "#", "#");
//        Proyect py3 = new Proyect(2, "Challeges 1 ONE", "Encriptador de Texto desarrollado en HTML, CSS y JavaScript", "#", "#");
//        proyectList.add(py1);
//        proyectList.add(py2);
//        proyectList.add(py3);
//        
       
        
    }
    
    
    
    
    
    
    
}



