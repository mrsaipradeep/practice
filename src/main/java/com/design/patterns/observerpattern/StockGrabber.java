package com.design.patterns.observerpattern;

import java.util.ArrayList;

public class StockGrabber implements Subject {
    private ArrayList<Observer> observers;
    private double paypalStockPrice;
    private double amazonStockPrice;
    private double ibmStockPrice;

    public StockGrabber() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void unRegister(Observer observer) {
        int i = observers.indexOf(observer);
        System.out.println("Remove observer " + i);
        this.observers.remove(i);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(observer -> observer.update(ibmStockPrice, paypalStockPrice, amazonStockPrice));

    }

    public void setPaypalStockPrice(double paypalStockPrice) {
        this.paypalStockPrice = paypalStockPrice;
        notifyObserver();
    }

    public void setAmazonStockPrice(double amazonStockPrice) {
        this.amazonStockPrice = amazonStockPrice;
        notifyObserver();
    }

    public void setIbmStockPrice(double ibmStockPrice) {
        this.ibmStockPrice = ibmStockPrice;
        notifyObserver();
    }
}
