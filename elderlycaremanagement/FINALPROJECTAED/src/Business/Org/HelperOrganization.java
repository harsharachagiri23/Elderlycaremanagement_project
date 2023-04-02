/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Org;

import Business.Role.GrocerRole;
import Business.Role.HelperRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author grees
 */
public class HelperOrganization extends Org {
    
       public HelperOrganization()
    {
        super(Org.Type.Helper.getValue());
    }
    
      @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new HelperRole());
        return roles;
    }
}
