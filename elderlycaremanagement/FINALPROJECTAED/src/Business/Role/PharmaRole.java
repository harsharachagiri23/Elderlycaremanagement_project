/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

//import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Doctor.DoctorDirectory;
import Business.Driver.DriverDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Grocer.GrocerDirectory;
import Business.Helper.HelperDirectory;
import Business.Network.Network;
import Business.Org.DriverOrganization;
import Business.Org.Org;
import Business.Org.PharmacyOrganization;
import Business.Pharmacy.PharmacyDirectory;
import Business.PharmacyMenu.PMenuDirectory;
import Business.PharmacyOrder.POrderDirectory;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
//import userinterface.GrocerRole.GrocerWorkAreaJPanel;
//import userinterface.PharmacistRole.PharmacistWorkAreaJPanel;
import userinterface.PharmacyAdminRole.PharmaAdminAreaJPanel;

/**
 *
 * @author grees
 */
public class PharmaRole extends Role {
 public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Org organization, Enterprise enterprise, EcoSystem business,Network network) {
        return new PharmaAdminAreaJPanel(userProcessContainer, account, business,(PharmacyOrganization)organization,  enterprise, network);
 }
}
