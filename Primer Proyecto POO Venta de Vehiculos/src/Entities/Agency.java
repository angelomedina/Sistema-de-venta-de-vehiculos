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
public class Agency extends ComercialEstablishment {
    private String brands;

    public Agency(String name, int id, String email, String country, String rol, String pass, String type, int _incriptionNumber, String _location, int _telephoneNumber, String _comercialReason,String brands) {
        super(name, id, email, country, rol, pass, type, _incriptionNumber, _location, _telephoneNumber, _comercialReason);
        this.brands=brands;
    }

    
}
