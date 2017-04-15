/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;
import Entities.*;
import java.lang.reflect.Array;

/**
 *
 * @author Vinicio
 */
public abstract class Vehicule {

    private String _type;
    private String _brand;
    private String _incharge;
    private int _licensePlate;
    private int _model;
    private String _color;
    private String _transmition;
    private long _price;
    private String _newOrused;
    
    public Vehicule(){}

    public Vehicule(String type, String brand, String incharge, int licensePlate, int model, String color, String transmition, long price,String newOrused) {
        this._type = type;
        this._brand = brand;
        this._incharge = incharge;
        this._licensePlate = licensePlate;
        this._model = model;
        this._color = color;
        this._transmition = transmition;
        this._price = price;
        this._newOrused= newOrused;
    }

    public String getNewOrused() {
        return _newOrused;
    }

    public void setNewOrused(String _newOrused) {
        this._newOrused = _newOrused;
    }

    
    
    public String getType() {
        return _type;
    }

    public void setType(String _type) {
        this._type = _type;
    }

    public String getBrand() {
        return _brand;
    }

    public void setBrand(String _brand) {
        this._brand = _brand;
    }

    public String getIncharge() {
        return _incharge;
    }

    public void setIncharge(String _incharge) {
        this._incharge = _incharge;
    }

    public int getLicensePlate() {
        return _licensePlate;
    }

    public void setLicensePlate(int _licensePlate) {
        this._licensePlate = _licensePlate;
    }

    public int getModel() {
        return _model;
    }

    public void setModel(int _model) {
        this._model = _model;
    }

    public String getColor() {
        return _color;
    }

    public void setColor(String _color) {
        this._color = _color;
    }

    public String getTransmition() {
        return _transmition;
    }

    public void setTransmition(String _transmition) {
        this._transmition = _transmition;
    }

    public long getPrice() {
        return _price;
    }

    public void setPrice(long _price) {
        this._price = _price;
    }

    
    
    
    }
