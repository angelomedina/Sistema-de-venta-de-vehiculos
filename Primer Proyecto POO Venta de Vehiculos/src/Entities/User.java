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
    private String _name;
    private int _id;
    private String _email;
    private String _country;
    private Array wishList[];
    private Array boughtCars[];

    public User(String _name, int _id, String _email, String _country, Array[] wishList, Array[] boughtCars) {
        this._name = _name;
        this._id = _id;
        this._email = _email;
        this._country = _country;
        this.wishList = wishList;
        this.boughtCars = boughtCars;
    }

    public String getName() {
        return _name;
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
