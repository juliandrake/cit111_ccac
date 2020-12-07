/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.Scanner;

/**
 * Takes the speed of a car and compares it to a minimum and maximum speed.
 * @author julian
 */
public class SpeedEnforcement {
    
   public static void main(String[] args) {
       
       // declare and initialize int variables minimumSpeed and maximumSpeed
       final int minimumSpeed = 40;
       final int maximumSpeed = 55;
       
       // declare int variable carSpeed
       int carSpeed;
       
       // create a new Scanner object
       Scanner userInputScanner = new Scanner(System.in);
       
       // prompt the user for input
       System.out.println("Enter the speed of the vehicle in mph and press enter:");
       
       // store the user's inputted integer into the variable carSpeed
       carSpeed = userInputScanner.nextInt();
       
       // if the car's speed is greater than the maximum speed...
       if (carSpeed > maximumSpeed) {
           // tell the user that the car is traveling too quickly
           System.out.println("The car is traveling over the speed limit.");
       } else {
           // if the car's speed is greater than the minimum speed
           if (carSpeed > minimumSpeed) {
               // tell the user that the car is traveling within the speed range
               System.out.println("The car is within the appropriate speed range.");
           } else {
               // if the car's speed is less than the minimum speed
               if (carSpeed < minimumSpeed) {
                   // tell the user that the car is traveling too slowly
                   System.out.println("The car is moving too slowly.");
               } // close if statement
           } // close if/else statement
       } // close if/else statement
       
   } // close main method
} // close class SpeedEnforcement
