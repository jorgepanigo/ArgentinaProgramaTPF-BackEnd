/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gob.inti.argentinaprograma.miportfolio.repository;

import gob.inti.argentinaprograma.miportfolio.model.Experience;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Jorge Panigo <jorgepanigo@gmail.com>
 */
public interface ExperienceRepository extends JpaRepository<Experience, Long>{
    
}
