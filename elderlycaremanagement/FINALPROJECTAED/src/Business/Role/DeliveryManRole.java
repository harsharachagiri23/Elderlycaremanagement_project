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
import Business.Org.DeliveryManOrganization;
import Business.Org.DriverOrganization;
import Business.Org.Org;
import Business.Pharmacy.PharmacyDirectory;

import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.DeliveryManRole.DeliveryManWorkAreaJPanel;
/**
 *
 * @author grees
 */
public class DeliveryManRole extends Role {
     public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Org organization, Enterprise enterprise,EcoSystem business, Network network) {
        return new DeliveryManWorkAreaJPanel(userProcessContainer,account,business);

//To change body of generated methods, choose Tools | Templates.
    }
}
