/*
 * Copyright 2020 julian.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package week11;

import java.util.Random;
import java.util.Scanner;

/**
 * Simulates the motion of a projectile.
 * The equations used in my calculations were taken from here:
 * https://courses.lumenlearning.com/boundless-physics/chapter/projectile-motion/
 * @author julian
 */
public class ProjectileSimulator {
    
    // initalize member variables
    private static double bestFlightTime = 0.0;
    private static double bestRange = 0.0;
    // the purpose of these next 4 variables is to store the velocity and angle
    // that led to the optimal flight time/range
    private static double flightVelocity = 0.0;
    private static double flightAngle = 0.0;
    private static double rangeVelocity = 0.0;
    private static double rangeAngle = 0.0;
    // constant for gravitational acceleration
    final static double GRAVITATIONAL_ACCELERATION = 9.8;
    
    
    public static void main(String[] args) {
        
        // create a Scanner object
        Scanner myScanner = new Scanner(System.in);
        
        // display a menu to the user
        System.out.println("Welcome to my projectile simulator!");
        System.out.println("Please select an option.");
        System.out.println("===========================");
        System.out.println("1 - Manual Trial (Simulates the motion of a projectile"
                + " given a velocity and angle)");
        System.out.println("2 - Automatic Trial (Simulates an inputted number of "
                + "projectiles launched with random velocities and angles"
                + " to determine the ideal conditions to optimize flight)");
        // store user's choice in int userChoice
        int userChoice = myScanner.nextInt();
        // run method corresponding to user's choice
        switch (userChoice) {
            case 2:
                automaticTrial(myScanner); // pass in a Scanner to both methods to use
                break;
            default: // defaults to doing option 1 if inputted int is not valid
                manualTrial(myScanner);
        }
        
        
    } // close method main
    
    public static double getFlightTime(double velocity, double angle) {
        // time of flight = 2 * velocity * sin(angle) / gravity
        
        // note: because Math.sin() takes radians instead of degrees, we need to
        // convert degrees to radians using Math.toRadians()
        double angleRadians = Math.toRadians(angle);
        
        // calculate flight time and store in double flightTime
        double flightTime = 2 * velocity * Math.sin(angleRadians) / GRAVITATIONAL_ACCELERATION;
        
        // round to two decimal points by multiplying by 100.0, rounding with
        // Math.round(), and dividing by 100.0
        // I discovered this method from here:
        // https://stackoverflow.com/questions/5945867/how-to-round-the-double-value-to-2-decimal-points
        flightTime = Math.round(flightTime * 100.0) / 100.0;
        
        return flightTime;
    } // close method getFlightTime
    
    public static double getRange(double velocity, double angle) {
        // range = velocity^2 * sin(2*angle) / gravity
        
        // again, convert angle to radians to pass into Math.sin()
        double angleRadians = Math.toRadians(angle);
        
        // calculate range and store in double range
        double range = Math.pow(velocity, 2) * Math.sin(2*angleRadians) / GRAVITATIONAL_ACCELERATION;
        
        // use the same rounding method as getFlightTime() to round to two decimal points
        range = Math.round(range * 100.0) / 100.0;
        
        return range;
    } // close method getRange
    
    public static void manualTrial(Scanner scanner) {
        System.out.println("MANUAL TRIAL===============");
        // prompt user for velocity and store in double inputtedVelocity
        System.out.println("Velocity (m/s): ");
        double inputtedVelocity = scanner.nextDouble();
        // prompt user for angle and store in double inputtedAngle
        System.out.println("Angle (°): ");
        double inputtedAngle = scanner.nextDouble();
        System.out.println("FINAL DATA=================");
        System.out.println("Flight time: " + getFlightTime(inputtedVelocity, inputtedAngle) + " sec");
        System.out.println("Range: " + getRange(inputtedVelocity, inputtedAngle) + " m");
    } // close method manualTrial
    
    public static void automaticTrial(Scanner scanner) {
        // create a Random object
        Random rand = new Random();
        
        System.out.println("AUTOMATIC TRIAL============");
        // prompt user for number of trials and store in int trialsMax
        System.out.println("Number of trials to run: ");
        int trialsMax = scanner.nextInt();
        
        // run code inside for loop trialsMax times
        for (int i = 1; i < trialsMax+1; i++) {
            // generate a random velocity between 0.00 and 20.0 m/s
            double velocity = rand.nextDouble() * 20;
            
            // generate a random angle between 0.00 and 90.0 degrees
            double angle = rand.nextDouble() * 90;
            
            // calculate flight data and store in respective variables
            double currentFlightTime = getFlightTime(velocity, angle);
            double currentRange = getRange(velocity, angle);
            System.out.println("Launching a projectile with a velocity of "
                    + Math.round(velocity * 100.0) / 100.0 + " m/s and "
                            + "an angle of " + (Math.round(angle * 100.0) / 100.0)
                    + "°...");
            System.out.println("Flight time: " + currentFlightTime + " sec");
            System.out.println("Range: " + currentRange + " m");
            
            // check if these variables are better than the current best variables
            // if so, store them in these variables
            // also, store the conditions that led to these variables
            if (currentFlightTime > bestFlightTime) {
                bestFlightTime = currentFlightTime;
                flightVelocity = Math.round(velocity * 100.0) / 100.0;
                flightAngle = Math.round(angle * 100.0) / 100.0;
            } // close if statement
            if (currentRange > bestRange) {
                bestRange = currentRange;
                rangeVelocity = Math.round(velocity * 100.0) / 100.0;
                rangeAngle = Math.round(angle * 100.0) / 100.0;
            } // close if statement
        } // close for loop
        
        // display the best variables
        System.out.println("FINAL DATA=================");
        System.out.println("Best flight time: " + bestFlightTime + " sec");
        System.out.println("This time was reached with a velocity of " + flightVelocity
        + " m/s and an angle of " + flightAngle + "°.");
        System.out.println("Best range: " + bestRange + " m");
        System.out.println("This range was reached with a velocity of " + rangeVelocity
        + " m/s and an angle of " + rangeAngle + "°.");
        
        // one interesting conclusion that can be made from experimentation
        // is that to achieve the ideal flight time, you want to launch your projectile
        // straight up at a 90° angle.
        // to achieve the greatest range, you want to launch your projectile
        // at a 45° angle.
        
    } // close method automaticTrial
} // close class ProjectileSimulator
