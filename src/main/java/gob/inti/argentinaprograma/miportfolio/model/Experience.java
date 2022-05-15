/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gob.inti.argentinaprograma.miportfolio.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;


/**
 * 
 * @author Jorge Panigo <jorgepanigo@gmail.com>
 */
@Entity
@Getter @Setter
public class Experience {
    
    @Id
    private long id;
    private String company;
    private String companyImg;
    private String position;
    
    @Temporal(TemporalType.DATE)
    private Date beginDate;
    
    @Temporal(TemporalType.DATE)
    private Date endDate;

    public Experience(long id, String company, String companyImg, String position, Date beginDate, Date endDate) {
        this.id = id;
        this.company = company;
        this.companyImg = companyImg;
        this.position = position;
        this.beginDate = beginDate;
        this.endDate = endDate;
    }
    
    

}
