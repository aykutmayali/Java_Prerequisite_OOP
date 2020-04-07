package oop_lecture26.test;

import com.sun.source.tree.IfTree;
import oop_lecture26.Vehicles;

public  class ApplicationTest {
    public static void VehicleTest(Vehicles v1){
        if(v1.getMake() != null && v1.getModel()!=null && v1.getPrice()!=0){
            System.out.println("Vehicle exists Test ok");
        }else{
            System.out.println("Vehicle does not exists , problem can be @constructor");
        }
    }
}
