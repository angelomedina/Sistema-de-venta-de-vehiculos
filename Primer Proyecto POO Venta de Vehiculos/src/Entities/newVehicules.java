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
public class newVehicules extends Vehicules {
    
    public newVehicules(String _type, String _brand, String _incharge, int _licensePlate, int _model, String _color, String _transmition, long _price, Array[] vehiclesList) {
        super(_type, _brand, _incharge, _licensePlate, _model, _color, _transmition, _price, vehiclesList);
    }
    
    
}
