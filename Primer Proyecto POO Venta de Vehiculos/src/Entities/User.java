/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.lang.reflect.Array;
import Interface.*;
/**
 *
 * @author Vinicio
 */
public class User implements publicInformation {
    private String _type;
    private String _name;
    private int _id;
    private String _email;
    private String _country;
    private String _rol;
    private String _password;
    private Array wishList[];
    private Array boughtCars[];

    public User(String name, int id, String email, String country,String rol,String pass,String type) {
        this._name = name;
        this._id = id;
        this._email = email;
        this._country = country;
        this._rol = rol;
        this._password=pass;
        this._type=type;
    }

    public String getName() {
        return _name;
    }
    
     public String getPass() {
        return _password;
    }
    
    public void setName(String _name) {
        this._name = _name;
    }

    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public String getEmail() {
        return _email;
    }

    public void setEmail(String _email) {
        this._email = _email;
    }

    public String getCountry() {
        return _country;
    }

    public void setCountry(String _country) {
        this._country = _country;
    }

    public Array[] getWishList() {
        return wishList;
    }

    public void setWishList(Array[] wishList) {
        this.wishList = wishList;
    }

    public Array[] getBoughtCars() {
        return boughtCars;
    }

    public void setBoughtCars(Array[] boughtCars) {
        this.boughtCars = boughtCars;
    }

    public String getType() {
        return _type;
    }

    public void setType(String _type) {
        this._type = _type;
    }
    
    
    
    public void login(){};

    @Override
    public String printNewVehicles(String typeOfSearch) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String printUsedVehicles(String typeOfSearch) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String printDiscountVehicles() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
