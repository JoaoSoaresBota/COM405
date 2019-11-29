/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

/**
 *
 * @author 4soarj03
 */
public class MotorBikes extends Vehicle {

    
    public MotorBikes(String registrationIn, int weightIn) {
        super(registrationIn, weightIn);
    }
    
    @Override
    public double calculateFee() {
        return 3;
    }
    
    
 
}
