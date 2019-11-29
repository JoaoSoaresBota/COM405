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
    
  
    public Car(String registrationIn, int weightIn) {
        super(registrationIn, weightIn);
    }
    
    @Override
    public double calculateFee() {
        if(weight>1590){
            double additional = ((weight-1590)/100)*0.1;
            
            return 5+ additional;
            
        }
        return 5;
            
        
    }
    
   
    
}
