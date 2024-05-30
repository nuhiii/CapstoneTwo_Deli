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
            case "Small" -> 2.00;
            case "Medium" -> 2.50;
            case "Large" -> 3.00;
            default -> 0;
        };
    }

    @Override
    public String toString() {
        return "Drink{" +
                "size='" + size + '\'' +
                ", flavor='" + flavor + '\'' +
                ", price=" + price +
                '}';
    }
}
