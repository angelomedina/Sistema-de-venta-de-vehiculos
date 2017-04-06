/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

import Entities.CreditCard;
import Entities.User;
import java.util.ArrayList;


/**
 *
 * @author Vinicio
 */
public class UserMethods {

   public ArrayList<User> userList = new ArrayList<User>(); 
   

    public UserMethods() {
    }
    
    public boolean verifyUser(String nombre, String pass) {
        for(User i:userList){
            if(i.getName().equals(nombre)&& i.getPass().equals(pass))
            {
                return true;
            }
        }
        return false;
    }
    
     public User ReturnObjet(String nombre, String pass) {
        for(User i:userList){
            if(i.getName().equals(nombre)&& i.getPass().equals(pass))
            {
                return i;
            }
        }
        return null;
    }
    
    public boolean verifyName( String Name) {
        for(User i:userList){
            if( i.getName().equals(Name))
            {
                return true;
            }
        }
        return false;
    }
    
    public void registrar(User user){
        userList.add(user);
    }

    
    public void addToWishList(int licensePlate){}

    public void verifyWishList(){}

    public void addBoughtCars(int licensePlate){}
    
    

}
