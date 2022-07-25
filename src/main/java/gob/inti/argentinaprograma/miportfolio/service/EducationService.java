/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gob.inti.argentinaprograma.miportfolio.service;

import gob.inti.argentinaprograma.miportfolio.model.Education;
import gob.inti.argentinaprograma.miportfolio.model.Person;
import gob.inti.argentinaprograma.miportfolio.repository.EducationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @author Jorge Panigo <jorgepanigo@gmail.com>
 */

@Service
public class EducationService implements IEducationService{
    
    @Autowired
    private EducationRepository er;
    
    @Autowired
    private PersonService ps;

    @Override
    public Education getItem(Long id) {
        return er.getById(id);
    }

    @Override
    public List<Education> getList() {
        return er.findAll();
    }

   
    @Override
    public Education update(Education e) {
        er.save(e);
        return er.getById(e.getId());
        
    }

    @Override
    public void delete(Long id) {
        er.deleteById(id);
    }

    @Override
    public void newItem(Education e, Long idPerson) {
    }

}
