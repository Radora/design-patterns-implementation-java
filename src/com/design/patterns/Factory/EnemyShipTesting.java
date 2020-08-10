package com.design.patterns.Factory;
import java.util.Scanner;

public class EnemyShipTesting {

    public static void main(String[] args){

        // Create the factory object
        EnemyShipFactory shipFactory = new EnemyShipFactory();

        // Enemy ship object
        EnemyShip theEnemy = null;

        Scanner userInput = new Scanner(System.in);

        System.out.print("What type of ship? (U (UFO) / R (ROCKET) / B (BIG UFO)");

        if (userInput.hasNextLine()){

            String typeOfShip = userInput.nextLine();

            theEnemy = shipFactory.makeEnemyShip(typeOfShip);

            if(theEnemy != null){

                doStuffEnemy(theEnemy);

            } else System.out.print("Please enter U, R, or B next time");

        }

		/*
		EnemyShip theEnemy = null;

		// Old way of creating the object
		// This way is not dynamic!

		EnemyShip ufoShip = new UFOEnemyShip();
		doStuffEnemy(ufoShip);

		// -----------------------------------------

		// This allows to make the program more dynamic
		// It doesn't close the code from being modified
		// and that is bad!

		Scanner userInput = new Scanner(System.in);
		String enemyShipOption = "";
		System.out.print("What type of ship? (U or R)");

		if (userInput.hasNextLine()){
			enemyShipOption = userInput.nextLine();
		}
		if (enemyShipOption == "U"){
			theEnemy = new UFOEnemyShip();
		} else
		if (enemyShipOption == "R"){
			theEnemy = new RocketEnemyShip();
		} else {
			theEnemy = new BigUFOEnemyShip();
		}
		doStuffEnemy(theEnemy);

		// --------------------------------------------
		*/

    }

    // Executes methods of the super class
    public static void doStuffEnemy(EnemyShip anEnemyShip){
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();
    }
}
