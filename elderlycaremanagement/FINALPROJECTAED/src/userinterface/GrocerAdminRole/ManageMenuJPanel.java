/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.GrocerAdminRole;

import Business.EcoSystem;
import Business.Grocer.Grocer;
import Business.Grocer.GrocerDirectory;
import Business.GroceryMenu.GMenu;
import Business.GroceryMenu.GMenuDirectory;

import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author grees
 */
public class ManageMenuJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageMenuJPanel
     */
      private JPanel userProcessContainer;
    private UserAccount account;
    private EcoSystem ecoSystem;
    private GrocerDirectory grocerDirectory;
    private GMenuDirectory gmenuDirectory;
    private Grocer grocer;
    public ManageMenuJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecoSystem, 
                             GrocerDirectory grocerDirectory, GMenuDirectory gmenuDirectory) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.ecoSystem = ecoSystem;
        this.grocerDirectory = ecoSystem.getGrocerDirectory();
        this.gmenuDirectory = ecoSystem.getgMenuDirectory();
        populateTable();
    }
    
    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        for(GMenu menu : gmenuDirectory.getGmenuDirectory()){
            if(menu.getGrocerName().equals(account.getEmployee().getName())) {
                Object [] row = new Object[2];
                row[0] = menu;
                row[1] = menu.getPrice();
                dtm.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BackButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        itemText = new javax.swing.JTextField();
        priceText = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 153, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Price"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 257, 128));

        BackButton.setBackground(new java.awt.Color(0, 102, 204));
        BackButton.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        BackButton.setForeground(new java.awt.Color(255, 255, 255));
        BackButton.setText("<< BACK");
        BackButton.setBorderPainted(false);
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 560, -1, -1));

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 204));
        jLabel2.setText("Item:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 190, 70, -1));

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setText("Price:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 228, 70, -1));
        add(itemText, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 128, -1));

        priceText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceTextActionPerformed(evt);
            }
        });
        add(priceText, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 128, -1));

        addButton.setBackground(new java.awt.Color(0, 102, 204));
        addButton.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Add Item");
        addButton.setBorderPainted(false);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, -1, -1));

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 204));
        jLabel4.setText("Items List");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 80, -1));

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 204));
        jLabel5.setText("Create Menu");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 87, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/grocery_user-removebg-preview.png"))); // NOI18N
        jLabel7.setText("jLabel3");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 200, 320));

        deleteButton.setBackground(new java.awt.Color(0, 102, 204));
        deleteButton.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete Item");
        deleteButton.setBorderPainted(false);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 540, -1, -1));

        jLabel8.setForeground(new java.awt.Color(0, 102, 204));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/d1.png"))); // NOI18N
        jLabel8.setText("jLabel2");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -60, 1740, 1000));
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void priceTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceTextActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        
        if(itemText.getText().isEmpty() || priceText.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,"Fields cannot be empty");
            return;
        }
        
        String itemName = itemText.getText();
        double price;
        try {
            price = Double.parseDouble(priceText.getText());
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Price must be float or Integer value");
            return;
        }
        
        String res = account.getEmployee().getName();
        
        gmenuDirectory.newItem(itemName, price, res);
        populateTable();
    }//GEN-LAST:event_addButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
                  int selectedRow = jTable1.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }

        GMenu menu = (GMenu) jTable1.getValueAt(selectedRow, 0);
        gmenuDirectory.removeMenu(menu);
        populateTable();
    }//GEN-LAST:event_deleteButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton addButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField itemText;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField priceText;
    // End of variables declaration//GEN-END:variables
}
