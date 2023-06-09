/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PersonRole;

/**
 *
 * @author grees
 */
import Business.Doctor.Doctor;
import Business.Driver.Driver;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Org.PersonOrganization;
import Business.Person.Person;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DoctorWorkRequest;
import Business.WorkQueue.DriverWorkRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import java.awt.Component;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.table.DefaultTableModel;
import java.awt.CardLayout;
import java.awt.Component;
import java.time.ZonedDateTime;
import javamailapp.javamail.JavaMailSystem;
public class DocJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DocJPanel
     */
            private JPanel userProcessContainer;
        private EcoSystem ecoSystem;
        private UserAccount account;
        private DoctorWorkRequest docreq;
        private Enterprise ent;
        private PersonOrganization organization;
        private Network network;

    
    public DocJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecoSystem,DoctorWorkRequest docreq,Enterprise ent,Network network,PersonOrganization organization) {
                 initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.ecoSystem = ecoSystem;
        this.docreq = docreq;
        this.organization = organization;
        this.ent = ent;
        this.network = network;
        populateSpeciality();
        populateRequestTable();
    }
      public void populateDocCombo() {
        boxDoctor.removeAllItems();     
        for(Doctor doc : ecoSystem.getDoctorDirectory().getDoctorDirectory()) {
            System.out.println("doc" + doc);
            try{
            if(doc.getSpeciality().equalsIgnoreCase(comboSpeciality.getSelectedItem().toString()))
            //selectComboBox.addItem(Integer.parseInt(res.getSeats())); String.valueOf(i)
            boxDoctor.addItem(String.valueOf(doc.getName()));
            }catch(Exception e){}
        }
    }
      
      public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        //for (Gene g : ((LabTestWorkRequest) request).getPatient().getGeneHistory().getGeneHistory()) {
        for (WorkRequest request : account.getWorkQueue().getWorkRequestList()){
        if (request instanceof DoctorWorkRequest) {
        //DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        // if(account.getEmployee().getName().equals(((DriverWorkRequest) dreq).getPerson().getName())) {
        Object[] row = new Object[5];
        row[0] = ((DoctorWorkRequest) request).getPerson().getName();
        row[1] = ((DoctorWorkRequest) request).getSpec();
        row[2] =((DoctorWorkRequest) request).getDate();
        row[3] = ((DoctorWorkRequest) request).getTime();
        row[4] = ((DoctorWorkRequest) request);
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

        jLabel2 = new javax.swing.JLabel();
        BookButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        enterpriseLabel2 = new javax.swing.JLabel();
        boxDoctor = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        dateTimePicker1 = new com.github.lgooddatepicker.components.DateTimePicker();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        comboSpeciality = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(163, 210, 224));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Pick Appointment");
        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 204));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, -1, -1));

        BookButton.setText("Book");
        BookButton.setBackground(new java.awt.Color(0, 102, 204));
        BookButton.setBorderPainted(false);
        BookButton.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        BookButton.setForeground(new java.awt.Color(255, 255, 255));
        BookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookButtonActionPerformed(evt);
            }
        });
        add(BookButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Name", "Doctor", "Date", "Time", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 592, 138));

        enterpriseLabel2.setText("Appointment details:");
        enterpriseLabel2.setBackground(new java.awt.Color(237, 235, 235));
        enterpriseLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel2.setForeground(new java.awt.Color(0, 102, 204));
        add(enterpriseLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, 205, 30));

        boxDoctor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(boxDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 80, 22));

        jLabel4.setText("Select Doctor");
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 204));
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));
        add(dateTimePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, -1, -1));

        btnBack.setText("Back");
        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setBorderPainted(false);
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 102, 204));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 680, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("Select Speciality");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, 30));

        comboSpeciality.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboSpeciality.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboSpecialityItemStateChanged(evt);
            }
        });
        comboSpeciality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSpecialityActionPerformed(evt);
            }
        });
        add(comboSpeciality, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 80, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MicrosoftTeams-image (3).png"))); // NOI18N
        jLabel5.setText("jLabel5");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, -10, 720, 210));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MicrosoftTeams-image.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 220, 310, 410));
    }// </editor-fold>//GEN-END:initComponents

    private void selectComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectComboBoxActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        PersonAreaJPanel a = (PersonAreaJPanel) component;
        //a.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void BookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookButtonActionPerformed
        // TODO add your handling code here:
        /*  if(EDText.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null,"Please enter destination address", "Warning", JOptionPane.WARNING_MESSAGE);
        return;
        }*/
       // String destin = EDText.getText();
       LocalDate dt = LocalDate.from(ZonedDateTime.now());
       if (dateTimePicker1.datePicker.getDate() == null || dateTimePicker1.timePicker.getTime() == null || dt.compareTo(dateTimePicker1.datePicker.getDate()) > 0 )
         {
             JOptionPane.showMessageDialog(null,"Please pick valid date and time", "Warning", JOptionPane.WARNING_MESSAGE);
        return;
         }
       String spec = boxDoctor.getSelectedItem().toString();
       
        Person person = ecoSystem.getPersonDirectory().getPerson(account.getEmployee().getName());
          LocalDate date = dateTimePicker1.getDatePicker().getDate();
        LocalTime time = dateTimePicker1.getTimePicker().getTime();
        String status = "Doctor Requested";
        //Doctor doc = 
        DoctorWorkRequest docreq = new DoctorWorkRequest();
        docreq.setPerson(person);
        docreq.setSpec(spec);
        docreq.setDate(date);
        docreq.setTime(time);
        docreq.setDocstatus(status);
        
        account.getWorkQueue().getWorkRequestList().add(docreq);
        ecoSystem.getWorkQueue().getWorkRequestList().add(docreq);
        populateRequestTable();
        JOptionPane.showMessageDialog(null,"You have successfully requested for an appointment. Please wait for the doctor to accept it");
        try {
                JavaMailSystem.sendMail("kashyapdatta@gmail.com","Doctor Appointment Requested","You have successfully requested for an appointment on"+" " +date+" "+ "Please wait for the driver to accept it");
           } catch (Exception ex) {
               //Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
          }
        try {
                JavaMailSystem.sendMail("kashyapdatta@gmail.com","New Appointment Request","You have been requested for an appointment on"+" " +date+" "+ "Please login to the app to accept it");
           } catch (Exception ex) {
               //Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
          }

    }//GEN-LAST:event_BookButtonActionPerformed

    private void comboSpecialityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSpecialityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSpecialityActionPerformed

    private void comboSpecialityItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboSpecialityItemStateChanged
        // TODO add your handling code here:
        System.out.println("Speciality triggered");
        populateDocCombo();
        
    }//GEN-LAST:event_comboSpecialityItemStateChanged

    public void populateSpeciality(){
        comboSpeciality.removeAllItems();
        try{
        for(Doctor doc : ecoSystem.getDoctorDirectory().getDoctorDirectory()) {
            System.out.println("doc" + doc);
            comboSpeciality.addItem(String.valueOf(doc.getSpeciality()));
            
        }
        }catch(Exception e){}
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BookButton;
    private javax.swing.JComboBox<String> boxDoctor;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox<String> comboSpeciality;
    private com.github.lgooddatepicker.components.DateTimePicker dateTimePicker1;
    private javax.swing.JLabel enterpriseLabel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
