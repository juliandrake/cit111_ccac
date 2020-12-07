/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.Scanner;

/**
 * Determines if a user has enough fuel to travel to the nearest gas station
 * given the car's remaining fuel and the distance to the nearest gas station.
 * @author julian
 */
public class WillIMakeIt {
    
    public static void main(String[] args) {
        
    
        // declare doubles remainingGas, remainingDistance, and milesPerGallon
        double remainingGas, remainingDistance, milesPerGallon;
        
        // create a new Scanner object
        Scanner userInputScanner = new Scanner(System.in);
        
        // prompt the user for their remaining gas
        System.out.println("How many gallons of gas remain in your tank?");
        
        // store the user's inputted value in the variable remainingGas
        remainingGas = userInputScanner.nextDouble();
        
        // prompt the user for their remaining distance
        System.out.println("How many miles to the next gas station?");
        
        // store the user's inputted value in the variable remainingDistance
        remainingDistance = userInputScanner.nextDouble();
        
        // prompt the user for their car's miles-per-gallon rating
        System.out.println("How many miles can your car travel per gallon of gas?");
        
        // store the user's inputted value in the variable milesPerGallon
        milesPerGallon = userInputScanner.nextDouble();
        
        // check if any of these values are negative
        if (milesPerGallon >= 0 && remainingDistance >= 0 && remainingGas >= 0) {
            // comprare the remaining distance to the value of the remaining gas * the car's miles per gallon
            if (remainingDistance < (remainingGas * milesPerGallon)) {
                // if the user can travel farther than the remaining distance, tell them they'll make it
                System.out.println("You have enough gas to make it!");
            } else {
                // if the user cannot travel farther than the remaining distance, tell them they won't make it
                System.out.println("Sorry, it looks like you aren't going to make it.");
                
                // initialize the variable remainingDistanceAfterTraveling with
                // the distance to the gas station minus the car's remaining gas * the car's miles per gallon
                double remainingDistanceAfterTraveling = remainingDistance - (remainingGas * milesPerGallon);
                System.out.println("You will have " + remainingDistanceAfterTraveling + 
                        " miles remaining after running out of fuel.");
                // initialize the variable milesPerGallonNeede with the distance to
                // the gas station divided by the car's remaining gas
                double milesPerGallonNeeded = remainingDistance / remainingGas;
                System.out.println("In order to reach the destination, your car would need a gas milage of "
                        + milesPerGallonNeeded + " miles per gallon.");
            } // close if/else statement
        } else {
            System.out.println("Sorry, one of these values is negative. Please try again!");
        } // close the if/else statement
        
    } // close main method
} // close class WillIMakeIt
