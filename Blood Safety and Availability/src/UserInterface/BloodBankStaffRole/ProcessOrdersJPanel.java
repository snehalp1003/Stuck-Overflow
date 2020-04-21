/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.BloodBankStaffRole;

import Business.EcoSystem;
import Business.Enterprise.BloodBankEnterprise;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Snehal
 */
public class ProcessOrdersJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private Enterprise enterprise;
    private Organization organization;
    private UserAccount userAcc;
    BloodBankEnterprise bloodBank;
    HashMap<String, Integer> bloodBankDir;

    /**
     * Creates new form ProcessOrdersJPanel
     */
    public ProcessOrdersJPanel(JPanel userProcessContainer, EcoSystem business, Enterprise enterprise, Organization organization, UserAccount userAcc) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.enterprise = enterprise;
        this.organization = organization;
        this.userAcc = userAcc;

        bloodBank = (BloodBankEnterprise) enterprise;
        bloodBankDir = bloodBank.getBloodBankDirectory();
        populateBloodBankDirectoryTable();
        populateOrderTable();
    }

    private void populateBloodBankDirectoryTable() {
        String bloodGroups[] = {"AB RhD positive (AB+)", "AB RhD negative (AB-)", "A RhD positive (A+)", "A RhD negative (A-)", "B RhD positive (B+)", "B RhD negative (B-)", "O RhD positive (O+)", "O RhD negative (O-)"};
        DefaultTableModel model = (DefaultTableModel) bloodBankDirJTable.getModel();

        model.setRowCount(0);
        for (int i = 0; i < bloodGroups.length; i++) {
            Object[] row = new Object[4];
            row[0] = bloodGroups[i];
            row[1] = bloodBankDir.get("Red Cells - " + bloodGroups[i]);
            row[2] = bloodBankDir.get("Platelet - " + bloodGroups[i]);
            row[3] = bloodBankDir.get("Plasma - " + bloodGroups[i]);
            model.addRow(row);
        }
    }

    private void populateOrderTable() {
        DefaultTableModel model = (DefaultTableModel) orderJTable.getModel();
        model.setRowCount(0);
        for (WorkRequest workRequest : business.getWorkQueue().getWorkRequestList()) {
            if (workRequest.getEnterpriseForRedCellUnits() != null && workRequest.getEnterpriseForRedCellUnits().equals(bloodBank) && (workRequest.getBloodBankStaffForRedCellUnits().equals(userAcc) || workRequest.getBloodBankStaffForRedCellUnits() == null)) {
                Object[] row = new Object[7];
                row[0] = workRequest.getHospitalEnterprise();
                row[1] = workRequest;
                row[2] = workRequest.getRedCellsComponent();
                row[3] = bloodBank.getBloodBankPrices().get("Red Cells Unit Price");
                row[4] = workRequest.getRedCellsUnits();
                row[5] = workRequest.getRedCellsPrice();
                row[6] = workRequest.getRequestStatusForRedCellUnits();
                model.addRow(row);
            }
            if (workRequest.getEnterpriseForPlateletUnits() != null && workRequest.getEnterpriseForPlateletUnits().equals(bloodBank) && (workRequest.getBloodBankStaffForPlateletUnits().equals(userAcc) || workRequest.getBloodBankStaffForPlateletUnits()== null)) {
                Object[] row = new Object[7];
                row[0] = workRequest.getHospitalEnterprise();
                row[1] = workRequest;
                row[2] = workRequest.getPlateletComponent();
                row[3] = bloodBank.getBloodBankPrices().get("Platelet Unit Price");
                row[4] = workRequest.getPlateletUnits();
                row[5] = workRequest.getPlateletPrice();
                row[6] = workRequest.getRequestStatusForPlateletUnits();
                model.addRow(row);
            }
            if (workRequest.getEnterpriseForPlasmaUnits()!= null && workRequest.getEnterpriseForPlasmaUnits().equals(bloodBank) && (workRequest.getBloodBankStaffForPlasmaUnits().equals(userAcc) || workRequest.getBloodBankStaffForPlasmaUnits()== null)) {
                Object[] row = new Object[7];
                row[0] = workRequest.getHospitalEnterprise();
                row[1] = workRequest;
                row[2] = workRequest.getPlasmaComponent();
                row[3] = bloodBank.getBloodBankPrices().get("Plasma Unit Price");
                row[4] = workRequest.getPlasmaUnits();
                row[5] = workRequest.getPlasmaPrice();
                row[6] = workRequest.getRequestStatusForPlasmaUnits();
                model.addRow(row);
            }
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
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        bloodBankDirJTable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        orderJTable = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        processOrderJButton = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 51));
        jLabel7.setText("Blood Bank Directory");

        jScrollPane2.setForeground(new java.awt.Color(51, 0, 51));

        bloodBankDirJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Blood Group", "Red Cell Units", "Platelet Units", "Plasma Units"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(bloodBankDirJTable);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 51));
        jLabel8.setText("Orders");

        jScrollPane3.setForeground(new java.awt.Color(51, 0, 51));

        orderJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Hospital", "Patient Name", "Component Needed", "Price per Unit", "No. of Units", "Total", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(orderJTable);
        if (orderJTable.getColumnModel().getColumnCount() > 0) {
            orderJTable.getColumnModel().getColumn(0).setPreferredWidth(20);
            orderJTable.getColumnModel().getColumn(3).setPreferredWidth(15);
            orderJTable.getColumnModel().getColumn(4).setPreferredWidth(15);
            orderJTable.getColumnModel().getColumn(5).setPreferredWidth(15);
        }

        backJButton.setForeground(new java.awt.Color(51, 0, 51));
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        processOrderJButton.setForeground(new java.awt.Color(51, 0, 51));
        processOrderJButton.setText("Process order");
        processOrderJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processOrderJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1017, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1017, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(processOrderJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(175, 175, 175))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(processOrderJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(174, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void processOrderJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processOrderJButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) orderJTable.getModel();
        int selectedRow = orderJTable.getSelectedRow();
        if (selectedRow >= 0 && model.getValueAt(selectedRow, 5).toString().contains("Order placed for")) {
            WorkRequest selectedWorkRequest = (WorkRequest) orderJTable.getValueAt(selectedRow, 1);
            if(selectedWorkRequest.getBloodBankStaffForRedCellUnits() == null) {
                
            } 
        } else {
            JOptionPane.showMessageDialog(null, "Please select an order which is not processed!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_processOrderJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTable bloodBankDirJTable;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable orderJTable;
    private javax.swing.JButton processOrderJButton;
    // End of variables declaration//GEN-END:variables
}
