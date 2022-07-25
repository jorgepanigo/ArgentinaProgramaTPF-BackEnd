package gob.inti.argentinaprograma.miportfolio.controller;
import gob.inti.argentinaprograma.miportfolio.dto.HeaderDTO;
import gob.inti.argentinaprograma.miportfolio.dto.PortfolioDTO;
import gob.inti.argentinaprograma.miportfolio.model.Education;
import gob.inti.argentinaprograma.miportfolio.model.Experience;
import gob.inti.argentinaprograma.miportfolio.model.Person;
import gob.inti.argentinaprograma.miportfolio.model.Proyect;
import gob.inti.argentinaprograma.miportfolio.model.Skill;
import gob.inti.argentinaprograma.miportfolio.model.User;
import gob.inti.argentinaprograma.miportfolio.service.EducationService;
import gob.inti.argentinaprograma.miportfolio.service.ExperienceService;
import gob.inti.argentinaprograma.miportfolio.service.PersonService;
import gob.inti.argentinaprograma.miportfolio.service.ProyectService;
import gob.inti.argentinaprograma.miportfolio.service.SkillService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Jorge Panigo <jorgepanigo@gmail.com>
 */

@CrossOrigin(origins = "https://portfoliojorgepanigo.web.app")
//@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class PortfolioController {
    
    
    
    
            
    @Autowired
    private PersonService ps;
    
    @Autowired
    private EducationService es;
    
    @Autowired
    private SkillService ss;
    
    @Autowired
    private ProyectService prs;
    
    @Autowired
    private ExperienceService exs;
    
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/{id}")
    public PortfolioDTO portfolio(@PathVariable Long id){
       
       PortfolioDTO myPortfolio = new PortfolioDTO();
       
       Person p = ps.getPerson(id);
       
       //Cargando datos del Header
       myPortfolio.setProfileBackground(p.getProfileBackground());
       myPortfolio.setProfileImage(p.getProfileImage());
       myPortfolio.setFirstName(p.getFirstName());
       myPortfolio.setLastName(p.getLastName());
       myPortfolio.setCity(p.getCity());
       myPortfolio.setProfession(p.getProfession());
       myPortfolio.setCountry(p.getCountry());
       myPortfolio.setMail(p.getMail());
       myPortfolio.setPhone(p.getPhone());
       myPortfolio.setEducationList(es.getList());
       myPortfolio.setGithub(p.getGithub());
       myPortfolio.setLinkedin(p.getLinkedin());
       
       
       //Cargando Datos de AboutMe
       myPortfolio.setAboutMe(p.getAboutMe());
       
       //Cargando Datos de Educacion
       myPortfolio.setEducationList(p.getEducation());
       
       //Cargando Datos de Experiencia Laboral
       myPortfolio.setExperienceList(p.getExperience());
       
       //Cargando Datos de Skills
       myPortfolio.setSkillList(p.getSkill());
       
       //Cargando Datos de Proyectos
       myPortfolio.setProyectList(p.getProyect());
       
        
      return myPortfolio;
    }
    
    
    
    
    @PutMapping("/{id}/header/update")
    public HeaderDTO updatePersonalData(@RequestBody HeaderDTO person,
                                        @PathVariable Long id){
        
        ps.updateHeader(person, id);
        return person;
    }
    
    
    
    
    @PutMapping("/{id}/aboutme/update")
    public String updateAboutMe (   @RequestBody String about,
                                    @PathVariable Long id){
        ps.setAboutMe(about, id);
        return about;
    }
    
    
    //CRUD EDUCATION//////////////////////////////////////////////////////////////////
    
    @PostMapping("/{id}/education/new")
    public List<Education> newEducationItem(  @RequestBody Education item,
                                        @PathVariable Long id){
        
        return ps.newEducationItem(item, id);
    }
    
    
    @PutMapping("{id}/education/update")
    public Education updateEducationItem(   @RequestBody Education item,
                                            @PathVariable Long id){
        
       
        return es.update(item);
    }
    
    @DeleteMapping("/{idPerson}/education/delete/{i}")
    public List<Education> deleteEducationItem(@PathVariable Long idPerson,
                                               @PathVariable Long i){
        
        return ps.deleteEducationItem(idPerson, i);
        
    }
    
    //CRUD EXPERIENCE/////////////////////////////////////////////////////////////////
    
     @PostMapping("/{id}/experience/new")
    public Experience newExperienceItem(@RequestBody Experience item,
                                        @PathVariable Long id){
        
        ps.newExperienceItem(item, id);
        return item;
    }
    
    @PutMapping("{id}/experience/update")
    public Experience updateExperienceItem(   @RequestBody Experience item,
                                            @PathVariable Long id){
        
       
        return exs.update(item);
    }
    
    @DeleteMapping("/{idPerson}/experience/delete/{i}")
    public List<Experience> deleteExperienceItem(@PathVariable Long idPerson,
                                               @PathVariable Long i){
        
        return ps.deleteExperienceItem(idPerson, i);
        
    }
    
    //CRUD SKILL
    
    @PostMapping("/{id}/skill/new")
    public Skill newSKillItem(  @RequestBody Skill item,
                                @PathVariable Long id){
      ps.newSkillItem(item, id);
      return item;
    }
    
    @PutMapping("/{id}/skill/update")
    public Skill updateSkillItem(   @RequestBody Skill item,
                                    @PathVariable Long id){
        return ss.update(item);
    }
    
    @DeleteMapping("/{idPerson}/skill/delete/{i}")
    public List<Skill> deleteSkillItem(@PathVariable Long idPerson,
                                       @PathVariable Long i){
        
        return ps.deleteSkillItem(idPerson, i);
        
    }
    //CRUD PROYECT

    @PostMapping("/{id}/proyect/new")
    public List<Proyect> newProyectItem(    @RequestBody Proyect item,
                                            @PathVariable Long id){
        
        
        return ps.newProyectItem(item, id);
    }
    
    @PutMapping("/{id}/proyect/update")
    public Proyect updateProyectItem(   @RequestBody Proyect item,
                                        @PathVariable Long id){
        return prs.update(item);
    }
    
    @DeleteMapping("/{idPerson}/proyect/delete/{i}")
    public List<Proyect> deleteProyectItem(@PathVariable Long idPerson,
                                           @PathVariable Long i){
        
        return ps.deleteProyectItem(idPerson, i);
        
    }
    
    
   

}
