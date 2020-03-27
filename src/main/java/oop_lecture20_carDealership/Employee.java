package oop_lecture20_carDealership;

public class Employee {
    private String name;
   public void  handleCustomer(Customer cust,boolean finance,Vehicle vehicle){
      if(finance==true){
          double loanAmount=vehicle.getPrice()-cust.getCashOnHand();
          runCreditHistory(cust,loanAmount);
       }else if(vehicle.getPrice()<=cust.getCashOnHand()){
          // cust pay in cash
          processTransaction(cust,vehicle);
      }

    }

    public void runCreditHistory(Customer cust,double loanAmount){
       System.out.println("Ran credit history ...");
       System.out.println("Customer has been approved to purchase the vehicle");
    }

    public void processTransaction(Customer cust,Vehicle vehicle){
       System.out.println("Customer has purchased the vehicle "+vehicle.getModel()+" for the price "+vehicle.getPrice());
    }

}
