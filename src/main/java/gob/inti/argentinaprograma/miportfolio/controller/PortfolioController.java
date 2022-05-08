/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gob.inti.argentinaprograma.miportfolio.controller;

import gob.inti.argentinaprograma.miportfolio.Model.Education;
import gob.inti.argentinaprograma.miportfolio.Model.Portfolio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Jorge Panigo <jorgepanigo@gmail.com>
 */

@RestController
public class PortfolioController {
    
    @GetMapping("")
    public Portfolio portfolio(){
        
       Portfolio myPortfolio = new Portfolio();
       
       myPortfolio.setId(12345676);
       myPortfolio.setFirstName("Jorge");
       myPortfolio.setLastName("Panigo");
       myPortfolio.setMail("jorgepanigo@gmail.com");
       myPortfolio.setCountry("Argentina");
       myPortfolio.setCity("La Plata");
       myPortfolio.setPhone("2215988023");
       myPortfolio.setProfession("Jr FullStack Developer");
       myPortfolio.setAboutMe("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
    
       
       
       
        
        return myPortfolio;
    }

}
