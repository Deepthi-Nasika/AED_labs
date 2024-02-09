/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface;

import business.Account;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author nasik
 */
public class ViewAccountJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Account account;
    /**
     * Creates new form ViewAccountJPanel
     */
    ViewAccountJPanel(JPanel userProcessContainer, Account account) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        populateAccountDetails();
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
    }
    
    private void populateAccountDetails() {
        txtRoutingNumber.setText(account.getRoutingNumber());
        txtAccountNumber.setText(account.getAccountNumber());
        txtBankName.setText(account.getBankName());
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeader = new javax.swing.JLabel();
        lblRoutingNumber = new javax.swing.JLabel();
        lblAccountNumber = new javax.swing.JLabel();
        lblBankName = new javax.swing.JLabel();
        txtRoutingNumber = new javax.swing.JTextField();
        txtAccountNumber = new javax.swing.JTextField();
        txtBankName = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));

        lblHeader.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("View Account");

        lblRoutingNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRoutingNumber.setText("Routing Number:");

        lblAccountNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAccountNumber.setText("Account Number:");

        lblBankName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBankName.setText("Bank Name:");

        txtRoutingNumber.setEnabled(false);

        txtAccountNumber.setEnabled(false);
        txtAccountNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAccountNumberActionPerformed(evt);
            }
        });

        txtBankName.setEnabled(false);

        btnBack.setText("<< Back");
        btnBack.setBorder(null);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.setBorder(null);
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.setBorder(null);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 809, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRoutingNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBankName, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBankName, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRoutingNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(224, 224, 224))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtRoutingNumber)
                    .addComponent(lblRoutingNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAccountNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBankName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBankName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(368, 368, 368))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtAccountNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAccountNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAccountNumberActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        txtRoutingNumber.setEnabled(true);
        txtAccountNumber.setEnabled(true);
        txtBankName.setEnabled(true);
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if (txtRoutingNumber.getText().isEmpty() || txtAccountNumber.getText().isEmpty() || txtBankName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter the data in all fields", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Exit method if any field is empty
        }
        
        // Validate routing number has 9 digits only
        if (!txtRoutingNumber.getText().matches("\\d{9}")){
            JOptionPane.showMessageDialog(null, "Enter valid 9-digit routing number", "Error", JOptionPane.ERROR_MESSAGE);
            return; 
        }
        
        // Validate account number
        if (!txtAccountNumber.getText().matches("^[0-9]{10}$")){
            JOptionPane.showMessageDialog(null, "Enter valid 10-digit account number", "Error", JOptionPane.ERROR_MESSAGE);
            return; 
        }
        
        // Validate bank name does not contain integers
        if (txtBankName.getText().matches(".*\\d.*")) {
            JOptionPane.showMessageDialog(null, "Enter valid bank name", "Error", JOptionPane.ERROR_MESSAGE);
            return; 
        }
        
        account.setRoutingNumber(txtRoutingNumber.getText());
        account.setAccountNumber(txtAccountNumber.getText());
        account.setBankName(txtBankName.getText());
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);

        JOptionPane.showMessageDialog(null, "Account updated successfully");
        txtRoutingNumber.setEnabled(false);
        txtAccountNumber.setEnabled(false);
        txtBankName.setEnabled(false);
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel lblAccountNumber;
    private javax.swing.JLabel lblBankName;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblRoutingNumber;
    private javax.swing.JTextField txtAccountNumber;
    private javax.swing.JTextField txtBankName;
    private javax.swing.JTextField txtRoutingNumber;
    // End of variables declaration//GEN-END:variables

}