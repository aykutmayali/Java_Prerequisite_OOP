package oop_lecture26;

import java.util.LinkedList;
import java.util.List;

import static oop_lecture26.test.ApplicationTest.VehicleTest;

public class Application {
    public static void main(String[] args){
       // ArrayList<Vehicles> vehiclesList=new ArrayList<Vehicles>();
        LinkedList<Vehicles>  vehiclesList=new LinkedList<Vehicles>();
        Vehicles vehicle2=new Vehicles("Toyota","Rav4",420000);

        vehiclesList.add(new Vehicles("Honda","CRV",42000));
        vehiclesList.add(vehicle2);

        for(Vehicles car:vehiclesList){
           /* System.out.println(car.getMake());
            System.out.println(car.getModel());*/
            VehicleTest(car);
            System.out.println(car); // with the help of generate toString
        }

        printElements(vehiclesList);
    }

    public static void printElements(List someList){
        for (int i=0;i<someList.size();i++){
            System.out.println(someList.get(i));
        }
    }
}
