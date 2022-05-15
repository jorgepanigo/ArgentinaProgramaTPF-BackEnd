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
public class Education {
    
    @Id
    private long id;
    
    private String institution;
    private String institutionImg;
    private String degree;
    
    @Temporal(TemporalType.DATE)
    private Date beginDate;
    @Temporal(TemporalType.DATE)
    private Date endDate;

    public Education(long id, String institution, String institutionImg, String degree, Date beginDate, Date endDate) {
        this.id = id;
        this.institution = institution;
        this.institutionImg = institutionImg;
        this.degree = degree;
        this.beginDate = beginDate;
        this.endDate = endDate;
    }
    
    
}

