/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gob.inti.argentinaprograma.miportfolio.Model;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author Jorge Panigo <jorgepanigo@gmail.com>
 */

@Getter @Setter
public class Education {
    
    private long id;
    private String institution;
    private String institutionImg;
    private String degree;
    private Date beginDate;
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

