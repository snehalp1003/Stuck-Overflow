/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Donor;

import java.util.Date;



/**
 *
 * @author Marisa
 */
public class Donor {


  private String donorName;
    private int donorID;
    private String donorBloodType;
    private long contact;
    private String donorMedHist;
    private Date donatedDate;
    
    private static int count = 1;

    public Donor() {
        donorID = count;
        count++;
    }  
     
}
