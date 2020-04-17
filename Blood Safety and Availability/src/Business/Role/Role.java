/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Snehal
 */
public abstract class Role {
    public enum RoleType{
        HospitalAdminRole("Hospital Admin"),
        BloodBankAdminRole("Blood Bank Admin"),
        HospitalStaffRole("Hospital Staff"),
        BloodBankStaffRole("Blood Bank Staff"),
        LabSupervisorRole("Lab Supervisor"),
        DoctorRole("Doctor"),
        DonorRole("Donor"),
        PatientRole("Patient");

        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business);

    @Override
    public String toString() {
        String roleName = this.getClass().getName();
        switch(roleName) {
            case "HospitalAdminRole": return "Hospital Admin";
            case "BloodBankAdminRole": return "Blood Bank Admin";
            case "Business.Role.BloodBankStaffRole": return "Blood Bank Staff";
            case "Business.Role.DoctorRole": return "Doctor";
            case "Business.Role.DonorRole": return "Donor";
            case "Business.Role.HospitalStaffRole": return "Hospital Staff";
            case "Business.Role.LabSupervisorRole": return "Lab Supervisor";
            case "Business.Role.PatientRole": return "Patient";
            default: return roleName;                
        }
    }
}
