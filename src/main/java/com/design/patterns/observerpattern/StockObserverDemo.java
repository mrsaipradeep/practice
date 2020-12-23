package com.design.patterns.observerpattern;

public class StockObserverDemo {

    public static void main(String[] args) {
        StockGrabber stockGrabber = new StockGrabber();
        StockObserver stockObserver = new StockObserver(stockGrabber);
        stockGrabber.setAmazonStockPrice(450.00);
        stockGrabber.setIbmStockPrice(550.00);
        stockGrabber.setPaypalStockPrice(650.00);



    }
}
