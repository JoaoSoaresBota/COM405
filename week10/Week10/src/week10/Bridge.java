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
public class Bridge {
    private  Vehicle[] bridgeSlots;
    private int maxWeight;
    
    public Bridge(int max,int vehicleLimit){
        maxWeight= max;
        bridgeSlots=new Vehicle[10];
    }
    public int calcTotalWeight(){
        int totalWeight = 0;
        for (int i=0; i<bridgeSlots.length; i++){
            if(bridgeSlots[i] != null){
                totalWeight += bridgeSlots[i].getWeight();
            }
        }
        return totalWeight;
    }
   public  boolean addVehicle(Vehicle veh){
       
       if(veh.getWeight()+ calcTotalWeight()< maxWeight){
       for (int i=0; i<bridgeSlots.length; i++){
            if(bridgeSlots[i] != null){
                bridgeSlots[i] = veh;
                return true;
            }
        }
       }
        return false;
    }
    
   public boolean removeVehicle(String reg){
    
    for (int i=0; i<bridgeSlots.length; i++){
            if(bridgeSlots[i] != null){
                if(bridgeSlots[i].registrationNumber.equals(reg))
                bridgeSlots[i] = null;
                return true;
            }
        }
    return false;
       }
}
   
   
   
   

