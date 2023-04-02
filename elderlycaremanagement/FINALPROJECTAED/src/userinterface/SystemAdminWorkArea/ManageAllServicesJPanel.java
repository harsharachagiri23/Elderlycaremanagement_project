/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Doctor.DoctorDirectory;
import Business.Driver.DriverDirectory;
import Business.EcoSystem;
import Business.Grocer.GrocerDirectory;
import Business.Helper.HelperDirectory;
import Business.Nurse.NurseDirectory;
import Business.Person.PersonDirectory;
import Business.Pharmacy.PharmacyDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author harshavardhani
 */
public class ManageAllServicesJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageAllServicesJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    GrocerDirectory grocerDirectory;
    PharmacyDirectory pharmacyDirectory;
    DoctorDirectory doctorDirectory;
    HelperDirectory helperDirectory;
    NurseDirectory nurseDirectory;
    PersonDirectory personDirectory;
    DriverDirectory driverDirectory;
    public ManageAllServicesJPanel(JPanel userProcessContainer,EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecoSystem;
        this.grocerDirectory = grocerDirectory;
        this.pharmacyDirectory = pharmacyDirectory;
        this.doctorDirectory = doctorDirectory;
        this.helperDirectory = helperDirectory;
        this.nurseDirectory = nurseDirectory;
        this.personDirectory = personDirectory;
        this.driverDirectory = driverDirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManageDelivery = new javax.swing.JButton();
        btnManageHealthServices = new javax.swing.JButton();
        btnManageSupportServices = new javax.swing.JButton();
        btnManageTransportationServices = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnManagePerson = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnManageDelivery.setBackground(new java.awt.Color(255, 255, 255));
        btnManageDelivery.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnManageDelivery.setForeground(new java.awt.Color(0, 102, 204));
        btnManageDelivery.setText("Manage DeliveryServices");
        btnManageDelivery.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 204)));
        btnManageDelivery.setBorderPainted(false);
        btnManageDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageDeliveryActionPerformed(evt);
            }
        });
        add(btnManageDelivery, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 280, 40));

        btnManageHealthServices.setBackground(new java.awt.Color(255, 255, 255));
        btnManageHealthServices.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnManageHealthServices.setForeground(new java.awt.Color(0, 102, 204));
        btnManageHealthServices.setText("Manage HealthServices");
        btnManageHealthServices.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 204)));
        btnManageHealthServices.setBorderPainted(false);
        btnManageHealthServices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageHealthServicesActionPerformed(evt);
            }
        });
        add(btnManageHealthServices, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 230, 280, 40));

        btnManageSupportServices.setBackground(new java.awt.Color(255, 255, 255));
        btnManageSupportServices.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnManageSupportServices.setForeground(new java.awt.Color(0, 102, 204));
        btnManageSupportServices.setText("Manage SupportSerivces");
        btnManageSupportServices.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 204)));
        btnManageSupportServices.setBorderPainted(false);
        btnManageSupportServices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageSupportServicesActionPerformed(evt);
            }
        });
        add(btnManageSupportServices, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 280, 40));

        btnManageTransportationServices.setBackground(new java.awt.Color(255, 255, 255));
        btnManageTransportationServices.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnManageTransportationServices.setForeground(new java.awt.Color(0, 102, 204));
        btnManageTransportationServices.setText("Manage TransportationSerivces");
        btnManageTransportationServices.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 204)));
        btnManageTransportationServices.setBorderPainted(false);
        btnManageTransportationServices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageTransportationServicesActionPerformed(evt);
            }
        });
        add(btnManageTransportationServices, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 340, 280, 40));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("MANAGE SERVICES");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 408, -1));

        btnManagePerson.setBackground(new java.awt.Color(255, 255, 255));
        btnManagePerson.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnManagePerson.setForeground(new java.awt.Color(0, 102, 204));
        btnManagePerson.setText("Manage Person");
        btnManagePerson.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 204)));
        btnManagePerson.setBorderPainted(false);
        btnManagePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePersonActionPerformed(evt);
            }
        });
        add(btnManagePerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, 239, 40));

        backButton.setBackground(new java.awt.Color(0, 102, 204));
        backButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("<< BACK");
        backButton.setBorderPainted(false);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 510, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/manage-removebg-preview.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 510, 480));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/d1.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1710, 1000));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageDeliveryActionPerformed
        ManageDeliveryServicesJPanel mngDelSrvPanel = new ManageDeliveryServicesJPanel(userProcessContainer, ecosystem, ecosystem.getGrocerDirectory(),ecosystem.getPharmacyDirectory(),ecosystem.getDeliverymanDirectory());
        userProcessContainer.add("ManageDeliveryServicesJPanel",mngDelSrvPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnManageDeliveryActionPerformed

    private void btnManageHealthServicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageHealthServicesActionPerformed
        ManageDoctor mngHelSrvPanel = new ManageDoctor(userProcessContainer, ecosystem, ecosystem.getDoctorDirectory());
        userProcessContainer.add("ManageDoctor",mngHelSrvPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageHealthServicesActionPerformed

    private void btnManageSupportServicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageSupportServicesActionPerformed
        ManageSupportServicesJPanel mngSupSrvPanel = new ManageSupportServicesJPanel(userProcessContainer, ecosystem, ecosystem.getHelperDirectory(),ecosystem.getNurseDirectory());
        userProcessContainer.add("ManageSupportServicesJPanel",mngSupSrvPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageSupportServicesActionPerformed

    private void btnManageTransportationServicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageTransportationServicesActionPerformed
        // TODO add your handling code here:
        manageDriver mngDriverPanel = new manageDriver(userProcessContainer, ecosystem, ecosystem.getDriverDirectory());
        userProcessContainer.add("manageDriver",mngDriverPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageTransportationServicesActionPerformed

    private void btnManagePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePersonActionPerformed
        // TODO add your handling code here:
        ManagePatient mngPersonPanel = new ManagePatient(userProcessContainer, ecosystem, ecosystem.getPersonDirectory());
        userProcessContainer.add("manageDriver",mngPersonPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManagePersonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton btnManageDelivery;
    private javax.swing.JButton btnManageHealthServices;
    private javax.swing.JButton btnManagePerson;
    private javax.swing.JButton btnManageSupportServices;
    private javax.swing.JButton btnManageTransportationServices;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
