package com.design.patterns.Strategy;

public class AnimalPlay{

    public static void main(String[] args){

        Animal dog1 = new Dog();
        Animal bird1 = new Bird();

        System.out.println("Dog: " + dog1.tryToFly());

        System.out.println("Bird: " + bird1.tryToFly());

        // This allows dynamic changes for flyingType
        dog1.setFlyingAbility(new ItFlys());

        System.out.println("Dog: " + dog1.tryToFly());

    }

}
