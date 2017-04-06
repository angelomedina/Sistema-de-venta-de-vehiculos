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
public class BranchOffice extends ComercialEstablishment {
   
    private CreditCard _card;
    
    public BranchOffice(String name, int id, String email, String country, String rol, String pass, String type, int _incriptionNumber, String _location, int _telephoneNumber, String _comercialReason,CreditCard _card) {
        super(name, id, email, country, rol, pass, type, _incriptionNumber, _location, _telephoneNumber, _comercialReason);
        this._card=_card;
    }
    
    public BranchOffice(String name, int id, String email, String country, String rol, String pass, String type, int _incriptionNumber, String _location, int _telephoneNumber, String _comercialReason) {
        super(name, id, email, country, rol, pass, type, _incriptionNumber, _location, _telephoneNumber, _comercialReason);
    }

    public CreditCard getCard() {
        return _card;
    }

    public void setCard(CreditCard _card) {
        this._card = _card;
    }
    
   
    
    
}
