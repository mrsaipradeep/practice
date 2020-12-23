package com.design.patterns.observerpattern;

public interface Subject {

    public void register(Observer observer);
    public void unRegister(Observer observer);
    public void notifyObserver();
}
