package com.ps;

public class BLT extends SignatureSandwich {
    public BLT() {
        super("8\"", "White", true);
    }

    @Override
    protected void addSignatureToppings() {
        addTopping(new Topping("Bacon", "Meat", true, false));
        addTopping(new Topping("Cheddar", "Cheese", true, false));
        addTopping(new Topping("Lettuce", "Regular", false, false));
        addTopping(new Topping("Tomato", "Regular", false, false));
        addTopping(new Topping("Ranch", "Sauce", false, false));
    }
}
