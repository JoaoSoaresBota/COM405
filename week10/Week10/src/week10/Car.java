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
    
  
    public Car(int registrationIn, int weightIn) {
        super(registrationIn, weightIn);
    }
    
    @Override
    public int calculateFee() {
        int fee = 5;
        int cost=0;
        cost= weight*fee;
        return cost;
    }
    
   
    
}
