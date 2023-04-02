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
import Business.Grocer.GrocerDirectory;
import Business.Helper.HelperDirectory;
import Business.Network.Network;
import Business.Org.DriverOrganization;
import Business.Org.HelperOrganization;
import Business.Org.Org;
import Business.Pharmacy.PharmacyDirectory;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.PersonRole.PersonAreaJPanel;
import userinterface.HelperRole.HelperWorkAreaJPanel;
import userinterface.PersonRole.GroceryJPanel;

/**
 *
 * @author grees
 */
public class HelperRole extends Role{
     public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Org organization, Enterprise enterprise, EcoSystem business,Network network) {
        return new HelperWorkAreaJPanel(userProcessContainer, account, business, (HelperOrganization)organization,  enterprise, network);
    }
    
    
}
