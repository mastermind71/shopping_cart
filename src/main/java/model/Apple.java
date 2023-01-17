package model;

import model.constants.*;


public class Apple extends Food {
    private String colour;

    public Apple(int amount, double price, String colour) {
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        this.isVegetarian = true;
    }

    @Override
    public double getDiscount() {
        if (this.colour.equals(Colour.RED)) {
            return Discount.DISCOUNT;
        } else {
            return 0;
        }
    }
}
