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
public class BillBank {
    
    // basic info
    String nameBank;
    String nameBuyer;
    String nameSeler;
    //  auto info
    String autoStatus;
    long priceAuto; 
    long bonus;
    long amountOFfinancing;
    int  creditReport;
    long interest;
    long totalInterest;
    long costAuto;

    public BillBank(String nameBank, String nameBuyer, String nameSeler, String autoStatus, long priceAuto, long bonus, long amountOFfinancing, int creditReport, long interest, long totalInterest, long costAuto) {
        this.nameBank = nameBank;
        this.nameBuyer = nameBuyer;
        this.nameSeler = nameSeler;
        this.autoStatus = autoStatus;
        this.priceAuto = priceAuto;
        this.bonus = bonus;
        this.amountOFfinancing = amountOFfinancing;
        this.creditReport = creditReport;
        this.interest = interest;
        this.totalInterest = totalInterest;
        this.costAuto = costAuto;
    }

    public String getNameBank() {
        return nameBank;
    }

    public void setNameBank(String nameBank) {
        this.nameBank = nameBank;
    }

    public String getNameBuyer() {
        return nameBuyer;
    }

    public void setNameBuyer(String nameBuyer) {
        this.nameBuyer = nameBuyer;
    }

    public String getNameSeler() {
        return nameSeler;
    }

    public void setNameSeler(String nameSeler) {
        this.nameSeler = nameSeler;
    }

    public String getAutoStatus() {
        return autoStatus;
    }

    public void setAutoStatus(String autoStatus) {
        this.autoStatus = autoStatus;
    }

    public long getPriceAuto() {
        return priceAuto;
    }

    public void setPriceAuto(long priceAuto) {
        this.priceAuto = priceAuto;
    }

    public long getBonus() {
        return bonus;
    }

    public void setBonus(long bonus) {
        this.bonus = bonus;
    }

    public long getAmountOFfinancing() {
        return amountOFfinancing;
    }

    public void setAmountOFfinancing(long amountOFfinancing) {
        this.amountOFfinancing = amountOFfinancing;
    }

    public int getCreditReport() {
        return creditReport;
    }

    public void setCreditReport(int creditReport) {
        this.creditReport = creditReport;
    }

    public long getInterest() {
        return interest;
    }

    public void setInterest(long interest) {
        this.interest = interest;
    }

    public long getTotalInterest() {
        return totalInterest;
    }

    public void setTotalInterest(long totalInterest) {
        this.totalInterest = totalInterest;
    }

    public long getCostAuto() {
        return costAuto;
    }

    public void setCostAuto(long costAuto) {
        this.costAuto = costAuto;
    }
    
    
    
    
}
