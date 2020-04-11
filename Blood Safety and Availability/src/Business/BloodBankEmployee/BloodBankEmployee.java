/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BloodBankEmployee;

/**
 *
 * @author Snehal
 */
public class BloodBankEmployee {
    private String name;
    private int bloodBankEmpId;
    private static int count = 1;
    
    public BloodBankEmployee() {
        bloodBankEmpId = count;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBloodBankEmpId() {
        return bloodBankEmpId;
    }

    @Override
    public String toString() {
        return name;
    }
}
