/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Donor;



/**
 *
 * @author Marisa
 */
public class Donor {


  private String donorName;
    private int d_ID;
    private String donorBloodType;
    private long contact;
    private String donorMedHist;
    private date donatedDate;
    
    private static int count = 1;

    public Donor() {
        d_ID = count;
        count++;
    }  
     
}
