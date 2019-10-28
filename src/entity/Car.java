/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author User
 */
@Entity
public class Car implements Serializable{
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String marka;
    private String model;
    private int year;
    private int price;
    private int quantity;
    private int count;

    public Car() {
    }

    public Car(String marka, String model, int year, int price, int quantity) {
        this.marka = marka;
        this.model = model;
        this.year = year;
        this.price = price;
        this.quantity = quantity;
        this.count = quantity;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getCount() {
        return count;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.setCount(quantity - this.quantity + count);
        this.quantity = quantity;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Car{" + "marka=" + marka + ", model=" + model + ", year=" + year + ", price=" + price + ", quantity=" + quantity + ", count=" + count + '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}