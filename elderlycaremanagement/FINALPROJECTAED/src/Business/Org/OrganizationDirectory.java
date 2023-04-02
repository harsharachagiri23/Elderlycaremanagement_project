/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Org;

import java.util.ArrayList;
import Business.Org.Org.Type;

/**
 *
 * @author grees
 */
public class OrganizationDirectory {
    
      private ArrayList<Org> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Org> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(ArrayList<Org> organizationList) {
        this.organizationList = organizationList;
    }
    
    public Org createOrganization(Type type){
        Org organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.Person.getValue())){
            organization=new PersonOrganization();
            organizationList.add(organization);
        }
        
        
        else if (type.getValue().equals(Type.Nursing.getValue())){
            organization=new NursingOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.Pharmacy.getValue())){
            organization=new PharmacyOrganization();
            organizationList.add(organization);
        } 
        
        else if (type.getValue().equals(Type.Grocery.getValue())){
            organization=new GroceryOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.Driver.getValue())){
            organization=new DriverOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.Helper.getValue())){
            organization=new HelperOrganization();
            organizationList.add(organization);
        }
            else if (type.getValue().equals(Type.DeliveryMan.getValue())){
            organization = new DeliveryManOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
    
}
