/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import java.util.Date;

/**
 *
 * @author Marisa
 */
public class Patient {


    private String PatientName;
    private int patientID;
    private String patientBloodType;
    private long patientContact;
    private String patientMedHist;
    private Date patientAdmitDate;
    private Date patientDischargeDate;
    private Date patientDOB;
    private Double patientHeight;
    private Double patientWeight;
    private Double patientBP;
    private Double patientHeartRate;
    private String patientGender;
    private String patientEmail;    
    
    private static int count = 1;

    public Patient() {
        patientID = count;
        count++;
    }  
    
        public String getPatientName() {
        return PatientName;
    }

    public void setPatientName(String PatientName) {
        this.PatientName = PatientName;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getPatientBloodType() {
        return patientBloodType;
    }

    public void setPatientBloodType(String patientBloodType) {
        this.patientBloodType = patientBloodType;
    }

    public long getPatientContact() {
        return patientContact;
    }

    public void setPatientContact(long patientContact) {
        this.patientContact = patientContact;
    }

    public String getPatientMedHist() {
        return patientMedHist;
    }

    public void setPatientMedHist(String patientMedHist) {
        this.patientMedHist = patientMedHist;
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

    public Double getPatientBP() {
        return patientBP;
    }

    public void setPatientBP(Double patientBP) {
        this.patientBP = patientBP;
    }

    public Double getPatientHeartRate() {
        return patientHeartRate;
    }

    public void setPatientHeartRate(Double patientHeartRate) {
        this.patientHeartRate = patientHeartRate;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Patient.count = count;
    }
    
        public String getPatientGender() {
        return patientGender;
    }

    public void setPatientGender(String patientGender) {
        this.patientGender = patientGender;
    }

    public String getPatientEmail() {
        return patientEmail;
    }

    public void setPatientEmail(String patientEmail) {
        this.patientEmail = patientEmail;
    }
}
