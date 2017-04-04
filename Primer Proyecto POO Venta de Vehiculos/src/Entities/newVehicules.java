/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;
import Abstract.*;
import java.lang.reflect.Array;
/**
 *
 * @author Vinicio
 */
public class newVehicules extends Vehicule {
    
    public newVehicules(){}
    
    public newVehicules(String type, String brand, String incharge, int licensePlate, int model, String color, String transmition, long price) {
        super(type, brand, incharge, licensePlate, model, color, transmition, price );
    }
public void printVehicules()
    {
        System.out.println("placa: "+this.getLicensePlate()+"\t"+"precio "+this.getPrice()+"encargado"+this.getIncharge());    
    }
}
