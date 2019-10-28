/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author User
 */
@Entity
public class History implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Car car;
    @OneToOne
    private Buyer buyer;
    @Temporal (TemporalType.TIMESTAMP)
    private Date takeOn;
    private int payment;
    private int quantity;

    public History() {
    }

    public History(Car car, Buyer buyer, Date takeOn, int payment, int quantity) {
        this.car = car;
        this.buyer = buyer;
        this.takeOn = takeOn;
        this.payment = payment;
        this.quantity = quantity;
    }

    public Car getCar() {
        return car;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public Date getTakeOn() {
        return takeOn;
    }

    public int getPayment() {
        return payment;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public void setTakeOn(Date takeOn) {
        this.takeOn = takeOn;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "History{" + "car=" + car + ", buyer=" + buyer + ", takeOn=" + takeOn + ", payment=" + payment + ", quantity=" + quantity + '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}