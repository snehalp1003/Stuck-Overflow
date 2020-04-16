/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author Snehal
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.Type type){
        Organization organization = null;
        
       if (type.getValue().equals(Type.Doctor.getValue())){
           organization = new DoctorOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.HospitalStaff.getValue())){
           organization = new HospitalStaffOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Patient.getValue())){
           organization = new PatientOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.BloodBankStaff.getValue())){
          organization = new BloodBankStaffOrganization();
          organizationList.add(organization);
       } else if (type.getValue().equals(Type.LabSupervisor.getValue())){
          organization = new LabSupervisorOrganization();
          organizationList.add(organization);
       } else if (type.getValue().equals(Type.Donor.getValue())){
          organization = new DonorOrganization();
          organizationList.add(organization);
       }
       
        return organization;
    }
}
