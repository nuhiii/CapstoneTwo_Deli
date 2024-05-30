package com.ps;

public abstract class Product {
    protected double price;

    public double getPrice() {
        return calcPrice();
    }

    protected abstract double calcPrice();
    public abstract String toString();
}
