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
package weekB1_scope;

import java.util.Random;

/**
 * Simulates theme park rides and tracks statistics related to them
 * @author julian
 */
public class KennywoodRideTracker {
    
    // initalize member variables
    private static int totalRiders = 0;
    private static int totalFailedRideAttempts = 0;
    private static int totalSickThrillRiders = 0;
    private static int totalSickThemeRiders = 0;
    private static int totalRevenue = 0;
    final static int MINIMUM_THRILL_HEIGHT = 64;
    final static int MINIMUM_THEME_HEIGHT = 36;
    final static int YOUTH_TICKET_COST = 5;
    final static int ADULT_TICKET_COST = 8;
    final static int COST_PER_RIDER = 1;
    
    
    public static void main(String[] args) {
        // create new Random object
        Random rand = new Random();
        // print messages to console
        System.out.println("Beginning ride simulation...");
        printRiderStats();
        // run 20 simulations of each ride
        for (int i = 0; i < 20; i++) {
            // generate a random average height
            int randomHeight = rand.nextInt(50) + 30; // random int from 30-80
            // generate a random amount of riders
            int randomRiders = rand.nextInt(19) + 1; // random int from 1-20
            rideBlackWidow(randomRiders, randomHeight);
            rideMerryGoRound(randomRiders, randomHeight);
            // print rider statistics after each trial
            printRiderStats();
        } // close for loop

    } // close method main
    
    public static void rideBlackWidow(int riders, int avgHeight) {
        // create new Random object
        Random rand = new Random();
    
        // if average height is greater than or equal to minimum thrill height...
        if (avgHeight >= MINIMUM_THRILL_HEIGHT) {
            // print message to console
            System.out.println("Riding black widow!");
            // increment totalRiders by amount of riders
            totalRiders = totalRiders + riders;
            // generate a random integer between 0 and # of riders
            int sickRiders = rand.nextInt(riders);
            // increment totalSickThrillRiders by this number
            totalSickThrillRiders = totalSickThrillRiders + sickRiders;
            // determine profit from # of adult riders
            int profit = (riders * ADULT_TICKET_COST) - (riders * COST_PER_RIDER);
            // add profit to totalRevenue
            totalRevenue = totalRevenue + profit;
        } else { // if average height is less than minimum thrill height...
            // add number of riders who got turned away to totalFailedRideAttempts
            totalFailedRideAttempts = totalFailedRideAttempts + riders;
            // print number of riders turned away to console
            System.out.println(riders + " riders were turned away.");
        } // end if/else
        
    } // close method rideBlackWidow
    
    public static void rideMerryGoRound(int riders, int avgHeight) {
        // create new Random object
        Random rand = new Random();
        
        // if average height is greater than or equal to minimum theme height...
        if (avgHeight >= MINIMUM_THEME_HEIGHT) {
            // print message to console
            System.out.println("Riding merry-go-round!");
            // increment totalRiders by amount of riders
            totalRiders = totalRiders + riders;
            // generate a random integer between 0 and # of riders
            int sickRiders = rand.nextInt(riders);
            // increment totalSickThemeRiders by this number
            totalSickThemeRiders = totalSickThemeRiders + sickRiders;
            // determine profit from # of youth riders
            int profit = (riders * YOUTH_TICKET_COST) - (riders * COST_PER_RIDER);
            // add profit to totalRevenue
            totalRevenue = totalRevenue + profit;
        } else { // if average height is less than minimum theme height...
            // add number of riders who got turned away to totalFailedRideAttempts
            totalFailedRideAttempts = totalFailedRideAttempts + riders;
            // print number of riders turned away to console
            System.out.println(riders + " riders were turned away.");
        } // end if/else                

    } // close method rideMerryGoRound
    
    public static void printRiderStats() {
        System.out.println("=======Rider Stats=======");
        // print values of member variables to console
        System.out.println("Total riders: " + totalRiders);
        System.out.println("Total revenue: $" + totalRevenue);
        System.out.println("Total failed ride attempts: " + totalFailedRideAttempts);
        System.out.println("Total sick riders: " + (totalSickThrillRiders + 
                totalSickThemeRiders));
        System.out.println("Total sick thrill riders: " + totalSickThrillRiders);
        System.out.println("Total sick theme riders: " + totalSickThemeRiders);
        if (totalRiders > 0) { // you can't divide by zero...
            System.out.println("Percentage of failed rides: " +
                ((double) totalFailedRideAttempts/totalRiders)*100);
            // (double) casts value to double
        System.out.println("Percentage of sick thrill riders: " +
                ((double) totalSickThrillRiders/totalRiders)*100);
        System.out.println("Percentage of sick theme riders: " +
                ((double) totalSickThemeRiders/totalRiders)*100);
        }
        System.out.println("=========================");
    } // close method printRiderStats
    
} // close class KennywoodRideTracker
