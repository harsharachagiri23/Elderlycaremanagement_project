/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.PharmacyMenu;

import java.util.ArrayList;

/**
 *
 * @author grees
 */
public class PMenuDirectory {
    
        private ArrayList<PMenu> pmenuDirectory;
    
    public PMenuDirectory() {
        pmenuDirectory = new ArrayList();
    }

    public ArrayList<PMenu> getPmenuDirectory() {
        return pmenuDirectory;
    }

    public void setPmenuDirectory(ArrayList<PMenu> pmenuDirectory) {
        this.pmenuDirectory = pmenuDirectory;
    }
    
    public PMenu newItem(String itemName, double price, String res) {
    PMenu menu = new PMenu(itemName, price, res);
    pmenuDirectory.add(menu);
    return menu;
    }
    public PMenu getMenu(String itemName){
    for(PMenu pmenu: pmenuDirectory) {
        if(pmenu.getItemName().equalsIgnoreCase(itemName)){
        return pmenu;
        }
    }
    return null;
    }
    public void removeMenu(PMenu menu) {
        pmenuDirectory.remove(menu);
    }
    
}
