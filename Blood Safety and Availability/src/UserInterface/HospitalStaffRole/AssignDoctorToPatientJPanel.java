/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HospitalStaffRole;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Snehal
 */
public class AssignDoctorToPatientJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private Organization patientOrg;
    private UserAccount userAcc;
    private Patient patient;
    private Patient updatedPatient;
    private UserAccount updatedPatientUserAccount;
    private Organization doctorOrg;

    /**
     * Creates new form AssignDoctorToPatientJPanel
     */
    public AssignDoctorToPatientJPanel(JPanel userProcessContainer, Enterprise enterprise, Organization patientOrg, UserAccount userAcc, Patient patient) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.patientOrg = patientOrg;
        this.userAcc = userAcc;
        this.patient = patient;
        updatedPatient = this.patient;
        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (org.getName().contains("Doctor")) {
                doctorOrg = org;
            }
        }
        populateUserDetails();
        populateDoctors();
        assignStaffJTextField.setText(userAcc.getEmployee().toString());
    }
    
    
   /*  private boolean HeightPatternCorrect(){
     
        Pattern p = Pattern.compile("\\d{2,3}\\.\\d{,2}");
        Matcher m=p.matcher(patientHeightJTextField.getText());
        boolean b = m.matches();
        return b;
    }
     
     private boolean WeightPatternCorrect(){
     
        Pattern p = Pattern.compile("\\d{2,3}\\.\\d{,3}");
        Matcher m=p.matcher(patientWeightJTextField.getText());
        boolean b = m.matches();
        return b;
    }
     
      private boolean LowBPPatternCorrect(){
     
        Pattern p = Pattern.compile("^\\d+$");
        Matcher m=p.matcher(patientLowBPJTextField.getText());
        boolean b = m.matches();
        return b;
    }
     
      private boolean HighBPPatternCorrect(){
     
        Pattern p = Pattern.compile("^\\d+$");
        Matcher m=p.matcher(patientHighBPJTextField.getText());
        boolean b = m.matches();
        return b;
    }
       private boolean TempPatternCorrect(){
     
        Pattern p = Pattern.compile("\\d{2,3}\\.\\d{,2}");
        Matcher m=p.matcher(patientTemperatureJTextField.getText());
        boolean b = m.matches();
        return b;
    }*/
      
     
    

    private void populateUserDetails() {
        nameJTextField.setText(patient.getPatientName());
        contactNoJTextField.setText(patient.getPatientContact().toString());
        patientGenderJTextField.setText(patient.getPatientGender());
        dateOfBirthJTextField.setText(patient.getPatientDOB().toString());
        bloodGroupJTextField.setText(patient.getPatientBloodType());
        dateOfAdmitJTextField.setText(patient.getPatientAdmitDate().toString());
        if (patient.getPatientHeight() != null) {
            patientHeightJTextField.setText(patient.getPatientHeight().toString());
        } else {
            patientHeightJTextField.setText("");
        }
        if (patient.getPatientWeight() != null) {
            patientWeightJTextField.setText(patient.getPatientWeight().toString());
        } else {
            patientWeightJTextField.setText("");
        }
        if (patient.getPatientLowBP() != null) {
            patientLowBPJTextField.setText(patient.getPatientLowBP().toString());
        } else {
            patientLowBPJTextField.setText("");
        }
        if (patient.getPatientHeartRate() != null) {
            patientHeartRateJTextField.setText(patient.getPatientHeartRate().toString());
        } else {
            patientHeartRateJTextField.setText("");
        }
        if (patient.getPatientHighBP() != null) {
            patientHighBPJTextField.setText(patient.getPatientHighBP().toString());
        } else {
            patientHighBPJTextField.setText("");
        }
        if (patient.getPatientTemperature() != null) {
            patientTemperatureJTextField.setText(patient.getPatientTemperature().toString());
        } else {
            patientTemperatureJTextField.setText("");
        }
        if (patient.getAssignedDoctor() != null) {
            assignDoctorJComboBox.setSelectedItem(patient.getAssignedDoctor());
        } else {
            assignDoctorJComboBox.setSelectedItem("");
        }

    }

    private void populateDoctors() {
        for (Employee doctor : doctorOrg.getEmployeeDirectory().getEmployeeList()) {
            assignDoctorJComboBox.addItem(doctor);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backJButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        dateOfAdmitJTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        contactNoJTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        SaveJButton = new javax.swing.JButton();
        bloodGroupJTextField = new javax.swing.JTextField();
        dateOfBirthJTextField = new javax.swing.JTextField();
        patientGenderJTextField = new javax.swing.JTextField();
        patientHeightJTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        patientWeightJTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        patientHighBPJTextField = new javax.swing.JTextField();
        patientLowBPJTextField = new javax.swing.JTextField();
        patientHeartRateJTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        patientTemperatureJTextField = new javax.swing.JTextField();
        assignDoctorJComboBox = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        assignStaffJTextField = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        backJButton.setForeground(new java.awt.Color(51, 0, 51));
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel6.setText("Patient Details & Vitals");

        jLabel2.setText("Patient Name");

        nameJTextField.setEditable(false);

        jLabel3.setText("Admission Date");

        dateOfAdmitJTextField.setEditable(false);

        jLabel4.setText("Gender");

        jLabel5.setText("Date of Birth");

        contactNoJTextField.setEditable(false);

        jLabel7.setText("Contact No.");

        jLabel8.setText("Blood Group");

        SaveJButton.setForeground(new java.awt.Color(51, 0, 51));
        SaveJButton.setText("Save");
        SaveJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveJButtonActionPerformed(evt);
            }
        });

        bloodGroupJTextField.setEditable(false);

        dateOfBirthJTextField.setEditable(false);

        patientGenderJTextField.setEditable(false);

        jLabel9.setText("Height (cms)");

        jLabel10.setText("Weight (lbs)");

        jLabel11.setText("Low BP");

        jLabel12.setText("High BP");

        jLabel13.setText("Heart Rate");

        jLabel14.setText("Temperature (F)");

        jLabel15.setText("Assign Doctor");

        jLabel16.setText("Assign Staff");

        assignStaffJTextField.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(patientLowBPJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(patientHighBPJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(patientHeartRateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(dateOfBirthJTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(dateOfAdmitJTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(patientWeightJTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                                .addComponent(patientGenderJTextField))
                            .addComponent(patientTemperatureJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(assignDoctorJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(185, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(contactNoJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(31, 31, 31)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bloodGroupJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(patientHeightJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(assignStaffJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(backJButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SaveJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(487, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(patientGenderJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bloodGroupJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateOfBirthJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactNoJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3)
                    .addComponent(dateOfAdmitJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientHeightJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(patientWeightJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientLowBPJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(patientHeartRateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientHighBPJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14)
                    .addComponent(patientTemperatureJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SaveJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(assignDoctorJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)
                        .addComponent(jLabel16)
                        .addComponent(assignStaffJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ViewPatientsJPanel vpjp = (ViewPatientsJPanel) component;
        vpjp.populatePatientTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void SaveJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveJButtonActionPerformed
        Double height = Double.parseDouble(patientHeightJTextField.getText());
        if (height == null || patientHeightJTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter valid patient's height !");
            return;
        }
        
        Double weight = Double.parseDouble(patientWeightJTextField.getText());
        if (weight == null || patientWeightJTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter valid patient's weight !");
            return;
        }
        Double lowBP = Double.parseDouble(patientLowBPJTextField.getText());
        if (lowBP == null || patientLowBPJTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter patient's valid low blood pressure !");
            return;
        }
        Double highBP = Double.parseDouble(patientHighBPJTextField.getText());
        if (highBP == null || patientHighBPJTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter patient's high blood pressure !");
            return;
        }
        Double heartRate = Double.parseDouble(patientHeartRateJTextField.getText());
        if (heartRate == null || patientHeartRateJTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter patient's valid heart rate !");
            return;
        }
        Double temperature = Double.parseDouble(patientTemperatureJTextField.getText());
        if (temperature == null || patientTemperatureJTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter patient's valid temperature !");
            return;
        }
        Employee doctor = (Employee) assignDoctorJComboBox.getSelectedItem();
        if (doctor == null) {
            JOptionPane.showMessageDialog(null, "Please select a doctor !");
            return;
        }

        Employee staff = userAcc.getEmployee();
        if (staff == null) {
            JOptionPane.showMessageDialog(null, "Please select a staff !");
            return;
        }

        for (UserAccount patientUserAcc : patientOrg.getUserAccountDirectory().getUserAccountList()) {

            if (patient.getPatientName().equals(patientUserAcc.getPatient().getPatientName()) && patient.getPatientAdmitDate().equals(patientUserAcc.getPatient().getPatientAdmitDate()) && patient.getPatientDOB().equals(patientUserAcc.getPatient().getPatientDOB()) && patient.getPatientGender().equals(patientUserAcc.getPatient().getPatientGender()) && patient.getPatientBloodType().equals(patientUserAcc.getPatient().getPatientBloodType()) && patient.getPatientContact().equals(patientUserAcc.getPatient().getPatientContact())) {
                updatedPatientUserAccount = patientUserAcc;
            }
        }

        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (org.getPatientDirectory().getPatientList() != null && org.getPatientDirectory().getPatientList().contains(updatedPatient)) {
                org.getPatientDirectory().getPatientList().remove(updatedPatient);
                org.getUserAccountDirectory().getUserAccountList().remove(updatedPatientUserAccount);

                updatedPatient.setPatientHeight(height);
                updatedPatient.setPatientWeight(weight);
                updatedPatient.setPatientLowBP(lowBP);
                updatedPatient.setPatientHighBP(highBP);
                updatedPatient.setPatientHeartRate(heartRate);
                updatedPatient.setPatientTemperature(temperature);
                updatedPatient.setAssignedDoctor(doctor);
                updatedPatient.setAssignedStaff(staff);
                updatedPatient.setPatientStatus("Doctor Assigned");

                updatedPatientUserAccount.setPatient(updatedPatient);

                org.getPatientDirectory().getPatientList().add(updatedPatient);
                org.getUserAccountDirectory().getUserAccountList().add(updatedPatientUserAccount);
                JOptionPane.showMessageDialog(null, "Saved patient vitals !");                    
            }
        }
    }//GEN-LAST:event_SaveJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SaveJButton;
    private javax.swing.JComboBox assignDoctorJComboBox;
    private javax.swing.JTextField assignStaffJTextField;
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField bloodGroupJTextField;
    private javax.swing.JTextField contactNoJTextField;
    private javax.swing.JTextField dateOfAdmitJTextField;
    private javax.swing.JTextField dateOfBirthJTextField;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JTextField patientGenderJTextField;
    private javax.swing.JTextField patientHeartRateJTextField;
    private javax.swing.JTextField patientHeightJTextField;
    private javax.swing.JTextField patientHighBPJTextField;
    private javax.swing.JTextField patientLowBPJTextField;
    private javax.swing.JTextField patientTemperatureJTextField;
    private javax.swing.JTextField patientWeightJTextField;
    // End of variables declaration//GEN-END:variables
}
