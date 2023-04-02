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
import Business.Org.DoctorOrganization;
import Business.Org.DriverOrganization;
import Business.Org.Org;
import Business.Pharmacy.PharmacyDirectory;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.DoctorRole.DoctorWorkAreaJPanel;
import userinterface.DriverRole.DriverWorkAreaJPanel;

/**
 *
 * @author 16178
 */
public class DoctorRole extends Role {
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Org organization, Enterprise enterprise, EcoSystem business,Network network) {
        return new DoctorWorkAreaJPanel(userProcessContainer, account, business, (DoctorOrganization)organization,  enterprise, network);
    }
}
