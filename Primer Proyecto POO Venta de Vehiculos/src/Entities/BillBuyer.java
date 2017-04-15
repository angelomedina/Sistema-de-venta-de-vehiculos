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
public class BillBuyer {
    
    String buyerName;
    String selerName;
    String autoStatus;
    long   autoPrice;
    int    autoPlate;
    String autoBrand;

    public BillBuyer(String buyerName, String selerName, String autoStatus, long autoPrice, int autoPlate,String brand) {
        this.buyerName = buyerName;
        this.selerName = selerName;
        this.autoStatus = autoStatus;
        this.autoPrice = autoPrice;
        this.autoPlate = autoPlate;
        this.autoBrand = brand;
        
    }

    public String getAutoBrand() {
        return autoBrand;
    }

    public void setAutoBrand(String autoBrand) {
        this.autoBrand = autoBrand;
    }
    
    

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getSelerName() {
        return selerName;
    }

    public void setSelerName(String selerName) {
        this.selerName = selerName;
    }

    public String getAutoStatus() {
        return autoStatus;
    }

    public void setAutoStatus(String autoStatus) {
        this.autoStatus = autoStatus;
    }

    public long getAutoPrice() {
        return autoPrice;
    }

    public void setAutoPrice(long autoPrice) {
        this.autoPrice = autoPrice;
    }

    public int getAutoPlate() {
        return autoPlate;
    }

    public void setAutoPlate(int autoPlate) {
        this.autoPlate = autoPlate;
    }
    
    
    
    

    
}
