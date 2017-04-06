/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.Calendar;

/**
 *
 * @author Usuario
 */
public class CreditCard {
    private int _number;
    private int _ping;
    private String dueDate;
    private String _nameInCharge;
    private int _idInCharge;
    private long   _money;
    
    

    public CreditCard(int _number, int _ping, String dueDate, String _nameInCharge, int _idInCharge,long _money) {
        this._number = _number;
        this._ping = _ping;
        this.dueDate = dueDate;
        this._nameInCharge = _nameInCharge;
        this._idInCharge = _idInCharge;
        this._money=_money;
    }

    public long getMoney() {
        return _money;
    }

    public void setMoney(long _money) {
        this._money = _money;
    }

    public int getNumber() {
        return _number;
    }

    public void setNumber(int _number) {
        this._number = _number;
    }

    public int getPing() {
        return _ping;
    }

    public void setPing(int _ping) {
        this._ping = _ping;
    }



    public String getNameInCharge() {
        return _nameInCharge;
    }

    public void setNameInCharge(String _nameInCharge) {
        this._nameInCharge = _nameInCharge;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getDueDate() {
        return dueDate;
    }

    

    
    
}
