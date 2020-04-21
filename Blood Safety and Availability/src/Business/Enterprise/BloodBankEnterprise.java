/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Snehal
 */
public class BloodBankEnterprise extends Enterprise {
    
    private HashMap<String,Integer> bloodBankDirectory;
    private HashMap<String,Double> bloodBankPrices;
    
    public BloodBankEnterprise(String name){
        super(name,EnterpriseType.BloodBank);
        bloodBankDirectory = new HashMap<>();
        bloodBankPrices = new HashMap<>();
        initializeBloodBankDirectory();
    }
    
    public void initializeBloodBankDirectory() {
        bloodBankDirectory.put("Red Cells - AB RhD positive (AB+)", 0);
        bloodBankDirectory.put("Red Cells - AB RhD negative (AB-)", 0);
        bloodBankDirectory.put("Red Cells - A RhD positive (A+)", 0);
        bloodBankDirectory.put("Red Cells - A RhD negative (A-)", 0);
        bloodBankDirectory.put("Red Cells - B RhD positive (B+)", 0);
        bloodBankDirectory.put("Red Cells - B RhD negative (B-)", 0);
        bloodBankDirectory.put("Red Cells - O RhD positive (O+)", 0);
        bloodBankDirectory.put("Red Cells - O RhD negative (O-)", 0);
        
        bloodBankDirectory.put("Platelet - AB RhD positive (AB+)", 0);
        bloodBankDirectory.put("Platelet - AB RhD negative (AB-)", 0);
        bloodBankDirectory.put("Platelet - A RhD positive (A+)", 0);
        bloodBankDirectory.put("Platelet - A RhD negative (A-)", 0);
        bloodBankDirectory.put("Platelet - B RhD positive (B+)", 0);
        bloodBankDirectory.put("Platelet - B RhD negative (B-)", 0);
        bloodBankDirectory.put("Platelet - O RhD positive (O+)", 0);
        bloodBankDirectory.put("Platelet - O RhD negative (O-)", 0);
        
        bloodBankDirectory.put("Plasma - AB RhD positive (AB+)", 0);
        bloodBankDirectory.put("Plasma - AB RhD negative (AB-)", 0);
        bloodBankDirectory.put("Plasma - A RhD positive (A+)", 0);
        bloodBankDirectory.put("Plasma - A RhD negative (A-)", 0);
        bloodBankDirectory.put("Plasma - B RhD positive (B+)", 0);
        bloodBankDirectory.put("Plasma - B RhD negative (B-)", 0);
        bloodBankDirectory.put("Plasma - O RhD positive (O+)", 0);
        bloodBankDirectory.put("Plasma - O RhD negative (O-)", 0);
    }

    public HashMap<String, Integer> getBloodBankDirectory() {
        return bloodBankDirectory;
    }

    public void setBloodBankDirectory(HashMap<String, Integer> bloodBankDirectory) {
        this.bloodBankDirectory = bloodBankDirectory;
    }

    public HashMap<String, Double> getBloodBankPrices() {
        return bloodBankPrices;
    }

    public void setBloodBankPrices(HashMap<String, Double> bloodBankPrices) {
        this.bloodBankPrices = bloodBankPrices;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
