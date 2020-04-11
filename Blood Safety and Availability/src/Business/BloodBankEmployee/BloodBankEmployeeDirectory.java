/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BloodBankEmployee;

import java.util.ArrayList;

/**
 *
 * @author Snehal
 */
public class BloodBankEmployeeDirectory {
    private ArrayList<BloodBankEmployee> bloodBankEmployeeList;

    public BloodBankEmployeeDirectory() {
        bloodBankEmployeeList = new ArrayList();
    }

    public ArrayList<BloodBankEmployee> getBloodBankEmployeeList() {
        return bloodBankEmployeeList;
    }    
    
    public BloodBankEmployee createBloodBankEmployee(String name){
        BloodBankEmployee employee = new BloodBankEmployee();
        employee.setName(name);
        bloodBankEmployeeList.add(employee);
        return employee;
    }
}
