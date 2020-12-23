package com.design.patterns.decoratorpattern;

public class Mozzarella extends ToppingsDecorator {
    public Mozzarella(Pizza newPizza) {
        super(newPizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Mozzarella";
    }

    @Override
    public double getCost() {
        return super.getCost() + .50;
    }
}
