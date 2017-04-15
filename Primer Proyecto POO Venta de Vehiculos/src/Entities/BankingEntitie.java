/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.ArrayList;

/**
 *
 * @author Vinicio
 */
public class BankingEntitie {
    private String name;
    private int InterestRateUsed;
    private int InterestRateNew;
    private int yearLastFinancialModel;

    public ArrayList<BillBank> Prestamos = new ArrayList<BillBank>(); 

    
    public BankingEntitie(String name, int InterestRateUsed, int InterestRateNew,int LastFinancialModel) {
        this.name = name;
        this.InterestRateUsed = InterestRateUsed;
        this.InterestRateNew = InterestRateNew;
        this.yearLastFinancialModel=LastFinancialModel;
    }

    public int getYearLastFinancialModel() {
        return yearLastFinancialModel;
    }

    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInterestRateUsed() {
        return InterestRateUsed;
    }

    public void setInterestRateUsed(int InterestRateUsed) {
        this.InterestRateUsed = InterestRateUsed;
    }

    public int getInterestRateNew() {
        return InterestRateNew;
    }

    public void setInterestRateNew(int InterestRateNew) {
        this.InterestRateNew = InterestRateNew;
    }
    
    public void totalRode(int vehiculePrice){}
    
    public void interest(int vehiculePrice,String vehiculeType){}
    
}
