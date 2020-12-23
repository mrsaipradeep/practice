package com.design.patterns.decoratorpattern;

public class PizzaMaker {

    public static void main(String[] args) {
        Pizza pizza = new TomatoSauce(new Mozzarella(new PlainPizza()));

        System.out.println(pizza.getCost());
        System.out.println(pizza.getDescription());
    }
}
