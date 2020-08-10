package com.design.patterns.Observer;

public class StockObserver implements Observer{

    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;
    private static int observerIDTracker = 0;    // Static used as a counter
    private  int observerID;    // Used to track the observers
    private Subject stockGrabber;   // Will hold reference to the StockGrabber object

    public StockObserver(Subject stockGrabber){
        // Store the reference to the stockGrabber object so
        // we can make calls to its methods
        this.stockGrabber = stockGrabber;

        // Assign an observer ID and increment the static counter
        this.observerID = ++observerIDTracker;

        System.out.println("New Observer " + this.observerID);

        // Add the observer to the Subjects ArrayList
        stockGrabber.register(this);
    }

    // Called to update all observers
    @Override
    public void update(double ibmPrice, double aaplPrice, double googPrice) {
        this.ibmPrice =  ibmPrice;
        this.aaplPrice = aaplPrice;
        this.googPrice = googPrice;

        printPrices();
    }

    private void printPrices() {
        System.out.println(observerID + "\nIBM: " + ibmPrice +
                "\nAAPL: " + aaplPrice + "\nGOOG: " + googPrice +"\n");
    }
}
