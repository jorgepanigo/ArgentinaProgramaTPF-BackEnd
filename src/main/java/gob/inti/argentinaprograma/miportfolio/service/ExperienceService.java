/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gob.inti.argentinaprograma.miportfolio.service;

import gob.inti.argentinaprograma.miportfolio.model.Experience;
import gob.inti.argentinaprograma.miportfolio.repository.ExperienceRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @author Jorge Panigo <jorgepanigo@gmail.com>
 */
@Service
public class ExperienceService implements IExperienceService{

    @Autowired
    private ExperienceRepository er;
    
    @Override
    public Experience getItem(Long id) {
            return er.getById(id);
    }

    @Override
    public List<Experience> getList() {
            return er.findAll();
    }

    @Override
    public void update(Experience e) {
            er.save(e);
    }

    @Override
    public void delete(Long id) {
            er.deleteById(id);
    }

    
}
