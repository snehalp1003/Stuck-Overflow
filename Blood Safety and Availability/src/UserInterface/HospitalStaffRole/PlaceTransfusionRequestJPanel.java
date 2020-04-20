/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HospitalStaffRole;

import Business.EcoSystem;
import Business.Enterprise.BloodBankEnterprise;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.OrderWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Snehal
 */
public class PlaceTransfusionRequestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private Enterprise enterprise;
    private Organization patientOrg;
    private UserAccount userAcc;
    private OrderWorkRequest workRequest;
    private Patient patient;
    /**
     * Creates new form PlaceTransfusionRequestJPanel
     */
    public PlaceTransfusionRequestJPanel(JPanel userProcessContainer, EcoSystem business, Enterprise enterprise, Organization patientOrg, UserAccount userAcc, OrderWorkRequest workRequest) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.enterprise = enterprise;
        this.patientOrg = patientOrg;
        this.userAcc = userAcc;
        this.workRequest = workRequest;
        this.patient = workRequest.getPatient().getPatient();
        populatePatientDetails();
    }

    private void populatePatientDetails() {
        nameJTextField.setText(patient.getPatientName());
        bloodGroupJTextField.setText(patient.getPatientBloodType());
        diagnosisJTextField.setText(patient.getPatientDiagnosis());
        treatmentJTextField.setText(patient.getPatientTreatment());
        plateletUnitsJTextField.setText(Integer.toString(patient.getPlateletUnits()));
        plasmaUnitsJTextField.setText(Integer.toString(patient.getPlasmaUnits()));
        redCellUnitsJTextField.setText(Integer.toString(patient.getRedCellsUnits()));
        dateBloodRequiredJTextField.setText(patient.getDateBloodRequired().toString());
        populateCompatibleBloodGroup(patient.getPatientBloodType());
    }
    
    private void populateCompatibleBloodGroup(String patientBloodGroup) {
        if (patientBloodGroup.equals("A RhD positive (A+)")) {
            compatibleBloodGroupJComboBox.addItem("A RhD positive (A+)");
            compatibleBloodGroupJComboBox.addItem("A RhD negative (A-)");
            compatibleBloodGroupJComboBox.addItem("O RhD positive (O+)");
            compatibleBloodGroupJComboBox.addItem("O RhD negative (O-)");
        } else if (patientBloodGroup.equals("A RhD negative (A-)")) {
            compatibleBloodGroupJComboBox.addItem("A RhD negative (A-)");
            compatibleBloodGroupJComboBox.addItem("O RhD negative (O-)");
        } else if (patientBloodGroup.equals("B RhD positive (B+)")) {
            compatibleBloodGroupJComboBox.addItem("B RhD positive (B+)");
            compatibleBloodGroupJComboBox.addItem("B RhD negative (B-)");
            compatibleBloodGroupJComboBox.addItem("O RhD positive (O+)");
            compatibleBloodGroupJComboBox.addItem("O RhD negative (O-)");
        } else if (patientBloodGroup.equals("B RhD negative (B-)")) {
            compatibleBloodGroupJComboBox.addItem("B RhD negative (B-)");
            compatibleBloodGroupJComboBox.addItem("O RhD negative (O-)");
        } else if (patientBloodGroup.equals("O RhD positive (O+)")) {
            compatibleBloodGroupJComboBox.addItem("O RhD positive (O+)");
            compatibleBloodGroupJComboBox.addItem("O RhD negative (O-)");
        } else if (patientBloodGroup.equals("O RhD negative (O-)")) {
            compatibleBloodGroupJComboBox.addItem("O RhD negative (O-)");
        } else if (patientBloodGroup.equals("AB RhD positive (AB+)")) {
            compatibleBloodGroupJComboBox.addItem("AB RhD positive (AB+)");
            compatibleBloodGroupJComboBox.addItem("AB RhD negative (AB-)");
            compatibleBloodGroupJComboBox.addItem("A RhD positive (A+)");
            compatibleBloodGroupJComboBox.addItem("A RhD negative (A-)");
            compatibleBloodGroupJComboBox.addItem("B RhD positive (B+)");
            compatibleBloodGroupJComboBox.addItem("B RhD negative (B-)");
            compatibleBloodGroupJComboBox.addItem("O RhD positive (O+)");
            compatibleBloodGroupJComboBox.addItem("O RhD negative (O-)");
        } else if (patientBloodGroup.equals("AB RhD negative (AB-)")) {
            compatibleBloodGroupJComboBox.addItem("AB RhD negative (AB-)");
            compatibleBloodGroupJComboBox.addItem("A RhD negative (A-)");
            compatibleBloodGroupJComboBox.addItem("B RhD negative (B-)");
            compatibleBloodGroupJComboBox.addItem("O RhD negative (O-)");
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        diagnosisJTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        bloodGroupJTextField = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        dateBloodRequiredJTextField = new javax.swing.JTextField();
        redCellUnitsJTextField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        plateletUnitsJTextField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        plasmaUnitsJTextField = new javax.swing.JTextField();
        treatmentJTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        compatibleBloodGroupJComboBox = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        bloodBanksJTable = new javax.swing.JTable();
        searchJButton = new javax.swing.JButton();
        placeOrderJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel6.setText("Blood Request");

        jLabel2.setText("Patient Name");

        nameJTextField.setEditable(false);

        jLabel15.setText("Diagnosis");

        diagnosisJTextField.setEditable(false);

        jLabel8.setText("Blood Group");

        bloodGroupJTextField.setEditable(false);

        jLabel19.setText("Date Required");

        dateBloodRequiredJTextField.setEditable(false);

        redCellUnitsJTextField.setEditable(false);

        jLabel16.setText("Red Cell Units");

        plateletUnitsJTextField.setEditable(false);

        jLabel17.setText("Platelet Units");

        jLabel18.setText("Plasma Units");

        plasmaUnitsJTextField.setEditable(false);

        treatmentJTextField.setEditable(false);

        jLabel9.setText("Treatment");

        jLabel20.setText("Search for Blood Types compatible with patient :");

        jScrollPane2.setForeground(new java.awt.Color(51, 0, 51));

        bloodBanksJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Blood Bank", "City", "Red Cell Units", "Platelet Units", "Plasma Units"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(bloodBanksJTable);

        searchJButton.setForeground(new java.awt.Color(51, 0, 51));
        searchJButton.setText("Search");
        searchJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchJButtonActionPerformed(evt);
            }
        });

        placeOrderJButton.setForeground(new java.awt.Color(51, 0, 51));
        placeOrderJButton.setText("Place Order");
        placeOrderJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderJButtonActionPerformed(evt);
            }
        });

        backJButton.setForeground(new java.awt.Color(51, 0, 51));
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(redCellUnitsJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(diagnosisJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(plateletUnitsJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(treatmentJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(bloodGroupJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(plasmaUnitsJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 59, Short.MAX_VALUE)
                                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(dateBloodRequiredJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(compatibleBloodGroupJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 207, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(placeOrderJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(207, 207, 207))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(bloodGroupJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(treatmentJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(diagnosisJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(plateletUnitsJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(redCellUnitsJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dateBloodRequiredJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(plasmaUnitsJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18)))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(compatibleBloodGroupJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(placeOrderJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(120, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchJButtonActionPerformed
        String bloodGroup = compatibleBloodGroupJComboBox.getSelectedItem().toString();
        
        DefaultTableModel model = (DefaultTableModel) bloodBanksJTable.getModel();
        model.setRowCount(0);
        
        for(Network network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise.getEnterpriseType().getValue().equals(Enterprise.EnterpriseType.BloodBank.toString())) {
                    BloodBankEnterprise bloodBank = (BloodBankEnterprise) enterprise;
                    HashMap<String, Integer> bloodBankDir = new HashMap<>();
                    bloodBankDir = bloodBank.getBloodBankDirectory();
                    int redCellUnits;
                    int plateletUnits;
                    int plasmaUnits;
                    redCellUnits = bloodBankDir.get("Red Cells - "+bloodGroup);
                    plateletUnits = bloodBankDir.get("Platelet - "+bloodGroup);
                    plasmaUnits = bloodBankDir.get("Plasma - "+bloodGroup);
                    Object[] row = new Object[6];
                    row[0] = enterprise;
                    row[1] = network;
                    row[2] = redCellUnits;
                    row[3] = plateletUnits;
                    row[4] = plasmaUnits;
                    model.addRow(row);
                }
            }
        }
    }//GEN-LAST:event_searchJButtonActionPerformed

    private void placeOrderJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderJButtonActionPerformed
        int selectedRow = bloodBanksJTable.getSelectedRow();
        if (selectedRow >= 0) {
            BloodBankEnterprise bloodBankEnterprise = (BloodBankEnterprise) bloodBanksJTable.getValueAt(selectedRow, 0);
            if ((Integer)bloodBanksJTable.getValueAt(selectedRow, 2) >= Integer.parseInt(redCellUnitsJTextField.getText()) && (Integer)bloodBanksJTable.getValueAt(selectedRow, 3) >= Integer.parseInt(plateletUnitsJTextField.getText()) && (Integer)bloodBanksJTable.getValueAt(selectedRow, 4) >= Integer.parseInt(plasmaUnitsJTextField.getText())) {
//                PlaceOrderJPanel placeOrderJPanel = new PlaceOrderJPanel(userProcessContainer, business, enterprise, patientOrg, userAcc, patient);
//                userProcessContainer.add("placeOrderJPanel", placeOrderJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Please select a Row!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_placeOrderJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ViewTransfusionRequestsJPanel vtrjp = (ViewTransfusionRequestsJPanel) component;
        vtrjp.populateTranfusionRequestsTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTable bloodBanksJTable;
    private javax.swing.JTextField bloodGroupJTextField;
    private javax.swing.JComboBox compatibleBloodGroupJComboBox;
    private javax.swing.JTextField dateBloodRequiredJTextField;
    private javax.swing.JTextField diagnosisJTextField;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JButton placeOrderJButton;
    private javax.swing.JTextField plasmaUnitsJTextField;
    private javax.swing.JTextField plateletUnitsJTextField;
    private javax.swing.JTextField redCellUnitsJTextField;
    private javax.swing.JButton searchJButton;
    private javax.swing.JTextField treatmentJTextField;
    // End of variables declaration//GEN-END:variables
}
