/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Donor.Donor;
import Business.Enterprise.Enterprise;
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
    private Donor donor;
    private Date requestDate;
    private Enterprise enterpriseForRedCellUnits;
    private Enterprise enterpriseForPlateletUnits;
    private Enterprise enterpriseForPlasmaUnits;
    private UserAccount bloodBankStaffForRedCellUnits;
    private UserAccount bloodBankStaffForPlasmaUnits;
    private UserAccount bloodBankStaffForPlateletUnits;
    private String requestStatusForPlateletUnits;
    private String requestStatusForPlasmaUnits;
    private String requestStatusForRedCellUnits;
    private Date resolveDateForPlateletUnits;
    private Date resolveDateForPlasmaUnits;
    private Date resolveDateForRedCellUnits;
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

    public UserAccount getBloodBankStaffForRedCellUnits() {
        return bloodBankStaffForRedCellUnits;
    }

    public void setBloodBankStaffForRedCellUnits(UserAccount bloodBankStaffForRedCellUnits) {
        this.bloodBankStaffForRedCellUnits = bloodBankStaffForRedCellUnits;
    }

    public UserAccount getBloodBankStaffForPlasmaUnits() {
        return bloodBankStaffForPlasmaUnits;
    }

    public void setBloodBankStaffForPlasmaUnits(UserAccount bloodBankStaffForPlasmaUnits) {
        this.bloodBankStaffForPlasmaUnits = bloodBankStaffForPlasmaUnits;
    }
 

    public Donor getDonor() {
        return donor;
    }

    public void setDonor(Donor donor) {
        this.donor = donor;
    }

    public String getRequestStatusForPlateletUnits() {
        return requestStatusForPlateletUnits;
    }

    public void setRequestStatusForPlateletUnits(String requestStatusForPlateletUnits) {
        this.requestStatusForPlateletUnits = requestStatusForPlateletUnits;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDateForPlateletUnits() {
        return resolveDateForPlateletUnits;
    }

    public void setResolveDateForPlateletUnits(Date resolveDateForPlateletUnits) {
        this.resolveDateForPlateletUnits = resolveDateForPlateletUnits;
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

    public Enterprise getEnterpriseForRedCellUnits() {
        return enterpriseForRedCellUnits;
    }

    public void setEnterpriseForRedCellUnits(Enterprise enterpriseForRedCellUnits) {
        this.enterpriseForRedCellUnits = enterpriseForRedCellUnits;
    }

    public Enterprise getEnterpriseForPlateletUnits() {
        return enterpriseForPlateletUnits;
    }

    public void setEnterpriseForPlateletUnits(Enterprise enterpriseForPlateletUnits) {
        this.enterpriseForPlateletUnits = enterpriseForPlateletUnits;
    }

    public Enterprise getEnterpriseForPlasmaUnits() {
        return enterpriseForPlasmaUnits;
    }

    public void setEnterpriseForPlasmaUnits(Enterprise enterpriseForPlasmaUnits) {
        this.enterpriseForPlasmaUnits = enterpriseForPlasmaUnits;
    }

    public UserAccount getBloodBankStaffForPlateletUnits() {
        return bloodBankStaffForPlateletUnits;
    }

    public void setBloodBankStaffForPlateletUnits(UserAccount bloodBankStaffForPlateletUnits) {
        this.bloodBankStaffForPlateletUnits = bloodBankStaffForPlateletUnits;
    }

    public String getRequestStatusForPlasmaUnits() {
        return requestStatusForPlasmaUnits;
    }

    public void setRequestStatusForPlasmaUnits(String requestStatusForPlasmaUnits) {
        this.requestStatusForPlasmaUnits = requestStatusForPlasmaUnits;
    }

    public String getRequestStatusForRedCellUnits() {
        return requestStatusForRedCellUnits;
    }

    public void setRequestStatusForRedCellUnits(String requestStatusForRedCellUnits) {
        this.requestStatusForRedCellUnits = requestStatusForRedCellUnits;
    }

    public Date getResolveDateForPlasmaUnits() {
        return resolveDateForPlasmaUnits;
    }

    public void setResolveDateForPlasmaUnits(Date resolveDateForPlasmaUnits) {
        this.resolveDateForPlasmaUnits = resolveDateForPlasmaUnits;
    }

    public Date getResolveDateForRedCellUnits() {
        return resolveDateForRedCellUnits;
    }

    public void setResolveDateForRedCellUnits(Date resolveDateForRedCellUnits) {
        this.resolveDateForRedCellUnits = resolveDateForRedCellUnits;
    }
    
    
    
    @Override
    public String toString() {
        return this.patient.getPatient().getPatientName();
    }
}
