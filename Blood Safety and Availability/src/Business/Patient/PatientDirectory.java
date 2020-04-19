/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author Marisa
 */
public class PatientDirectory {
  private ArrayList<Patient> patientList;
 public PatientDirectory() {
        patientList = new ArrayList();
    } 
 
  public ArrayList<Patient> getPatientList() {
        return patientList;
    }
  
  public Patient createPatient(String patientName) {
        Patient patient = new Patient();
        patient.setPatientName(patientName);
        patient.setPatientAdmitDate(new Date());
        patient.setPatientStatus("Admitted");
        patientList.add(patient);
        return patient;
    }
}
