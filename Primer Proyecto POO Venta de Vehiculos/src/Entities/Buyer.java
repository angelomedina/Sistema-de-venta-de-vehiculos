/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.lang.reflect.Array;
import java.util.Calendar;

/**
 *
 * @author Vinicio
 */
public class Buyer extends User {
    
    public Buyer(String _name, int _id, String _email, String _country, Array[] wishList, Array[] boughtCars) {
        super(_name, _id, _email, _country, wishList, boughtCars);
    }
    
    public void record(){}
    
    public void verifyCard(int cardNumber){}
    
    public void addCard(int cardNumber,int ping, Calendar dueDate,int id,String nombre){}
    
    public void vehiclesCounter(){}
    
    public void totalPurchages(){}

    public void totalDepts(){}
    
    
    
}
