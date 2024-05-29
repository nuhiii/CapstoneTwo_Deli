package com.ps;

import java.util.ArrayList;
import java.util.List;

public class Sandwich extends Product {
    private String size;
    private String bread;
    private List<Topping> toppings = new ArrayList<>();
    private boolean toasted;

    public Sandwich(String size, String bread, boolean toasted) {
        this.size = size;
        this.bread = bread;
        this.toasted = toasted;
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    @Override
    public double calcPrice() {
        return 0;
    }
}
