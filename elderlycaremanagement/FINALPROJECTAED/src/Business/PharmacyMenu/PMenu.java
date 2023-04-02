/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.PharmacyMenu;

/**
 *
 * @author grees
 */
public class PMenu {
        private String itemName;
    private double price;
    private String pharmaName;
    
     public PMenu(String itemName, double price, String pharmaName) {
        this.itemName = itemName;
        this.price = price;
        this.pharmaName = pharmaName;
    }
     public PMenu(String itemName){
     
     }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPharmaName() {
        return pharmaName;
    }

    public void setPharmaName(String pharmaName) {
        this.pharmaName = pharmaName;
    }
     
          @Override
    public String toString() {
        return itemName;
    }
}
