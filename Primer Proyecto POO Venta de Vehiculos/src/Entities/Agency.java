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
    private Array brands[];

    public Agency(int _incriptionNumber, String _location, int _telephoneNumber, String _comercialReason) {
        super(_incriptionNumber, _location, _telephoneNumber, _comercialReason);
    }
    
}
