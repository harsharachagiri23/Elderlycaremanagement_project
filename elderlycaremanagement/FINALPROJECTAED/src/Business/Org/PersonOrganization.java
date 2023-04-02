/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Org;

import Business.Driver.Driver;
import Business.Role.DoctorRole;
import Business.Role.DriverRole;
import Business.Role.HelperRole;
import Business.Role.NurseRole;
import Business.Role.PersonRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author grees
 */
public class PersonOrganization  extends Org {
    //Driver d;
       public PersonOrganization()
    {
        super(Org.Type.Person.getValue());
        //d = new Driver(userName, name, email, mobile, address, model, 0);
    }
    
      @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PersonRole());
        roles.add(new DriverRole());
        roles.add(new NurseRole());
        roles.add(new HelperRole());
         roles.add(new DoctorRole());
        return roles;
    }
}
