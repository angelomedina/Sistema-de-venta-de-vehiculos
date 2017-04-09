/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;
import Abstract.*;

import java.util.ArrayList;

import Grafics.Login;
/**
 *
 * @author Vinicio
 */
public class Seler extends User {

   
   public ArrayList<Vehicule> selerVehiculesList= new ArrayList<>(); 
   public ArrayList<Vehicule>  selerDiscountList= new ArrayList<>();
    
    
    public Seler(String name, int id, String email, String country,String rol,String pass,String type) {
        super(name, id, email, country ,rol,pass,type);
          
    }

    public Seler(){}
    
    
    public void putOnSale(Vehicule vehicule){
        selerVehiculesList.add(vehicule);
    }
    
    
    public void buyVehicle(){}
    
    public void modifyPrice(int licensePlate, int newPrice){}
    
    public void modifyMileage(int licensePlate,int newMileage){}
    
    
    
    public Vehicule verify(int plate){
       for(Vehicule i:selerVehiculesList)
           if(i.getLicensePlate()==plate){
               return i;
           }
       return null;
   }    
   
   public void addVehicule2(Vehicule vehicule){
       selerDiscountList.add(vehicule);
       Login.vehiculesMet.discountVehiculesList.add(vehicule);
       
  }
   
   public String deleteCar(int plate){
      for(Vehicule i:selerVehiculesList)
           if(i.getLicensePlate()==plate){
                Login.vehiculesMet.vehiculesList.remove(i);
             
               return "Eliminado exitosamente!";
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
          //System.out.println(verifyyy.getIncharge() + verifyyy.getPrice());
          return "Oferta agregada";
      }
      
      if(disct==15){
          discount = (int) (valorAuto-(valorAuto*0.15));
          verifyyy.setPrice(discount);
          addVehicule2(verifyyy);
          deleteCar(plate);
          //System.out.println(verifyyy.getIncharge() + verifyyy.getPrice());
          return "Oferta agregada";
      }
     
      
      if(disct==20){
          discount = (int) (valorAuto-(valorAuto*0.20));
          verifyyy.setPrice(discount);
          addVehicule2(verifyyy);
          deleteCar(plate);
          //System.out.println(verifyyy.getIncharge() + verifyyy.getPrice());
          return "Oferta agregada";
      }  
 
      }
     return "Lo sientimos no se ha encontrado el auto"; 
  } 
    
    public boolean repiteCar(int plate){
      
        for(Vehicule i:Login.selerMet.selerVehiculesList)
           if(i.getLicensePlate()==plate){ 
               return true;
     }    
       return false;
}
   
    }
