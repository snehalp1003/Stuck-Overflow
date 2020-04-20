/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.Employee.Employee;
import java.util.Date;

/**
 *
 * @author Marisa
 */
public class Patient {

    private String patientName;
    private String patientBloodType;
    private Long patientContact;
    private String patientDiagnosis;
    private String patientTreatment;
    private Date patientAdmitDate;
    private Date patientDischargeDate;
    private Date patientDOB;
    private Double patientHeight;
    private Double patientWeight;
    private Double patientLowBP;
    private Double patientHighBP;
    private Double patientHeartRate;
    private String patientGender;
    private String patientStatus;
    private Double patientTemperature;
    private Employee assignedDoctor;
    private Employee assignedStaff;
    private boolean transfusionNeeded;
    private int wholeBloodUnits;
    private int redCellsUnits;
    private int plasmaUnits;
    private Date dateBloodRequired;

    public Patient() {
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientBloodType() {
        return patientBloodType;
    }

    public void setPatientBloodType(String patientBloodType) {
        this.patientBloodType = patientBloodType;
    }

    public Long getPatientContact() {
        return patientContact;
    }

    public void setPatientContact(Long patientContact) {
        this.patientContact = patientContact;
    }

    public String getPatientDiagnosis() {
        return patientDiagnosis;
    }

    public void setPatientDiagnosis(String patientDiagnosis) {
        this.patientDiagnosis = patientDiagnosis;
    }

    public String getPatientTreatment() {
        return patientTreatment;
    }

    public void setPatientTreatment(String patientTreatment) {
        this.patientTreatment = patientTreatment;
    }

    public Date getPatientAdmitDate() {
        return patientAdmitDate;
    }

    public void setPatientAdmitDate(Date patientAdmitDate) {
        this.patientAdmitDate = patientAdmitDate;
    }

    public Date getPatientDischargeDate() {
        return patientDischargeDate;
    }

    public void setPatientDischargeDate(Date patientDischargeDate) {
        this.patientDischargeDate = patientDischargeDate;
    }

    public Date getPatientDOB() {
        return patientDOB;
    }

    public void setPatientDOB(Date patientDOB) {
        this.patientDOB = patientDOB;
    }

    public Double getPatientHeight() {
        return patientHeight;
    }

    public void setPatientHeight(Double patientHeight) {
        this.patientHeight = patientHeight;
    }

    public Double getPatientWeight() {
        return patientWeight;
    }

    public void setPatientWeight(Double patientWeight) {
        this.patientWeight = patientWeight;
    }

    public Double getPatientLowBP() {
        return patientLowBP;
    }

    public void setPatientLowBP(Double patientLowBP) {
        this.patientLowBP = patientLowBP;
    }

    public Double getPatientHighBP() {
        return patientHighBP;
    }

    public void setPatientHighBP(Double patientHighBP) {
        this.patientHighBP = patientHighBP;
    }

    public Double getPatientHeartRate() {
        return patientHeartRate;
    }

    public void setPatientHeartRate(Double patientHeartRate) {
        this.patientHeartRate = patientHeartRate;
    }

    public Double getPatientTemperature() {
        return patientTemperature;
    }

    public void setPatientTemperature(Double patientTemperature) {
        this.patientTemperature = patientTemperature;
    }
    
    public String getPatientGender() {
        return patientGender;
    }

    public void setPatientGender(String patientGender) {
        this.patientGender = patientGender;
    }

    public String getPatientStatus() {
        return patientStatus;
    }

    public void setPatientStatus(String patientStatus) {
        this.patientStatus = patientStatus;
    }

    public Employee getAssignedDoctor() {
        return assignedDoctor;
    }

    public void setAssignedDoctor(Employee assignedDoctor) {
        this.assignedDoctor = assignedDoctor;
    }

    public Employee getAssignedStaff() {
        return assignedStaff;
    }

    public void setAssignedStaff(Employee assignedStaff) {
        this.assignedStaff = assignedStaff;
    }

    public boolean isTransfusionNeeded() {
        return transfusionNeeded;
    }

    public void setTransfusionNeeded(boolean transfusionNeeded) {
        this.transfusionNeeded = transfusionNeeded;
    }

    public int getWholeBloodUnits() {
        return wholeBloodUnits;
    }

    public void setWholeBloodUnits(int wholeBloodUnits) {
        this.wholeBloodUnits = wholeBloodUnits;
    }

    public int getRedCellsUnits() {
        return redCellsUnits;
    }

    public void setRedCellsUnits(int redCellsUnits) {
        this.redCellsUnits = redCellsUnits;
    }

    public int getPlasmaUnits() {
        return plasmaUnits;
    }

    public void setPlasmaUnits(int plasmaUnits) {
        this.plasmaUnits = plasmaUnits;
    }

    public Date getDateBloodRequired() {
        return dateBloodRequired;
    }

    public void setDateBloodRequired(Date dateBloodRequired) {
        this.dateBloodRequired = dateBloodRequired;
    }

    @Override
    public String toString() {
        return this.patientName;
    }

}
