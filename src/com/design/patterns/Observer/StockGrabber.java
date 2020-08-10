package com.design.patterns.Observer;
import java.util.ArrayList;

// Uses the Subject interface to update all Observers
public class StockGrabber implements Subject{

    private ArrayList<Observer> observers;
    private double  ibmPrice;
    private double aaplPrice;
    private double googPrice;

    public StockGrabber(){
        observers = new ArrayList<Observer>();
    }

// Adds a new observer to the ArrayList
    @Override
    public void register(Observer newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void unregister(Observer observerToDelete) {
        // Get the index of the observer to delete
        int observerIndex = observers.indexOf(observerToDelete);

        // Print out message (Have to increment index to match)
        System.out.println("Observer " + (observerIndex +1) + " deleted");

        // Removes observer from the ArrayList
        observers.remove(observerIndex);
    }

    @Override
    public void notifyObserver() {
        // Cycle through all observers and notifies them of price changes
        for(Observer obs : observers){
            obs.update(ibmPrice, aaplPrice, googPrice);
        }
    }

    public void setIBMPrice(double newIBMPrice){
        this.ibmPrice = newIBMPrice;
        notifyObserver();
    }
    public void setAAPLPrice(double newAAPLPrice){
        this.aaplPrice = newAAPLPrice;
        notifyObserver();
    }
    public void setGOOGPrice(double newGOOGPrice){
        this.googPrice = newGOOGPrice;
        notifyObserver();
    }
}
