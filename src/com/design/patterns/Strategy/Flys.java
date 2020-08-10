package com.design.patterns.Strategy;

// The interface is implemented by many other
// subclasses which allows for many types of flying
// without effecting Animal, or Flys.

// Classes that implement new Flys interface subclasses
// can allow other classes to use that code eliminating code duplication

// I'm decoupling : encapsulating the concept that varies

public interface Flys {

    String fly();

}

// Class to use if the animal can fly

class ItFlys implements Flys{

    public String fly() {

        return "Flying High";

    }

}

//If the animal can't fly we use this class

class CantFly implements Flys{

    public String fly() {

        return "I can't fly";

    }

}