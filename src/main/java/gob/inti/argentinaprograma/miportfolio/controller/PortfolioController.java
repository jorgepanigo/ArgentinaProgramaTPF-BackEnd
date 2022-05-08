/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gob.inti.argentinaprograma.miportfolio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Jorge Panigo <jorgepanigo@gmail.com>
 */

@RestController
public class PortfolioController {
    
    @GetMapping("")
    public String portfolio(){
        return "Hola";
    }

}
