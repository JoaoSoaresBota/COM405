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

    protected int registrationNumber;
    protected int weight;

    public Vehicle(int registrationIn, int weightIn) {
        registrationIn = registrationNumber;
        weightIn = weight;
    }

    public abstract int calculateFee();

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public double getWeight() {
        return weight;
    }

}
