/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.lang.reflect.Array;

/**
 *
 * @author Vinicio
 */
public class Seler extends User {

    private Array discoutsCars[];
    private Array vehiclesList[];
    
    
    public Seler(String name, int id, String email, String country,String rol,String pass,String type) {
        super(name, id, email, country ,rol,pass,type);
        
        
    }

    
    public void buyVehicle(){}
    
    public void modifyPrice(int licensePlate, int newPrice){}
    
    public void modifyMileage(int licensePlate,int newMileage){}
    
    public void addDiscountCars(){}  //Vehicle vehicle parametro
    
    
}
