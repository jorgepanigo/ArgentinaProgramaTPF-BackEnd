/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gob.inti.argentinaprograma.miportfolio.service;

import gob.inti.argentinaprograma.miportfolio.model.Person;

/**
 *
 * @author Jorge Panigo <jorgepanigo@gmail.com>
 */
public interface IPersonService {
    
    public Person getPerson(Long id);
    
    public void UpdatePerson(Person p);
    
}
