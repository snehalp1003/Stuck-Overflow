/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.HospitalEmployee;
import java.util.ArrayList;
/**
 *
 * @author Marisa
 */
public class HospitalEmployeeDirectory {
   private ArrayList<HospitalEmployee> hospitalEmployeeList;

    public HospitalEmployeeDirectory() {
        hospitalEmployeeList = new ArrayList();
    }

    public ArrayList<HospitalEmployee> getHospitalEmployeeList() {
        return hospitalEmployeeList;
    }    
    
    public HospitalEmployee createHospitalEmployee(String name){
        HospitalEmployee employee = new HospitalEmployee();
        employee.setName(name);
        hospitalEmployeeList.add(employee);
        return employee;
    } 
}
