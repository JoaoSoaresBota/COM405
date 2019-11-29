package week10;


import week10.Vehicle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 4soarj03
 */
public class Car extends Vehicle {
    
  
    public Car(String registrationIn, double weightIn) {
        super(registrationIn, weightIn);
    }
    
    @Override
    public double calculateFee() {
        double fee = 5;
        double cost=0;
        cost= weight*fee;
        return cost;
    }
    
   
    
}
