/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gob.inti.argentinaprograma.miportfolio.service;

import gob.inti.argentinaprograma.miportfolio.model.Education;
import java.util.List;

/**
 *
 * @author Jorge Panigo <jorgepanigo@gmail.com>
 */
public interface IEducationService {
    
    
    //Devuelve lista de items de aducacion
    public Education getItem(Long id);
    
    //Devuelve un item en paricular
    public List<Education> getList();
    
    //Actualiza datos de un item
    public Education update (Education e);
    
    //Elimina un item por por id
    public void delete (Long id);
    
    //Añade un Item nuevo
    public void newItem (Education e, Long idPerson);
    
    
    
    
    
    
    
}
