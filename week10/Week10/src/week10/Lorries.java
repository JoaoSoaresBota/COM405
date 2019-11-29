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
public class Lorries extends Vehicle {
    
    public Lorries(String registrationIn, double weightIn) {
        super(registrationIn, weightIn);
    }
    
    @Override
    public double calculateFee() {
        double fee = 10;
        double cost=0;
        cost= weight*fee;
        return cost;
    }

    
}
