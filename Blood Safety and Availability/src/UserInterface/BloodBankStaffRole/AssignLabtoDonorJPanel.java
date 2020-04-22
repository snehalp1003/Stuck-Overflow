/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.BloodBankStaffRole;

import Business.Donor.Donor;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author HP
 */
public class AssignLabtoDonorJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private Organization donorOrg;
    private UserAccount userAcc;
    private Donor donor;
    private Donor updateddonor;
    private UserAccount updatedDonorUserAccount;
    private Organization LabOrg;

    public AssignLabtoDonorJPanel(JPanel userProcessContainer, Enterprise enterprise, Organization donorOrg, UserAccount userAcc, Donor donor) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.donorOrg = donorOrg;
        this.userAcc = userAcc;
        this.donor = donor;
        updateddonor = this.donor;
        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (org.getName().contains("Lab Supervisor")) {
                LabOrg = org;
            }
        }
        populateUserDetails();
        populateLab();
        assignStaffJTextField.setText(userAcc.getEmployee().toString());

    }
    
    private boolean HeartRatePatternCorrect() {

        String ht = heartRatejTextField.getText();
//        Pattern p = Pattern.compile("^[0-9]+\\.[0-9]+$");
        Pattern p = Pattern.compile("^[0-9]+$");
        Matcher m = p.matcher(ht);
        boolean b = m.matches();
        return b;
    }
    
     private boolean TempPatternCorrect() {

        String ht = tempjTextField.getText();
//        Pattern p = Pattern.compile("^[0-9]+\\.[0-9]+$");
        Pattern p = Pattern.compile("^[0-9]+$");
        Matcher m = p.matcher(ht);
        boolean b = m.matches();
        return b;
    }
     
      private boolean LowBPPatternCorrect() {

        String ht = bloodPressjTextField.getText();
//        Pattern p = Pattern.compile("^[0-9]+\\.[0-9]+$");
        Pattern p = Pattern.compile("^[0-9]+$");
        Matcher m = p.matcher(ht);
        boolean b = m.matches();
        return b;
    }
      
       private boolean HighBPPatternCorrect() {

        String ht = highBPJTextFeild.getText();
//        Pattern p = Pattern.compile("^[0-9]+\\.[0-9]+$");
        Pattern p = Pattern.compile("^[0-9]+$");
        Matcher m = p.matcher(ht);
        boolean b = m.matches();
        return b;
    }


    private void populateUserDetails() {
        nameJTextField.setText(donor.getDonorName());
        contactNoJTextField.setText(donor.getContact());
        donorGenderJTextField.setText(donor.getGender());
        dateOfBirthJTextField.setText(donor.getDOB().toString());
        bloodGroupJTextField.setText(donor.getDonorBloodType());
        dateOfregJTextField.setText(donor.getDonorRegisteredDate().toString());
        HeightJTextField.setText(donor.getDonorHeight().toString());
        WeightJTextField.setText(donor.getDonorWeight().toString());

        if (donor.getDonorHeartRate() != null) {
            heartRatejTextField.setText(donor.getDonorHeartRate().toString());
        } else {
            heartRatejTextField.setText("");
        }

        if (donor.getDonorBP() != null) {
            bloodPressjTextField.setText(donor.getDonorBP().toString());
        } else {
            bloodPressjTextField.setText("");
            
        if(donor.getHighDonorBP() != null)
        {
            highBPJTextFeild.setText(donor.getHighDonorBP().toString());
        }
        else
        {
            highBPJTextFeild.setText("");
        }
            
        }
        if (donor.getDonorTemp() != null) {
            tempjTextField.setText(donor.getDonorTemp().toString());
        } else {
            tempjTextField.setText("");
        }
        if (donor.getDonorEligibility() != null) {
            DonationjComboBox.setSelectedItem(donor.getDonorEligibility());
        } else {
            DonationjComboBox.setSelectedItem("");
        }
        if (donor.getAssignedLab() != null) {
            assignLabJComboBox.setSelectedItem(donor.getAssignedLab());
        } else {
            assignLabJComboBox.setSelectedItem("");
        }
    }

    private void populateLab() {
        for (Employee lab : LabOrg.getEmployeeDirectory().getEmployeeList()) {
            assignLabJComboBox.addItem(lab);
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
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        donorGenderJTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        bloodGroupJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dateOfBirthJTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        WeightJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        dateOfregJTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        contactNoJTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        HeightJTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        heartRatejTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        bloodPressjTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tempjTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        assignStaffJTextField = new javax.swing.JTextField();
        SavejButton = new javax.swing.JButton();
        BackjButton = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        assignLabJComboBox = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        highBPJTextFeild = new javax.swing.JTextField();
        DonationjComboBox = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(51, 0, 51));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 51));
        jLabel6.setText("Donor Details & Vitals");

        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setText("Name");

        nameJTextField.setEditable(false);

        jLabel4.setText("Gender");

        donorGenderJTextField.setEditable(false);

        jLabel8.setText("Blood Group");

        bloodGroupJTextField.setEditable(false);

        jLabel5.setText("Date of Birth");

        dateOfBirthJTextField.setEditable(false);

        jLabel7.setText("Contact No.");

        WeightJTextField.setEditable(false);

        jLabel3.setText("Registration Date");

        dateOfregJTextField.setEditable(false);

        jLabel1.setText("Height (cms)");

        contactNoJTextField.setEditable(false);

        jLabel9.setText("Weight (lbs)");

        HeightJTextField.setEditable(false);

        jLabel10.setText("Heart Rate");

        jLabel11.setText("Low BP");

        jLabel12.setText("Temperature (F)");

        jLabel13.setText("Assign Staff");

        jLabel14.setText("Assign Lab Supervisor");

        assignStaffJTextField.setEditable(false);

        SavejButton.setText("Save");
        SavejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavejButtonActionPerformed(evt);
            }
        });

        BackjButton.setText("<< Back");
        BackjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackjButtonActionPerformed(evt);
            }
        });

        jLabel15.setText("Donation Eligibility");

        jLabel16.setText("High BP");

        DonationjComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "YES", "NO" }));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/drop (1) (1) (1).jpg"))); // NOI18N
        jLabel18.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(51, 0, 51)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BackjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                            .addComponent(bloodGroupJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(contactNoJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel10)
                                .addComponent(jLabel11)
                                .addComponent(jLabel15)
                                .addComponent(jLabel13))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(assignStaffJTextField)
                                .addComponent(DonationjComboBox, 0, 225, Short.MAX_VALUE)
                                .addComponent(bloodPressjTextField)
                                .addComponent(heartRatejTextField)
                                .addComponent(HeightJTextField)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dateOfBirthJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateOfregJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(donorGenderJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(SavejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                            .addComponent(assignLabJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(jLabel12)
                                .addComponent(jLabel16))
                            .addGap(58, 58, 58)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(WeightJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                                .addComponent(tempjTextField)
                                .addComponent(highBPJTextFeild)))))
                .addGap(97, 97, 97))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(donorGenderJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bloodGroupJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateOfBirthJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(dateOfregJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(contactNoJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(WeightJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tempjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(highBPJTextFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(assignLabJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(heartRatejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel12))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bloodPressjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel16)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(HeightJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(DonationjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(assignStaffJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SavejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 272, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BackjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackjButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ViewDonorsJPanel vdjp = (ViewDonorsJPanel) component;
        vdjp.populateDonorTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_BackjButtonActionPerformed

    private void SavejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavejButtonActionPerformed
        // TODO add your handling code here:

        
        if (HeartRatePatternCorrect())
        {
            try
            {
                Double.parseDouble(heartRatejTextField.getText());
            }
            catch(NumberFormatException nfe)
            {
                JOptionPane.showMessageDialog(null, "Please enter valid donor's heart rate in numbers !");
            }
            catch (Exception e)
            {
                  JOptionPane.showMessageDialog(null, "Please enter valid donor's heart rate in numbers !");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please enter valid donor's heart rate !");
        }
        
        
        if (TempPatternCorrect())
        {
            try
            {
                Double.parseDouble(tempjTextField.getText());
            }
            catch(NumberFormatException nfe)
            {
                JOptionPane.showMessageDialog(null, "Please enter valid donor's temparature in numbers !");
            }
            catch (Exception e)
            {
                  JOptionPane.showMessageDialog(null, "Please enter valid donor's temparature in numbers !");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please enter valid donor's temparature !");
        }
        
        
        if (LowBPPatternCorrect())
        {
            try
            {
                Double.parseDouble(bloodPressjTextField.getText());
            }
            catch(NumberFormatException nfe)
            {
                JOptionPane.showMessageDialog(null, "Please enter valid donor's low BP in numbers !");
            }
            catch (Exception e)
            {
                  JOptionPane.showMessageDialog(null, "Please enter valid donor's low BP in numbers !");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please enter valid donor's low BP !");
        }
        
        if (HighBPPatternCorrect())
        {
            try
            {
                Double.parseDouble(highBPJTextFeild.getText());
            }
            catch(NumberFormatException nfe)
            {
                JOptionPane.showMessageDialog(null, "Please enter valid donor's high BP in numbers !");
            }
            catch (Exception e)
            {
                  JOptionPane.showMessageDialog(null, "Please enter valid donor's high BP in numbers !");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please enter valid donor's high BP !");
        }
        
        
        
      /*  if (BP == null || bloodPressjTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter donor's low blood pressure !");
            return;
        }*/
        
        
     /*   if(highBP == null || highBPJTextFeild.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please enter donor's high blood pressure !");
             return;
        }*/
        
                
        

        
    /*    if (HR == null || heartRatejTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter donor's  heart rate !");
            return;
        }*/

        
      /*  if (temp == null || tempjTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter donor's temparature in Farenheit !");
            return;
        }*/

        String status = (String) DonationjComboBox.getSelectedItem();
        if (status == null || status.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please select Donor eligibility!");
            return;
        }
        Employee lab = (Employee) assignLabJComboBox.getSelectedItem();
        if (lab == null) {
            JOptionPane.showMessageDialog(null, "Please select a Lab Supervisor !");
            return;
        }

        Employee staff = userAcc.getEmployee();
        if (staff == null) {
            JOptionPane.showMessageDialog(null, "Please select a Blood Bank staff !");
            return;
        }
        if(status.matches("NO"))
        {
            JOptionPane.showMessageDialog(null, "Cannot accept Donor");
            return;
        }
        Double BP = Double.parseDouble(bloodPressjTextField.getText());
        Double highBP = Double.parseDouble(highBPJTextFeild.getText());
        Double HR = Double.parseDouble(heartRatejTextField.getText());
        Double temp = Double.parseDouble(tempjTextField.getText());
       

        for (UserAccount donorUserAcc : donorOrg.getUserAccountDirectory().getUserAccountList()) {
            if (donor.getDonorName().equals(donorUserAcc.getDonor().getDonorName())
                    && donor.getGender().equals(donorUserAcc.getDonor().getGender())
                    && donor.getDonorBloodType().equals(donorUserAcc.getDonor().getDonorBloodType())
                    && donor.getDOB().equals(donorUserAcc.getDonor().getDOB())
                    && donor.getContact().equals(donorUserAcc.getDonor().getContact())
                   // && donor.getDonorRegisteredDate().equals(donorUserAcc.getDonor().getDonorRegisteredDate())
                    && donor.getDonorWeight().equals(donorUserAcc.getDonor().getDonorWeight())
                    && donor.getDonorHeight().equals(donorUserAcc.getDonor().getDonorHeight())) {
                updatedDonorUserAccount = donorUserAcc;
            }
        }
        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (org.getDonorDirectory().getDonorList() != null && org.getDonorDirectory().getDonorList().contains(updateddonor)) {
                org.getDonorDirectory().getDonorList().remove(updateddonor);
                org.getUserAccountDirectory().getUserAccountList().remove(updatedDonorUserAccount);
                updateddonor.setDonorHeartRate(HR);
                updateddonor.setDonorBP(BP);
                updateddonor.setHighDonorBP(highBP);
                updateddonor.setDonorTemp(temp);
                updateddonor.setDonorEligibility(status.toUpperCase());
                updateddonor.setAssignedLab(lab);
                updateddonor.setAssignedStaff(staff);
                updatedDonorUserAccount.setDonor(updateddonor);

                org.getDonorDirectory().getDonorList().add(updateddonor);
                org.getUserAccountDirectory().getUserAccountList().add(updatedDonorUserAccount);

                JOptionPane.showMessageDialog(null, "Saved donor vitals !");

            }
        }
    }//GEN-LAST:event_SavejButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackjButton;
    private javax.swing.JComboBox<String> DonationjComboBox;
    private javax.swing.JTextField HeightJTextField;
    private javax.swing.JButton SavejButton;
    private javax.swing.JTextField WeightJTextField;
    private javax.swing.JComboBox assignLabJComboBox;
    private javax.swing.JTextField assignStaffJTextField;
    private javax.swing.JTextField bloodGroupJTextField;
    private javax.swing.JTextField bloodPressjTextField;
    private javax.swing.JTextField contactNoJTextField;
    private javax.swing.JTextField dateOfBirthJTextField;
    private javax.swing.JTextField dateOfregJTextField;
    private javax.swing.JTextField donorGenderJTextField;
    private javax.swing.JTextField heartRatejTextField;
    private javax.swing.JTextField highBPJTextFeild;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JTextField tempjTextField;
    // End of variables declaration//GEN-END:variables
}
