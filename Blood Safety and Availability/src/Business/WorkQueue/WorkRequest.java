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
    private int id;
    private static int count = 1;
    private Enterprise hospitalEnterprise;
    private UserAccount patient;
    private UserAccount doctor;
    private UserAccount hospitalStaff;
    private Donor donor;
    private Date requestDate;
    private String orderStatus;
    private String redCellsComponent;
    private String plateletComponent;
    private String plasmaComponent;
    private Enterprise enterpriseForRedCellUnits;
    private Enterprise enterpriseForPlateletUnits;
    private Enterprise enterpriseForPlasmaUnits;
    private int redCellsUnits;
    private int plateletUnits;
    private int plasmaUnits;
    private Double redCellsPrice;
    private Double plateletPrice;
    private Double plasmaPrice;
    private UserAccount bloodBankStaffForRedCellUnits;
    private UserAccount bloodBankStaffForPlasmaUnits;
    private UserAccount bloodBankStaffForPlateletUnits;
    private String requestStatusForPlateletUnits;
    private String requestStatusForPlasmaUnits;
    private String requestStatusForRedCellUnits;
    private Date resolveDateForPlateletUnits;
    private Date resolveDateForPlasmaUnits;
    private Date resolveDateForRedCellUnits;

    
    public WorkRequest(){
        id = count;
        count++;
        requestDate = new Date();
    }
    
    public int getId() {
        return id;
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

    public int getRedCellsUnits() {
        return redCellsUnits;
    }

    public void setRedCellsUnits(int redCellsUnits) {
        this.redCellsUnits = redCellsUnits;
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

    public Double getRedCellsPrice() {
        return redCellsPrice;
    }

    public void setRedCellsPrice(Double redCellsPrice) {
        this.redCellsPrice = redCellsPrice;
    }

    public Double getPlateletPrice() {
        return plateletPrice;
    }

    public void setPlateletPrice(Double plateletPrice) {
        this.plateletPrice = plateletPrice;
    }

    public Double getPlasmaPrice() {
        return plasmaPrice;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void setPlasmaPrice(Double plasmaPrice) {
        this.plasmaPrice = plasmaPrice;
    }

    public Enterprise getHospitalEnterprise() {
        return hospitalEnterprise;
    }

    public void setHospitalEnterprise(Enterprise hospitalEnterprise) {
        this.hospitalEnterprise = hospitalEnterprise;
    }

    public String getRedCellsComponent() {
        return redCellsComponent;
    }

    public void setRedCellsComponent(String redCellsComponent) {
        this.redCellsComponent = redCellsComponent;
    }

    public String getPlateletComponent() {
        return plateletComponent;
    }

    public void setPlateletComponent(String plateletComponent) {
        this.plateletComponent = plateletComponent;
    }

    public String getPlasmaComponent() {
        return plasmaComponent;
    }

    public void setPlasmaComponent(String plasmaComponent) {
        this.plasmaComponent = plasmaComponent;
    }
    
    @Override
    public String toString() {
        return this.patient.getPatient().getPatientName();
    }
}
