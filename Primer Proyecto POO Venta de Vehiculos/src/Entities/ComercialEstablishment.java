/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author Vinicio
 */
public class ComercialEstablishment  extends User{
    private int _incriptionNumber;
    private String _location;
    private int _telephoneNumber;
    private String _comercialReason;

    public ComercialEstablishment(String name, int id, String email, String country, String rol, String pass, String type,int _incriptionNumber, String _location, int _telephoneNumber, String _comercialReason) {
        super(name, id, email, country, rol, pass, type);
        this._telephoneNumber=_telephoneNumber;
        this._comercialReason=_comercialReason;
        this._location=_location;
        this._incriptionNumber=_incriptionNumber;
    }

    

    public int getIncriptionNumber() {
        return _incriptionNumber;
    }

    public void setIncriptionNumber(int _incriptionNumber) {
        this._incriptionNumber = _incriptionNumber;
    }

    public String getLocation() {
        return _location;
    }

    public void setLocation(String _location) {
        this._location = _location;
    }

    public int getTelephoneNumber() {
        return _telephoneNumber;
    }

    public void setTelephoneNumber(int _telephoneNumber) {
        this._telephoneNumber = _telephoneNumber;
    }

    public String getComercialReason() {
        return _comercialReason;
    }

    public void setComercialReason(String _comercialReason) {
        this._comercialReason = _comercialReason;
    }
    
    

        public void record(){}
}
