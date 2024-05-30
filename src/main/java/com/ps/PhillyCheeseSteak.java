package com.ps;

public class PhillyCheeseSteak extends SignatureSandwich {
    public PhillyCheeseSteak() {
        super("8\"", "White", true);
    }

    @Override
    protected void addSignatureToppings() {
        addTopping(new Topping("Steak", "Meat", true, false));
        addTopping(new Topping("American Cheese", "Cheese", true, false));
        addTopping(new Topping("Peppers", "Regular", false, false));
        addTopping(new Topping("Mayo", "Sauce", false, false));
    }
}
