/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gob.inti.argentinaprograma.miportfolio.service;

import gob.inti.argentinaprograma.miportfolio.model.User;
import gob.inti.argentinaprograma.miportfolio.repository.UserRepository;
import org.apache.tomcat.util.security.MD5Encoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @author Jorge Panigo <jorgepanigo@gmail.com>
 */
@Service
public class UserService implements  IUserService{
    
    @Autowired
    private UserRepository ur;

    @Override
    public boolean validateUser(User credential) {
        
        User u = ur.getById(credential.getUser());
        
        return ((u.getUser().equals(credential.getUser())) && (u.getPassword().equals(credential.getPassword())));
           
    }

    @Override
    public User returnValidateUserData(User credential) {
        User u = ur.getById(credential.getUser());
        
        return u;
    }

}
