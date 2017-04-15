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
public class UsedVehicules extends Vehicule {
    
    private int _mileage;
    private String _description;
    public UsedVehicules(String type, String brand, String incharge, int licensePlate, int model, String color, String transmition,String description,int mileage, long price) {
        super(type, brand, incharge, licensePlate, model, color, transmition, price,"Usado");
    this._description = description;
    this._mileage = mileage;
    }

    public int getMileage() {
        return _mileage;
    }

    public void setMileage(int _mileage) {
        this._mileage = _mileage;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String _description) {
        this._description = _description;
    }
    
    
}
