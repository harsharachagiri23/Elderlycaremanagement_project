/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PersonRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Helper.Helper;
import Business.Helper.HelperDirectory;
import Business.Network.Network;
import Business.Nurse.Nurse;
import Business.Nurse.NurseDirectory;
import Business.Org.PersonOrganization;
import Business.Person.Person;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HelperWorkRequest;

import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author grees
 */
public class HandyManJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HandyManJPanel
     */
    private JPanel userProcessContainer;
private EcoSystem ecoSystem;
private UserAccount account;
private HelperWorkRequest hreq;
private Enterprise ent;
private PersonOrganization organization;
private Network network;
    public HandyManJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecoSystem,HelperWorkRequest hreq,Enterprise ent,Network network,PersonOrganization organization) {
initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.ecoSystem = ecoSystem;
        this.hreq = hreq;
        this.organization = organization;
        this.ent = ent;
        this.network = network;
        populateSeatsCombo();
        populateRequestTable();
        //double price = 20.5;
        
    }
    
     public void populateSeatsCombo() {
        jComboBox1.removeAllItems();
        //jComboBox1.addItem(" ");
        
        for(Helper res : ecoSystem.getHelperDirectory().getHelperDirectory()) {
            System.out.println("res" + res);
            
            jComboBox1.addItem(String.valueOf(res.getProfession()));
             //priceText.setText(String.valueOf(res.getPrice()));
            
            //selectComboBox.addItem(Integer.parseInt(res.getSeats())); String.valueOf(i)
            //jComboBox1.addItem(String.valueOf(res.getSeats()));
        }
    }
     
     public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        //double price = 13.5;
        //for (Gene g : ((LabTestWorkRequest) request).getPatient().getGeneHistory().getGeneHistory()) {
        for (WorkRequest request : account.getWorkQueue().getWorkRequestList()){
        if (request instanceof HelperWorkRequest) {
        Object[] row = new Object[5];
        row[0] = ((HelperWorkRequest) request).getDate();
        row[1] = ((HelperWorkRequest) request).getProf();
        row[2] = ((HelperWorkRequest) request).getAdd();
        row[3] =((HelperWorkRequest) request).getPrice();
        row[4] = ((HelperWorkRequest) request);
        model.addRow(row);
//}
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

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bookButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker();
        jLabel3 = new javax.swing.JLabel();
        priceText = new javax.swing.JLabel();

        setBackground(new java.awt.Color(249, 243, 238));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Price ");
        jLabel5.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 204));
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, -1, -1));

        jLabel1.setText("Book a HandyMan");
        jLabel1.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, -1, -1));

        jLabel2.setText("Date");
        jLabel2.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 204));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, -1, -1));

        jLabel4.setText("Select Service");
        jLabel4.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 204));
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 111, -1));

        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 111, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Service", "Address", "Price", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 545, 132));

        bookButton.setText("Book");
        bookButton.setBackground(new java.awt.Color(0, 102, 204));
        bookButton.setBorderPainted(false);
        bookButton.setForeground(new java.awt.Color(255, 255, 255));
        bookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookButtonActionPerformed(evt);
            }
        });
        add(bookButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, -1, -1));

        backButton.setText("<< BACK");
        backButton.setBackground(new java.awt.Color(255, 255, 255));
        backButton.setBorderPainted(false);
        backButton.setForeground(new java.awt.Color(0, 102, 204));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 610, -1, -1));
        add(datePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/handy_ser.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 610, 220));

        priceText.setText("jLabel6");
        add(priceText, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void bookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookButtonActionPerformed
        // TODO add your handling code here:
       /*  if(EDText.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null,"Please enter the number of days of service", "Warning", JOptionPane.WARNING_MESSAGE);
        return;
        }*/
       
       LocalDate dt = LocalDate.from(ZonedDateTime.now());
       if (datePicker1.getDate() == null || dt.compareTo(datePicker1.getDate()) > 0 )
         {
             JOptionPane.showMessageDialog(null,"Please pick valid date", "Warning", JOptionPane.WARNING_MESSAGE);
        return;
         }
            double price = Double.parseDouble(priceText.getText());
            String prof = jComboBox1.getSelectedItem().toString();
        Person person = ecoSystem.getPersonDirectory().getPerson(account.getEmployee().getName());
        String add = person.getAddress();
        String pname = person.getName();
        LocalDate date = datePicker1.getDate();
       // Helper price = ecoSystem.getHelperDirectory().getHelper();
       // LocalTime time = dateTimePicker1.getTimePicker().getTime();
        String status = "HandyMan Requested";
        HelperWorkRequest hreq = new HelperWorkRequest();
        //hreq.setPrice();
        hreq.setPname(pname);
        hreq.setAdd(add);
        hreq.setProf(prof);
        hreq.setPrice(price);
        hreq.setDate(date);
        hreq.setHstatus(status);
        
         account.getWorkQueue().getWorkRequestList().add(hreq);
        ecoSystem.getWorkQueue().getWorkRequestList().add(hreq);
        
         JOptionPane.showMessageDialog(null,"You have successfully requested a handy man. Please wait for the handy man to accept");
        populateRequestTable();
    }//GEN-LAST:event_bookButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
          userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        PersonAreaJPanel a = (PersonAreaJPanel) component;
        //a.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
        populatePrice();
    }//GEN-LAST:event_jComboBox1ItemStateChanged
    public void populatePrice(){
        try{
            String helper = jComboBox1.getSelectedItem().toString();
            for(Helper hlp : ecoSystem.getHelperDirectory().getHelperDirectory()) {
                if(helper.equalsIgnoreCase(hlp.getProfession())){
            System.out.println("helper" + hlp);
            priceText.setText(String.valueOf(hlp.getPrice()));
                }
    }}catch(Exception e){}
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton bookButton;
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel priceText;
    // End of variables declaration//GEN-END:variables
}
