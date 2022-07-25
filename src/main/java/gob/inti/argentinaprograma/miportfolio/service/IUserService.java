/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gob.inti.argentinaprograma.miportfolio.service;

import gob.inti.argentinaprograma.miportfolio.model.User;
import org.springframework.stereotype.Service;

/**
 * 
 * @author Jorge Panigo <jorgepanigo@gmail.com>
 */

@Service
public interface IUserService {
    

    
    
    //Valida las credenciales de usuario
    public boolean validateUser(User credential);
    
    //Valida las credenciales de usuario devolviendo el usuario
    public User returnValidateUserData(User credential);
    


}
