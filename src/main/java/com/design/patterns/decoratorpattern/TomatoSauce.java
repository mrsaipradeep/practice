package com.design.patterns.decoratorpattern;

public class TomatoSauce extends ToppingsDecorator {
    public TomatoSauce(Pizza newPizza) {
        super(newPizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " , Tomato sauce";
    }

    @Override
    public double getCost() {
        return super.getCost() + .35;
    }
}
