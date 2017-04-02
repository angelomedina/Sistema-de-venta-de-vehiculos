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
    
    public Buyer(String name, int id, String email, String country,String rol,String pass,String type) {
        super(name, id, email, country,rol,pass,type);
    }
    
    public void record(){}
    
    public void verifyCard(int cardNumber){}
    
    public void addCard(int cardNumber,int ping, Calendar dueDate,int id,String nombre){}
    
    public void vehiclesCounter(){}
    
    public void totalPurchages(){}

    public void totalDepts(){}
    
    
    
}
