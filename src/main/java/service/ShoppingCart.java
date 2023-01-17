package service;

import model.Food;


public class ShoppingCart {
    private Food[] basket;

    public ShoppingCart(Food[] basket) {
        this.basket = basket;
    }

    public double getSumWithoutDiscount() {
        double sum = 0;
        for (int i = 0; i < basket.length; i++) {
            sum += basket[i].getAmount() * basket[i].getPrice();
        }
        return sum;
    }

    public double getSumWithDiscount() {
        double sum = 0;
        for (int i = 0; i < basket.length; i++) {
            sum += basket[i].getAmount() * basket[i].getPrice() * (100 - basket[i].getDiscount()) / 100;
        }
        return sum;
    }

    public double getSumVegetarianFoodWithoutDiscount() {
        double sum = 0;
        for (int i = 0; i < basket.length; i++) {
            if (basket[i].isVegetarian()) {
                sum += basket[i].getAmount() * basket[i].getPrice();
            }
        }
        return sum;
    }
}
