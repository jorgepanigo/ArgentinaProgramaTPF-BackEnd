/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gob.inti.argentinaprograma.miportfolio.repository;

import gob.inti.argentinaprograma.miportfolio.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jorge Panigo <jorgepanigo@gmail.com>
 */
@Repository
public interface UserRepository extends JpaRepository<User, String>{
    
}
