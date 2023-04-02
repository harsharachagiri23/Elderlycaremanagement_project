/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Helper;

import Business.Helper.Helper;
import java.util.ArrayList;

/**
 *
 * @author grees
 */
public class HelperDirectory {
    
    private ArrayList<Helper> HelperDirectory;
     
     public HelperDirectory() {
        
        HelperDirectory = new ArrayList();
        
    }

    public ArrayList<Helper> getHelperDirectory() {
        return HelperDirectory;
    }

    public void setHelperDirectory(ArrayList<Helper> HelperDirectory) {
        this.HelperDirectory = HelperDirectory;
    }
     
     public Helper addHelper(String userName,String profession,double price, String name, String email, String mobile, String address){
        Helper helper = new Helper(userName,profession,price, name, email, mobile, address);
        HelperDirectory.add(helper);
        return helper;
    }
    
    public void removeHelper(Helper helper){
        HelperDirectory.remove(helper);
    }
    
    public Helper getHelper(String name){
        for(Helper helper: HelperDirectory){
            if(helper.getName().equalsIgnoreCase(name)){
                return helper;
            }
        }
        return null;
    }
     
     
    
}
