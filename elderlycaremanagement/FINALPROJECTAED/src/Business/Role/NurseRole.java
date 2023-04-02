/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Org.DriverOrganization;
import Business.Org.HelperOrganization;
import Business.Org.NursingOrganization;
import Business.Org.Org;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.HelperRole.HelperWorkAreaJPanel;
import userinterface.NurseRole.NurseWorkAreaJPanel;

/**
 *
 * @author grees
 */
public class NurseRole extends Role{
     public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Org organization, Enterprise enterprise, EcoSystem business,Network network) {
        return new NurseWorkAreaJPanel(userProcessContainer, account, business, (NursingOrganization)organization,  enterprise, network);
    //JPanel userProcessContainer, 
     //    UserAccount userAccount,  
       //     EcoSystem business, Org organization, Enterprise enterprise, Network network
     }
}
