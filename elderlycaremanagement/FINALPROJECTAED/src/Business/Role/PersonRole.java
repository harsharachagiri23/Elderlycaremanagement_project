/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Org.NursingOrganization;
import Business.Org.Org;
import Business.Org.PersonOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.NurseRole.NurseWorkAreaJPanel;
import userinterface.PersonRole.PersonAreaJPanel;

/**
 *
 * @author grees
 */
public class PersonRole extends Role{
     public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Org organization, Enterprise enterprise, EcoSystem business,Network network) {
        return new PersonAreaJPanel(userProcessContainer, account, (PersonOrganization)organization,  enterprise,business, network);
    }
}

