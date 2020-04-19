/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author Snehal
 */
public abstract class WorkRequest {
    private String message;
    private UserAccount patient;
    private UserAccount doctor;
    private UserAccount hospitalStaff;
    private UserAccount bloodBankStaff;
    private UserAccount labSupervisor;
    private UserAccount donor;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    
    public WorkRequest(){
        requestDate = new Date();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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

    public UserAccount getDonor() {
        return donor;
    }

    public void setDonor(UserAccount donor) {
        this.donor = donor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
}
