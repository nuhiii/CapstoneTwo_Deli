package com.ps;

public class Chips extends Product {
    private String brand;

    public Chips(String brand) {
        this.brand = brand;
        this.price = 1.50;
    }

    @Override
    public double calcPrice() {
        return price;
    }

    @Override
    public String toString() {
        return brand + " chips";
    }
}
