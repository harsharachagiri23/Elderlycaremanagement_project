/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Doctor.DoctorDirectory;
import Business.Driver.DriverDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Helper.HelperDirectory;
import Business.Pharmacy.PharmacyDirectory;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.DriverRole.DriverWorkAreaJPanel;
import Business.Grocer.GrocerDirectory;
import Business.Network.Network;
import Business.Org.DriverOrganization;
import Business.Org.GroceryOrganization;
import Business.Org.Org;
import userinterface.GrocerAdminRole.GrocerAdminAreaJPanel;
//import userinterface.GrocerRole.GrocerWorkAreaJPanel;

/**
 *
 * @author 16178
 */
public class GrocerRole extends Role {
 public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Org organization, Enterprise enterprise, EcoSystem business,Network network) {
        return new GrocerAdminAreaJPanel(userProcessContainer, account, business,(GroceryOrganization)organization,  enterprise, network);
 }
 }
