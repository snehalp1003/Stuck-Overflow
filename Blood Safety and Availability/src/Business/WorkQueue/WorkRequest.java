/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Donor.Donor;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author Snehal
 */
public abstract class WorkRequest {
    private UserAccount patient;
    private UserAccount doctor;
    private UserAccount hospitalStaff;
    private UserAccount bloodBankStaff;
    private UserAccount labSupervisor;
    private Donor donor;
    private String requestStatus;
    private Date requestDate;
    private Date resolveDate;
    private int redCellUnits;
    private int plateletUnits;
    private int plasmaUnits;
    
    public WorkRequest(){
        requestDate = new Date();
    }

    public UserAccount getPatient() {
        return patient;
    }

    public void setPatient(UserAccount patient) {
        this.patient = patient;
    }

    public UserAccount getDoctor() {
        return doctor;
    }

    public void setDoctor(UserAccount doctor) {
        this.doctor = doctor;
    }

    public UserAccount getHospitalStaff() {
        return hospitalStaff;
    }

    public void setHospitalStaff(UserAccount hospitalStaff) {
        this.hospitalStaff = hospitalStaff;
    }

    public UserAccount getBloodBankStaff() {
        return bloodBankStaff;
    }

    public void setBloodBankStaff(UserAccount bloodBankStaff) {
        this.bloodBankStaff = bloodBankStaff;
    }

    public UserAccount getLabSupervisor() {
        return labSupervisor;
    }

    public void setLabSupervisor(UserAccount labSupervisor) {
        this.labSupervisor = labSupervisor;
    }
 

    public Donor getDonor() {
        return donor;
    }

    public void setDonor(Donor donor) {
        this.donor = donor;
    }

    public String getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

    public int getRedCellUnits() {
        return redCellUnits;
    }

    public void setRedCellUnits(int redCellUnits) {
        this.redCellUnits = redCellUnits;
    }

    public int getPlateletUnits() {
        return plateletUnits;
    }

    public void setPlateletUnits(int plateletUnits) {
        this.plateletUnits = plateletUnits;
    }

    public int getPlasmaUnits() {
        return plasmaUnits;
    }

    public void setPlasmaUnits(int plasmaUnits) {
        this.plasmaUnits = plasmaUnits;
    }
    
    @Override
    public String toString() {
        return this.patient.getPatient().getPatientName();
    }
}
