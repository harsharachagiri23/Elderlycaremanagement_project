/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.GrocerAdminRole;

import Business.EcoSystem;
import Business.Grocer.Grocer;
import Business.Grocer.GrocerDirectory;

import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author grees
 */
public class ModifyStoreInfoJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ModifyStoreInfoJPanel
     */
     private JPanel userProcessContainer;
    private EcoSystem ecoSystem;
    private GrocerDirectory grocerDirectory;
    private Grocer grocer;
    public ModifyStoreInfoJPanel(JPanel userProcessContainer, EcoSystem ecoSystem, GrocerDirectory grocerDirectory, Grocer grocer) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.grocer = grocer;
        this.grocerDirectory = ecoSystem.getGrocerDirectory();
       RestNameText.setText(grocer.getGrocerName());
        RestAddText.setText(grocer.getAddress());
        PhoneText.setText(grocer.getPhoneNum());
        ManNameText.setText(grocer.getManagerName());
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
        jLabel1 = new javax.swing.JLabel();
        restNameLab = new javax.swing.JLabel();
        RestAddressLab = new javax.swing.JLabel();
        RestPhoneLab = new javax.swing.JLabel();
        ManNameLab = new javax.swing.JLabel();
        RestNameText = new javax.swing.JTextField();
        RestAddText = new javax.swing.JTextField();
        PhoneText = new javax.swing.JTextField();
        ManNameText = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        backButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("Update Grocery Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 55, -1, -1));

        restNameLab.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        restNameLab.setForeground(new java.awt.Color(0, 102, 204));
        restNameLab.setText("Restaurant Name:");
        jPanel1.add(restNameLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 146, -1, -1));

        RestAddressLab.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        RestAddressLab.setForeground(new java.awt.Color(0, 102, 204));
        RestAddressLab.setText("Address:");
        jPanel1.add(RestAddressLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 185, -1, -1));

        RestPhoneLab.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        RestPhoneLab.setForeground(new java.awt.Color(0, 102, 204));
        RestPhoneLab.setText("Phone:");
        jPanel1.add(RestPhoneLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 215, -1, -1));

        ManNameLab.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        ManNameLab.setForeground(new java.awt.Color(0, 102, 204));
        ManNameLab.setText("Restaurant Manager Name:");
        jPanel1.add(ManNameLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 253, -1, -1));

        RestNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestNameTextActionPerformed(evt);
            }
        });
        jPanel1.add(RestNameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 143, 118, -1));

        RestAddText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestAddTextActionPerformed(evt);
            }
        });
        jPanel1.add(RestAddText, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 182, 118, -1));

        PhoneText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneTextActionPerformed(evt);
            }
        });
        jPanel1.add(PhoneText, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 212, 118, -1));

        ManNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManNameTextActionPerformed(evt);
            }
        });
        jPanel1.add(ManNameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 118, -1));

        updateButton.setBackground(new java.awt.Color(0, 102, 204));
        updateButton.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("Update");
        updateButton.setBorderPainted(false);
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        jPanel1.add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 310, -1, -1));

        backButton1.setBackground(new java.awt.Color(0, 102, 204));
        backButton1.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        backButton1.setForeground(new java.awt.Color(255, 255, 255));
        backButton1.setText("<< Back");
        backButton1.setBorderPainted(false);
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(backButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 351, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/grocery_user-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, 270, 400));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/d1.png"))); // NOI18N
        jLabel8.setText("jLabel2");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -60, 1710, 1000));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1026, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RestNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RestNameTextActionPerformed

    private void RestAddTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestAddTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RestAddTextActionPerformed

    private void PhoneTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneTextActionPerformed

    private void ManNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ManNameTextActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        String RestName = RestNameText.getText();
        String address = RestAddText.getText();
        String phone = PhoneText.getText();
        String ManName = ManNameText.getText();
        if(RestName.isEmpty() || ManName.isEmpty() ||
            phone.isEmpty() || address.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Fields cannot be left empty");
            return;
        }

        boolean flag ;

        //String phoneNumber = phone;

        if(phone.length() != 10) {
            JOptionPane.showMessageDialog(null, "PhoneNumber must be of 10 digits");
            return;
        }
        flag = phone.matches("^[0-9]+$");
        if(!flag) {
            JOptionPane.showMessageDialog(null, "Phone Number must have digits only");
            return;
        }
        for(Grocer res : grocerDirectory.getGrocerDirectory()) {
            if(res.getPhoneNum().equals(phone) && this.grocer != res) {
                JOptionPane.showMessageDialog(null, "Phone Number already exists");
                return;
            }
        }

        //String address = txtAddress.getText();

        grocer.setGrocerName(RestName);
        grocer.setManagerName(ManName);
        grocer.setPhoneNum(phone);
        grocer.setAddress(address);

        JOptionPane.showMessageDialog(null, "Restaurant Updated");
    }//GEN-LAST:event_updateButtonActionPerformed

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageStoreInfoJPanel u = (ManageStoreInfoJPanel) component;
        u.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ManNameLab;
    private javax.swing.JTextField ManNameText;
    private javax.swing.JTextField PhoneText;
    private javax.swing.JTextField RestAddText;
    private javax.swing.JLabel RestAddressLab;
    private javax.swing.JTextField RestNameText;
    private javax.swing.JLabel RestPhoneLab;
    private javax.swing.JButton backButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel restNameLab;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
