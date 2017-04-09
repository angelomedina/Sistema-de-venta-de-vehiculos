/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import Abstract.Vehicule;

import java.util.ArrayList;

/**
 *
 * @author Vinicio
 */
public class Agency extends Seler {
    private String brands;
    private int incriptionNumber;
    private String location;
    private String telephoneNumber;
    private String commercialReason;
    

    public Agency(String name, int id, String email, String country, String rol, String pass, String type, int _incriptionNumber, String _location, int _telephoneNumber, String _comercialReason,String brands) {
        super(name,id,email,country,rol,pass,type);
        this.brands=brands;
    }

    
}
