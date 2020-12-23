package com.design.patterns.observerpattern;

public class StockObserver implements Observer {
    private double ibmPrice;
    private double paypalPrice;
    private double amazonPrice;

    private static int observerIdTracker;

    private int observerId;
    private StockGrabber stockGrabber;

    public StockObserver(StockGrabber stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.observerId = ++observerIdTracker;
        System.out.println("New observer Id : " + observerId);
        stockGrabber.register(this);
    }

    @Override
    public void update(double ibmPrice, double paypalPrice, double amazonPrice) {
        this.ibmPrice = ibmPrice;
        this.amazonPrice = amazonPrice;
        this.paypalPrice = paypalPrice;

        printThePrices();
    }

    public void printThePrices()
    {
        System.out.println("Stock Prices : IBM " + ibmPrice);
        System.out.println("Stock Prices : AMAZON " + amazonPrice);
        System.out.println("Stock Prices : PAYPAL " + paypalPrice);

    }


}
