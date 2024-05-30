package com.ps;

public class Drink extends Product {
    private String size;
    private String flavor;

    public Drink(String size, String flavor) {
        this.size = size;
        this.flavor = flavor;
    }

    @Override
    public double calcPrice() {
        return switch (size) {
            case "Small" -> price = 2.00;
            case "Medium" -> price = 2.50;
            case "Large" -> price = 3.00;
            default -> 0;
        };
    }

    @Override
    public String toString() {
        return size + " " + flavor + " drink";
    }
}
