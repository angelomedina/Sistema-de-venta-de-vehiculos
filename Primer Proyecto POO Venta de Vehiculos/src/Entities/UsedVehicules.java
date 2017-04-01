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
public class UsedVehicules extends Vehicules {
    
    private int _mileage;
    private String _description;
    public UsedVehicules(String _type, String _brand, String _incharge, int _licensePlate, int _model, String _color, String _transmition, long _price, Array[] vehiclesList) {
        super(_type, _brand, _incharge, _licensePlate, _model, _color, _transmition, _price, vehiclesList);
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
