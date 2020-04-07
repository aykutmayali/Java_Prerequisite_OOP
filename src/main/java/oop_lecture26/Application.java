package oop_lecture26;

import oop_lecture26.test.ApplicationTest;

import java.util.ArrayList;
import java.util.LinkedList;

import static oop_lecture26.test.ApplicationTest.VehicleTest;

public class Application {
    public static void main(String[] args){
       // ArrayList<Vehicles> vehiclesList=new ArrayList<Vehicles>();
        LinkedList<Vehicles>  vehiclesList=new LinkedList<Vehicles>();
        Vehicles vehicle2=new Vehicles("Toyota","Rav4",420000);

        vehiclesList.add(new Vehicles("Honda","CRV",42000));
        vehiclesList.add(vehicle2);

        for(Vehicles car:vehiclesList){
            System.out.println(car.getMake());
            System.out.println(car.getModel());
            VehicleTest(car);
        }
    }
}
