/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gob.inti.argentinaprograma.miportfolio.service;

import gob.inti.argentinaprograma.miportfolio.dto.HeaderDTO;
import gob.inti.argentinaprograma.miportfolio.model.Education;
import gob.inti.argentinaprograma.miportfolio.model.Experience;
import gob.inti.argentinaprograma.miportfolio.model.Person;
import gob.inti.argentinaprograma.miportfolio.model.Proyect;
import gob.inti.argentinaprograma.miportfolio.model.Skill;
import gob.inti.argentinaprograma.miportfolio.repository.PersonRepository;
import java.util.List;
import org.apache.catalina.mbeans.MBeanDumper;
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
    public void updateHeader(HeaderDTO p, Long id) {
        Person per = pr.getById(id);
        per.setFirstName(p.getFirstName());
        per.setLastName(p.getLastName());
        per.setCity(p.getCity());
        per.setCountry(p.getCountry());
        per.setMail(p.getMail());
        per.setPhone(p.getPhone());
        per.setProfession(p.getProfession());
        per.setProfileBackground(p.getProfileBackground());
        per.setProfileImage(p.getProfileImage());
        per.setLinkedin(p.getLinkedin());
        per.setGithub(p.getGithub());
        pr.save(per);
    }

    @Override
    public void setAboutMe(String about, Long id) {
        Person per = pr.getById(id);
        per.setAboutMe(about);
        pr.save(per);
    }

    
    @Override
    public void updatePerson(Person p) {
        pr.save(p);
    }

    
    
    public List<Education> newEducationItem(Education item, Long id) {
        Person per = pr.getById(id);
        List<Education> eduList= per.getEducation();
        eduList.add(item);
        per.setEducation(eduList);
        pr.save(per);
        per = pr.getById(id);
        return per.getEducation();
        
    }
    
    public List<Education> deleteEducationItem(Long idPerson, long i) {
        
        
        
        Person per = pr.getById(idPerson);
        List<Education> eduList= per.getEducation();
        eduList.remove((int) i);
        per.setEducation(eduList);
        pr.save(per);
        per = pr.getById(idPerson);
        return per.getEducation();
        
    }
    
    public void newExperienceItem(Experience item, Long id) {
        Person per = pr.getById(id);
        List<Experience> expList= per.getExperience();
        expList.add(item);
        per.setExperience(expList);
        pr.save(per);
        
    }
    
     public List<Experience> deleteExperienceItem(Long idPerson, long i) {
        
        
      
        Person per = pr.getById(idPerson);
        List<Experience> expList= per.getExperience();
        expList.remove((int) i);
        per.setExperience(expList);
        pr.save(per);
        per = pr.getById(idPerson);
        return per.getExperience();
        
    }
    
    public void newSkillItem(Skill item, Long id) {
        Person per = pr.getById(id);
        List<Skill> skList= per.getSkill();
        skList.add(item);
        per.setSkill(skList);
        pr.save(per);
        
    }
    
    
    public List<Skill> deleteSkillItem(Long idPerson, long i) {
        
        Person per = pr.getById(idPerson);
        List<Skill> skList= per.getSkill();
        skList.remove((int) i);
        per.setSkill(skList);
        pr.save(per);
        per = pr.getById(idPerson);
        return per.getSkill();
        
    }
    
    public List<Proyect> newProyectItem(Proyect item, Long id) {
        Person per = pr.getById(id);
        List<Proyect> pyList= per.getProyect();
        pyList.add(item);
        per.setProyect(pyList);
        pr.save(per);
        per = pr.getById(id);
        return  per.getProyect();
    }
   
    public List<Proyect> deleteProyectItem(Long idPerson, long i) {
        
        
        System.out.println(i);
        Person per = pr.getById(idPerson);
        List<Proyect> proList= per.getProyect();
        proList.remove((int) i);
        per.setProyect(proList);
        pr.save(per);
        per = pr.getById(idPerson);
        return per.getProyect();
        
    }
    
    
    
}
