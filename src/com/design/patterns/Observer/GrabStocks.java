package com.design.patterns.Observer;

public class GrabStocks {

    public static void main(String[] args) {

        StockGrabber  stockGrabber = new StockGrabber();

        StockObserver observer1 = new StockObserver(stockGrabber);
        stockGrabber.setIBMPrice(155.00);
        stockGrabber.setAAPLPrice(467.00);
        stockGrabber.setGOOGPrice(486.54);

        stockGrabber.unregister(observer1);

        StockObserver observer2 = new StockObserver(stockGrabber);
        stockGrabber.setIBMPrice(155.00);
        stockGrabber.setAAPLPrice(467.00);
        stockGrabber.setGOOGPrice(486.54);


        Runnable getIBM = new GetTheStock(stockGrabber, 3, "IBM", 244.05);
        Runnable getAAPL = new GetTheStock(stockGrabber, 3, "AAPL", 357.54);
        Runnable getGOOG = new GetTheStock(stockGrabber, 3, "GOOG", 466.12);

        // Calling the run() method
        new Thread(getIBM).start();
        new Thread(getAAPL).start();
        new Thread(getGOOG).start();
    }

}
