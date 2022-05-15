/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gob.inti.argentinaprograma.miportfolio.service;

import gob.inti.argentinaprograma.miportfolio.model.Person;
import gob.inti.argentinaprograma.miportfolio.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @author Jorge Panigo <jorgepanigo@gmail.com>
 */
@Service
public class PersonService implements IPersonService{

    @Autowired
    private PersonRepository pr;

    @Override
    public Person getPerson(Long id) {
        return pr.getById(id);
    }

    @Override
    public void UpdatePerson(Person p) {
        pr.save(p);
    }
}
