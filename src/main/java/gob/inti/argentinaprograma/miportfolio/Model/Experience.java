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
public class Experience {
    
    private long id;
    private String company;
    private String companyImg;
    private String position;
    private Date beginDate;
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
