/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.LabSupervisorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Snehal
 */
public class LabSupervisorOrganization extends Organization{
    public LabSupervisorOrganization() {
        super(Organization.Type.LabSupervisor.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LabSupervisorRole());
        return roles;
    }
}
