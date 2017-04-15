/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Abstract.Vehicule;
import Entities.Agency;
import Entities.BankingEntitie;
import Entities.BranchOffice;
import Entities.Buyer;
import Entities.CreditCard;
import Entities.Seler;
import Entities.UsedVehicules;
import Entities.User;
import Grafics.*;
import static Grafics.Login.userMet;
import javax.swing.UIManager;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
		UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");//nimbus


	} catch (Exception e) {
		e.printStackTrace();
	}
        
        //Comprador Perosona
        CreditCard newCard0 = new CreditCard(10,20,"15/4/21","Angelo",12,1500);
        Buyer      newUser0 = new Buyer("Angelo",12,"angelomedinabarraza@gmail.com","Costa Rica","Persona","a","Buyer",newCard0);
        Login.userMet.registrar(newUser0);//quema de 
        newUser0.myCard.add(newCard0);
        //Comprador Establecimiento Comercial
        CreditCard newCard1 = new CreditCard(20,30,"18/4/21","Autos M",15,1500);
        BranchOffice newUser1 = new BranchOffice("Autos M", 15,"autosM@co.cr","Costa Rica","Sucursal","b","Buyer",2020,"san Jose",2015,"Compro partes de autos",newCard1);
        Login.userMet.registrar(newUser1);//quema de 
        newUser1.myCard.add(newCard1);
        //Banco 
        BankingEntitie newBank0= new BankingEntitie("Banco Nacional", 10, 6,7);
        Login.metBank.addBank(newBank0);
        //Banco 
        BankingEntitie newBank1= new BankingEntitie("Banco de Costa Rica",9,4,8);
        Login.metBank.addBank(newBank1);
        //Banco 
        BankingEntitie newBank2=new BankingEntitie("Scotiabank ",10,5,5);
        Login.metBank.addBank(newBank2);
        //Comprador como persona
        Seler newSeller0 = new Seler("Pedro",20,"pedro@co,cr","Panama","Persona","p","Seller");
        userMet.registrar(newSeller0);
        //Datos de vendedor persona
        Vehicule newVehicle0 = new UsedVehicules("Sedan","Toyota","Pedro",20,2014,"Negro","Trasera","Casi nuevo",5000,4000);
        Login.vehiculesMet.addVehicule(newVehicle0 );
        Login.selerMet.putOnSale(newVehicle0 );
        //Datos de vendedor como agencia
        Agency newAgency0 = new Agency("Grupo Q",56,"grupoq@co.cr","Costa Rica","Agencia","g","Seller",444,"San Jose",2415260,"Venta de vehiculos nuevos","Toyota,Nissan,...");
        userMet.registrar(newAgency0);
  
        
        
       Login.main.setVisible(true);
       
       
    }
    
}
