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
import Business.Org.Org;
import Business.Pharmacy.PharmacyDirectory;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.DriverRole.DriverWorkAreaJPanel;
import userinterface.HelperRole.HelperWorkAreaJPanel;

/**
 *
 * @author grees
 */
public class DriverRole extends Role{
    
public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Org organization, Enterprise enterprise, EcoSystem business,Network network) {
        return new DriverWorkAreaJPanel(userProcessContainer, account, business, (DriverOrganization)organization,  enterprise, network);
    }
}
