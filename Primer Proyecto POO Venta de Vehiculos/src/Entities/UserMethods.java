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
public class UserMethods {

    ArrayList<User> userList = new ArrayList<User>(); 
    
    public UserMethods() {
    }
    
     public boolean verifyUser (String nombre, String pass) {
        for(User i:userList){
            if(i.getName().equals(nombre)&& i.getPass().equals(pass));
            return true;
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
