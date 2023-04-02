/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Helper.Helper;
import Business.Person.Person;
import java.time.LocalDate;

/**
 *
 * @author grees
 */
public class HelperWorkRequest extends WorkRequest {
    
     private String hstatus;
     private LocalDate date;
     private Person person;
     private Helper helper;
     private int days;
     private double price;
     private String prof;
     private String add;
     private String pname;

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }
     
     

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }
     
     

    public String getProf() {
        return prof;
    }

    public void setProf(String prof) {
        this.prof = prof;
    }
     
     

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
     
     

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
     
     

    public Helper getHelper() {
        return helper;
    }

    public void setHelper(Helper helper) {
        this.helper = helper;
    }
     
     

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
     
     

    public String getHstatus() {
        return hstatus;
    }

    public void setHstatus(String hstatus) {
        this.hstatus = hstatus;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
     
     
     
     
            @Override
   public String toString() {
       return this.hstatus;
   }
    
    
}
