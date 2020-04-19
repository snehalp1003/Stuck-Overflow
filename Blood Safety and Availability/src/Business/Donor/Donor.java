/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Donor;

import Business.Employee.Employee;
import java.util.Date;



/**
 *
 * @author Marisa
 */
public class Donor {


    private String donorName;
    private String gender;
    private String donorBloodType;
    private String contact;
    private String donorMedHist;
    private Date bloodDonatedDate;
    private Date donorDOB;
    private Date donorRegisteredDate;
    private Double donorHeight;
    private Double donorWeight;
    private Double donorBP;
    private Double donorHeartRate;
    private Double donortemp;
    private String donorstatus;
     private Employee assignedLab;
    private Employee assignedStaff;

    public Donor() {
    }  
  
    public String getDonorName() {
        return donorName;
    }

    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }

    public String getDonorBloodType() {
        return donorBloodType;
    }

    public void setDonorBloodType(String donorBloodType) {
        this.donorBloodType = donorBloodType;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDonorMedHist() {
        return donorMedHist;
    }

    public void setDonorMedHist(String donorMedHist) {
        this.donorMedHist = donorMedHist;
    }

    public Date getBloodDonatedDate() {
        return bloodDonatedDate;
    }

    public void setBloodDonatedDate(Date bloodDonatedDate) {
        this.bloodDonatedDate = bloodDonatedDate;
    }

    public Date getDOB() {
        return donorDOB;
    }

    public void setDOB(Date DOB) {
        this.donorDOB = DOB;
    }

    public Double getDonorHeight() {
        return donorHeight;
    }

    public void setDonorHeight(Double donorHeight) {
        this.donorHeight = donorHeight;
    }

    public Double getDonorWeight() {
        return donorWeight;
    }

    public void setDonorWeight(Double donorWeight) {
        this.donorWeight = donorWeight;
    }

    public Double getDonorBP() {
        return donorBP;
    }

    public void setDonorBP(Double donorBP) {
        this.donorBP = donorBP;
    }

    public Double getDonorHeartRate() {
        return donorHeartRate;
    }

    public void setDonorHeartRate(Double donorHeartRate) {
        this.donorHeartRate = donorHeartRate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDonorDOB() {
        return donorDOB;
    }

    public void setDonorDOB(Date donorDOB) {
        this.donorDOB = donorDOB;
    }

    public Date getDonorRegisteredDate() {
        return donorRegisteredDate;
    }

    public void setDonorRegisteredDate(Date donorRegisteredDate) {
        this.donorRegisteredDate = donorRegisteredDate;
    }

    public String getDonorstatus() {
        return donorstatus;
    }

    public void setDonorstatus(String donorstatus) {
        this.donorstatus = donorstatus;
    }

    public Double getDonortemp() {
        return donortemp;
    }

    public void setDonortemp(Double donortemp) {
        this.donortemp = donortemp;
    }

    public Employee getAssignedLab() {
        return assignedLab;
    }

    public void setAssignedLab(Employee assignedLab) {
        this.assignedLab = assignedLab;
    }

    public Employee getAssignedStaff() {
        return assignedStaff;
    }

    public void setAssignedStaff(Employee assignedStaff) {
        this.assignedStaff = assignedStaff;
    }
    
    @Override
    public String toString() {
        return this.donorName;
    }
    
    
    
    
    
   
}
