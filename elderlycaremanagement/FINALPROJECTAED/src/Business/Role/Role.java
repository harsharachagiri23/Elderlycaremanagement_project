/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Driver.DriverDirectory;
import Business.EcoSystem;
import Business.Helper.HelperDirectory;

import Business.Organization;
import Business.Pharmacy.PharmacyDirectory;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import Business.Doctor.DoctorDirectory;
import Business.Enterprise.Enterprise;
import Business.Grocer.GrocerDirectory;
import Business.Network.Network;
import Business.Org.Org;
/**
 *
 * @author raunak
 */
public abstract class Role {
    
    public enum RoleType{
        RestaurantAdmin("RestaurantAdmin"),
        Customer("Customer"),
        DeliveryMan("Delivery"),
        SysAdmin("Sysadmin"),
        Helper("Helper"),
        Driver("Driver"),
        Doctor("Doctor"),
        Grocer("Grocer");
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Org organization, Enterprise enterprise, EcoSystem business,Network network);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}