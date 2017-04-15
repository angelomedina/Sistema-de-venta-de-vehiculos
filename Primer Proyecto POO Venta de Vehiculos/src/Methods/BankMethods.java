/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

import Entities.BankingEntitie;
import Entities.BillBank;
import Entities.User;
import Grafics.Login;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class BankMethods {
    
    public ArrayList<BankingEntitie> allBanks  = new ArrayList<BankingEntitie>(); 
    
    public void addBank(BankingEntitie bank){
        allBanks.add(bank);
    }
    
    
    public void printBanks() {
        for(BankingEntitie i : Login.metBank.allBanks)
        {
            System.out.println(i.getName());
        }
    }
    public long calculate25Percent(long precioVehiculo)
    {
        return precioVehiculo*25/100;
        
    }
}

