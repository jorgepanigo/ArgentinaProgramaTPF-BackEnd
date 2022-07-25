/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gob.inti.argentinaprograma.miportfolio.controller;

import gob.inti.argentinaprograma.miportfolio.utils.JWT;
import gob.inti.argentinaprograma.miportfolio.model.User;
import gob.inti.argentinaprograma.miportfolio.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Jorge Panigo <jorgepanigo@gmail.com>
 */

@CrossOrigin(origins = "https://portfoliojorgepanigo.web.app")
//@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AuthController {

@Autowired
private UserService us;

@Autowired
private JWT jwt;


@PostMapping("/autenticate")
public boolean autenticate (@RequestBody User user){
    
    return us.validateUser(user);
      
}

@PostMapping("/login")
public String login (@RequestBody User user){
    
    User u = us.returnValidateUserData(user);
    if (u != null){
        String token = jwt.create(u.getUser(), u.getUser());
        return token;
    }
    return null;
      
}

}
