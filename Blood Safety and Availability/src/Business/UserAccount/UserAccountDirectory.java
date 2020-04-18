/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Donor.Donor;
import Business.Employee.Employee;
import Business.Patient.Patient;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Snehal
 */
public class UserAccountDirectory {

    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public UserAccount authenticateUser(String username, String password) {
        for (UserAccount ua : userAccountList) {
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }

    public UserAccount createUserAccount(String username, String password, Employee employee, Patient patient, Donor donor, Role role) {
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setPatient(patient);
        userAccount.setDonor(donor);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }

    public boolean checkIfUsernameIsUnique(String username) {
        for (UserAccount ua : userAccountList) {
            if (ua.getUsername().equals(username)) {
                return false;
            }
        }
        return true;
    }

    public UserAccount changeUserPassword(String username, String oldPassword, String newPassword) {
        for (UserAccount ua : userAccountList) {
            if (ua.getUsername().equals(username) && ua.getPassword().equals(oldPassword)) {
                ua.setPassword(newPassword);
                return ua;
            }
        }
        return null;
    }
}
