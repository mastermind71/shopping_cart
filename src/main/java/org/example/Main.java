package org.example;

import model.Meat;
import model.Apple;
import model.Food;
import model.constants.Colour;
import service.ShoppingCart;


public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple appleRed = new Apple(10, 50, Colour.RED);
        Apple appleGreen = new Apple(8, 60, Colour.GREEN);
        Food[] myBasket = {meat, appleGreen, appleRed};
        ShoppingCart shoppingCart = new ShoppingCart(myBasket);
        System.out.println(shoppingCart.getSumWithoutDiscount());
        System.out.println(shoppingCart.getSumWithDiscount());
        System.out.println(shoppingCart.getSumVegetarianFoodWithoutDiscount());
    }
}