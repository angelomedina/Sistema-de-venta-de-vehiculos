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
public class Wishes {
    String brand;
    String status;
    long   plate;
    long   price;

    public Wishes(String brand, String status, long plate, long price) {
        this.brand = brand;
        this.status = status;
        this.plate = plate;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getPlate() {
        return plate;
    }

    public void setPlate(long plate) {
        this.plate = plate;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
    
    
    
    
}
