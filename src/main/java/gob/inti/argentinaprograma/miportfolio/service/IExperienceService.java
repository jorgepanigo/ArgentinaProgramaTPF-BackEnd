/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gob.inti.argentinaprograma.miportfolio.service;

import gob.inti.argentinaprograma.miportfolio.model.Experience;
import java.util.List;

/**
 *
 * @author Jorge Panigo <jorgepanigo@gmail.com>
 */
public interface IExperienceService {
    
    //Devuelve lista de items de experiencia
    public Experience getItem(Long id);
    
    //Devuelve un item en paricular
    public List<Experience> getList();
    
    //Actualiza datos de un item
    public void update (Experience e);
    
    //Elimina un item por por id
    public void delete (Long id);
    
}
