/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.Scanner;

/**
 * Reads a use's height in cm and compares it against a hard-coded minimum height
 * @author julian
 */
public class RideHeight {
    
    public static void main(String[] args) {
        
        // declare and initialize final int MIN_HEIGHT_CM
        final int MIN_HEIGHT_CM = 80;
        
        // declare int riderHeight
        int rider1Height;
        int rider2Height;
        
        // create a Scanner object
        Scanner userInputScanner = new Scanner(System.in);
        
        // prompt the user for input
        System.out.println("The minimum height for this ride is " + MIN_HEIGHT_CM + " cm.");
        System.out.println("Please enter the first rider's height: ");
        
        // store the inputted integes in the variablesrider1Height
        rider1Height = userInputScanner.nextInt();
        
        // prompt the user for input
        System.out.println("Please enter the second rider's height: ");
        
        // store the inputted integer in the variable rider2Height
        rider2Height = userInputScanner.nextInt();
        
        // compare the riders' height to the variable MIN_HEIGHT_CM
        if ((rider1Height > MIN_HEIGHT_CM) && (rider2Height > MIN_HEIGHT_CM)) {
            // if both riders are not too short to ride, display a message containing their height
            System.out.println("Rider 1, your height of " + rider1Height + " cm means you can ride.");
            System.out.println("Rider 2, your height of " + rider2Height + " cm means you can ride.");
        } else {
            // if a rider is too short to ride, display a message to them
            System.out.println("Sorry, one of you is too short to ride.");
        } // close if/else statement
        
    } // close main method
} // close class RideHeight
