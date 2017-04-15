/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author Usuario
 */
public class Debts {
    
    String type;
    String brand;
    String bankName;
    long   debts;

    public Debts(String type, String name, String creditOrbank, long debts) {
        this.type = type;
        this.brand = name;
        this.bankName = creditOrbank;
        this.debts = debts;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return brand;
    }

    public void setName(String name) {
        this.brand = name;
    }

    public String getCreditOrbank() {
        return bankName;
    }

    public void setCreditOrbank(String creditOrbank) {
        this.bankName = creditOrbank;
    }

    public long getDebts() {
        return debts;
    }

    public void setDebts(long debts) {
        this.debts = debts;
    }
    
    
    
    
    
}
