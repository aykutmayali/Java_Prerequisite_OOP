package oop_lecture20_carDealership;

public class Dealership {
    public static void main(String[] args){
        Customer cust1=new Customer();
        cust1.setName("Tom");
        cust1.setAddress("123 strett base");
        cust1.setCashOnHand(32000);
        Vehicle vehicle=new Vehicle();
        vehicle.setBrand("Suzuki");
        vehicle.setModel("Vitara");
        vehicle.setYear(1995);
        vehicle.setPrice(30000);

        Employee emp=new Employee();

        cust1.purchaseCar(vehicle,emp,false);



    }
}
