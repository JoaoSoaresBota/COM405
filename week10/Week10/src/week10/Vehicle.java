package week10;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 4soarj03
 */
public abstract class Vehicle {

    protected String registrationNumber;
    protected int  weight;

    public Vehicle(String registrationIn, int weightIn) {
        registrationIn = registrationNumber;
        weightIn = weight;
    }

    public abstract double calculateFee();

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getWeight() {
        return weight;
    }

}
