package com.ps;

public class Chips extends Product {
    private String brand;

    public Chips(String brand) {
        this.brand = brand;
    }

    @Override
    protected double calcPrice() {
        return price = 1.50;
    }

    @Override
    public String toString() {
        return brand + " chips";
    }
}
