/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;
import Abstract.*;
import Entities.*;
import java.util.ArrayList;

/**
 *
 * @author Vinicio
 */
public class vehiculesMethods {
   ArrayList<Vehicule> vehiculesList = new ArrayList<>();  
   ArrayList<Vehicule>  discountVehiculesList = new ArrayList<>(); 
   Vehicule vehicule;
  
   
   public void addVehicule(Vehicule vehicule){
       vehiculesList.add(vehicule);
  
  }
   
   public Vehicule verify(int plate){
       for(Vehicule i:vehiculesList)
           if(i.getLicensePlate()==plate){
               return i;
           }
       return null;
   }    
   
   public void addVehicule2(Vehicule vehicule){
       discountVehiculesList.add(vehicule);
  }
   
   public String deleteCar(int plate){
      for(Vehicule i:vehiculesList)
           if(i.getLicensePlate()==plate){
               vehiculesList.remove(i);
               return "Elimindado exitosamente!";
           }
       
      return "No existe el auto";
   }    
   
  public String addDiscountToCar(int plate,int disct){
      Vehicule verifyyy = verify(plate);
      if(verifyyy!=null){
      long valorAuto = verifyyy.getPrice();
      int discount = 0;
      if(disct==10){
          discount = (int) (valorAuto-(valorAuto*0.1));
          verifyyy.setPrice(discount);
          addVehicule2(verifyyy);
          deleteCar(plate);
          return "Oferta agregada";
      }
      
      if(disct==15){
          discount = (int) (valorAuto-(valorAuto*0.15));
          verifyyy.setPrice(discount);
          addVehicule2(verifyyy);
          deleteCar(plate);
          return "Oferta agregada";
      }
     
      
      if(disct==20){
          discount = (int) (valorAuto-(valorAuto*0.15));
          verifyyy.setPrice(discount);
          addVehicule2(verifyyy);
          deleteCar(plate);
          return "Oferta agregada";
      }  
 
      }
     return "Lo sientimos ha habido un error"; 
  } 
}
