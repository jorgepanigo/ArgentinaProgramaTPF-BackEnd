/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gob.inti.argentinaprograma.miportfolio.service;

import gob.inti.argentinaprograma.miportfolio.model.Skill;
import gob.inti.argentinaprograma.miportfolio.repository.SkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @author Jorge Panigo <jorgepanigo@gmail.com>
 */
@Service
public class SkillService implements ISkillService{
    
    @Autowired
    private SkillRepository sr;

    @Override
    public Skill getItem(Long id) {
           return sr.getById(id);
    }

    @Override
    public List<Skill> getList() {
          return null;
    }

    @Override
    public Skill update(Skill s) {
         sr.save(s);
        return sr.getById(s.getId());
    }

    @Override
    public void delete(Long id) {
        
    }

    @Override
    public void newItem(Skill s, Long idPerson) {
        
    }

}
