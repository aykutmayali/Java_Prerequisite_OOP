package oop_lecture26;

public class Vehicles {
    String make;
    String model;
    int price;

    public Vehicles(String make, String model, int price) {
        this.make = make;
        this.model = model;
        this.price = price;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vehicles{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }
}
