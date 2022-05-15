/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gob.inti.argentinaprograma.miportfolio.controller;

import gob.inti.argentinaprograma.miportfolio.model.Education;
import gob.inti.argentinaprograma.miportfolio.dto.PortfolioDTO;
import gob.inti.argentinaprograma.miportfolio.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Jorge Panigo <jorgepanigo@gmail.com>
 */

@RestController
public class PortfolioController {
    
    @Autowired
    private PersonService ps;
    
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("")
    public PortfolioDTO portfolio(){
       
       PortfolioDTO myPortfolio = new PortfolioDTO();
       
       
       
       
       
       return myPortfolio;
    }

}
