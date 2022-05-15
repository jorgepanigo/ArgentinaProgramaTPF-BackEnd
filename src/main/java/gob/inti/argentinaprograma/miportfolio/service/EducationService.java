/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gob.inti.argentinaprograma.miportfolio.service;

import gob.inti.argentinaprograma.miportfolio.model.Education;
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
    private EducationService es;

    @Override
    public Education getItem(Long id) {
        return es.getItem(id);
    }

    @Override
    public List<Education> getList() {
        return es.getList();
    }

    @Override
    public void update(Education e) {
        es.update(e);
    }

    @Override
    public void delete(Long id) {
        es.delete(id);
    }

    
}
