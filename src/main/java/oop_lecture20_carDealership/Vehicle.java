package oop_lecture20_carDealership;

public class Vehicle {
    private String Brand;
    private String Model;
    private Integer Year;
    private Integer Price;

    public String getBrand() {
        return Brand;
    }

    public String getModel() {
        return Model;
    }

    public Integer getYear() {
        return Year;
    }

    public Integer getPrice() {
        return Price;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public void setModel(String model) {
        Model = model;
    }

    public void setYear(Integer year) {
        Year = year;
    }

    public void setPrice(Integer price) {
        Price = price;
    }
}
