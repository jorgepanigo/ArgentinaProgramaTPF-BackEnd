/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gob.inti.argentinaprograma.miportfolio.service;

import gob.inti.argentinaprograma.miportfolio.model.Proyect;

import java.util.List;


/**
 *
 * @author Jorge Panigo <jorgepanigo@gmail.com>
 */

public interface IProyectService {
    
     //Devuelve lista de items de aducacion
    public Proyect getItem(Long id);
    
    //Devuelve un item en paricular
    public List<Proyect> getList();
    
    //Actualiza datos de un item
    public Proyect update (Proyect p);
    
    //Elimina un item por por id
    public void delete (Long id);
    
    //Añade un Item nuevo
    public void newItem (Proyect e, Long idPerson);
   
   
    
}
