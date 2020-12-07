/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 * Simulates basic recorded data about a road trip to Moab, Utah
 * @author julian
 */
public class RoadTrip {
    
    public static void main(String[] args) {
        
        final double NEDS_MILES_PER_GALLON = 32.0;
        final double AVERAGE_GAS_PRICE = 2.65;
        
        // declaring and initializing variables
        String carMake = "1996 Mazda Protege";
        String carName = "Nedfry";
        int maxPassengers = 5; // primitive type variable
        int currentNumberOfPassengers = 1;
        boolean carFull = false;
        double tripOdometer = 0.0;
        double cashOnHand = 300.00;
        double distanceToMoabUtah = 1806.0;
        boolean destinationReached = false;
        
        double legDistance; // declaring this variable but not initializing
        
        // simulation of the roadtrip
        System.out.println("***Road trip simulator***");
        
        // print out initial stats
        System.out.println("--> Beginning of trip stats <--");
        System.out.println("Make of car: " + carMake + " that can carry: " + maxPassengers);
        System.out.println("Name of car: " + carName);
        System.out.println("Current number of passengers: " + currentNumberOfPassengers);
        System.out.println("Car full: " + carFull);
        System.out.println("Trip odometer: " + tripOdometer);
        System.out.println("Cash on hand: " + cashOnHand);
        System.out.println("Distance to Moab, Utah: "+ distanceToMoabUtah);
        System.out.println("Destination reached: " + destinationReached);
        
        System.out.println("**************************************");
        System.out.println();
        System.out.println("Beginning leg 1:");
        // calculate leg distance: 25% of total trip, store in legDistance
        double decimalOfOneQuarter = .25;
        legDistance = distanceToMoabUtah * decimalOfOneQuarter;
        System.out.println("CHECK LEG DISTANCE: " + legDistance);
        
        // increment trip odometer by leg distance, overwrite odometer
        tripOdometer = tripOdometer + legDistance;
        
        // subtract leg distance from distanceTo destination, overwrite distance
        distanceToMoabUtah = distanceToMoabUtah - legDistance;
        
        // "see" hitchhiker heading west
        System.out.println("Oh, look! A person who wants to go west, too!");
        
        // check if there is room in the car, if so, pick up hitchhiker
        if (carFull == false) {
            System.out.println("Car is not full, picking up hitchhiker.");
            currentNumberOfPassengers++;
        } // close if
        
        // calculate price of gas for first leg and store in temp variable
        // gas price = (distance / milesPerGallon) * price per gallon
        double gasPriceForLeg = (legDistance / NEDS_MILES_PER_GALLON) * AVERAGE_GAS_PRICE;

        // deduct $ spent on gas from money remaning and overwrite cashOnHand
        cashOnHand = cashOnHand - gasPriceForLeg;
        
        
        // reprint status of variables to the console
        
        System.out.println();
        System.out.println("*** Variable stats at end of leg 1 ***");
        System.out.println("Current number of passengers: " + currentNumberOfPassengers);
        System.out.println("Car full: " + carFull);
        System.out.println("Trip odometer: " + tripOdometer);
        System.out.println("Cash on hand: " + cashOnHand);
        System.out.println("Distance to Moab, Utah: "+ distanceToMoabUtah);
        System.out.println("Destination reached: " + destinationReached);
        System.out.println();
        System.out.println("Beginning leg 2:");
        // overwrite legDistance with 500.0 and update odometer
        legDistance = 500.0;
        tripOdometer = tripOdometer + legDistance;
        
        // subtract leg distance from distanceTo destination, overwrite distance
        distanceToMoabUtah = distanceToMoabUtah - legDistance;
        
        // find two hitchhikers, and use an if statement to decide if they can be picked up
        System.out.println("Oh, look! Two more hitchhikers!");
        if (carFull == false) {
            System.out.println("Car is not full, picking up hitchhikers.");
            currentNumberOfPassengers  = currentNumberOfPassengers + 2;
            if (currentNumberOfPassengers == maxPassengers) {
                carFull = true;
            } // close if
        } // close if
        
        // calculate the price of gas for the 500 mile leg, and update the budget
        gasPriceForLeg = (legDistance / NEDS_MILES_PER_GALLON) * AVERAGE_GAS_PRICE;
        cashOnHand = cashOnHand - gasPriceForLeg;
        
        // after leg 2 is complete, reprint stats
        
        System.out.println();
        System.out.println("*** Variable stats at end of leg 2 ***");
        System.out.println("Current number of passengers: " + currentNumberOfPassengers);
        System.out.println("Car full: " + carFull);
        System.out.println("Trip odometer: " + tripOdometer);
        System.out.println("Cash on hand: " + cashOnHand);
        System.out.println("Distance to Moab, Utah: "+ distanceToMoabUtah);
        System.out.println("Destination reached: " + destinationReached);
        System.out.println();
        System.out.println("Beginning leg 3:");
        // finish trip with leg 3 with remaining distance to Moab, Utah
        legDistance = distanceToMoabUtah;
        tripOdometer = tripOdometer + legDistance;
        
        // subtract leg distance from distanceTo destination, overwrite distance
        distanceToMoabUtah = distanceToMoabUtah - legDistance;
        
        // find two more hitchhikers, and use an if statement to see if they can be picked up
        
        System.out.println("There are two more hitchhikers!");
        if (currentNumberOfPassengers + 2 > maxPassengers) {
            System.out.println("There is not enough room to fit both hitchhikers.");
            System.out.println("They decide not to split up.");
        }
        
        // pay for gas at the end of the trip and adjust cash on hand
        gasPriceForLeg = (legDistance / NEDS_MILES_PER_GALLON) * AVERAGE_GAS_PRICE;
        cashOnHand = cashOnHand - gasPriceForLeg;
        
        // arrive at destination and set destinationReached to true
        System.out.println("We have arrived at Moab, Utah!");
        destinationReached = true;
        
        // print final stats
        System.out.println();
        System.out.println("*** Variable stats at end of leg 3 ***");
        System.out.println("Current number of passengers: " + currentNumberOfPassengers);
        System.out.println("Car full: " + carFull);
        System.out.println("Trip odometer: " + tripOdometer);
        System.out.println("Cash on hand: " + cashOnHand);
        System.out.println("Distance to Moab, Utah: "+ distanceToMoabUtah);
        System.out.println("Destination reached: " + destinationReached);
        
    } // close main
} // close class RoadTrip
