/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Driver.Driver;
import Business.Driver.DriverDirectory;
import Business.EcoSystem;

import Business.UserAccount.UserAccountDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author grees
 */
public class updateDriver extends javax.swing.JPanel {

    /**
     * Creates new form updateDriver
     */
       private JPanel userProcessContainer;
     private EcoSystem ecoSystem;
    private Driver driver;
    private UserAccountDirectory userAccountDirectory;
    private DriverDirectory driverDirectory;
    public updateDriver(JPanel userProcessContainer, EcoSystem ecoSystem, DriverDirectory driverDirectory, Driver driver) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.driver = driver;
        this.driverDirectory = ecoSystem.getDriverDirectory();
        nameText.setText(driver.getName());
        emailText.setText(driver.getEmail());
        addText.setText(driver.getAddress());
        mobileText.setText(driver.getMobile());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        NameLabel = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        mobileLabel = new javax.swing.JLabel();
        mobileText = new javax.swing.JTextField();
        addLabel = new javax.swing.JLabel();
        addText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel1.setText("Update Driver Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 420, 50));

        updateButton.setBackground(new java.awt.Color(0, 102, 204));
        updateButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("Update");
        updateButton.setBorderPainted(false);
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, -1, -1));

        backButton.setBackground(new java.awt.Color(255, 255, 255));
        backButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backButton.setForeground(new java.awt.Color(0, 102, 204));
        backButton.setText("<< BACK");
        backButton.setBorderPainted(false);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, -1, -1));

        NameLabel.setText("Name:");
        add(NameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 80, -1));
        add(nameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 180, -1));

        emailLabel.setText("Email:");
        add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 80, -1));
        add(emailText, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 180, -1));

        mobileLabel.setText("Mobile:");
        add(mobileLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 80, -1));
        add(mobileText, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 180, -1));

        addLabel.setText("Address:");
        add(addLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 80, -1));
        add(addText, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 180, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/d1.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1710, 990));
    }// </editor-fold>//GEN-END:initComponents

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        String mobile = mobileText.getText();
        String email = emailText.getText();
  

        if (nameText.getText().isEmpty() || !nameText.getText().matches("^[a-zA-Z]+(?:[\\s-][a-zA-Z]+)*$"))
        JOptionPane.showMessageDialog(null, "Please enter valid name");

        if(!(mobileText.getText().length()==10) || !mobileText.getText().matches("^[0-9]+") || mobileText.getText().matches("[0]{10}"))
        JOptionPane.showMessageDialog(null, "enter valid mobile number");

        for(Driver driver : driverDirectory.getDriverDirectory()) {

            if(driver.getMobile().equals(mobile) && this.driver != driver) {
                JOptionPane.showMessageDialog(null, "Mobile Number already exists");
            }
        }

        if(emailText.getText().isEmpty()|| !(emailText.getText().trim().contains("@") && emailText.getText().trim().contains(".")))
        JOptionPane.showMessageDialog(null, "Enter valid email address");
        for(Driver driver : driverDirectory.getDriverDirectory()) {

            if(driver.getEmail().equals(email) && this.driver != driver) {
                JOptionPane.showMessageDialog(null, "Email already exists");
            }
        }

        if (addText.getText().isEmpty())
        JOptionPane.showMessageDialog(null, "Please enter address");

       
        driver.setMobile(mobileText.getText());
        driver.setAddress(addText.getText());
        driver.setName(nameText.getText());
        driver.setEmail(emailText.getText());
        
        
        JOptionPane.showMessageDialog(null, "Driver Profile Updated");
    }//GEN-LAST:event_updateButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        manageDriver driver = (manageDriver) component;
        driver.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel addLabel;
    private javax.swing.JTextField addText;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel mobileLabel;
    private javax.swing.JTextField mobileText;
    private javax.swing.JTextField nameText;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
