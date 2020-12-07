/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.util.Random;

/**
 * Simulates a production line and tracks statistics about production failures
 * @author julian
 */
public class QualityControlOnMyOwn {
    
    public static void main(String[] args) {
        
        // initialize and declare variables as needed
        int unitQuality = 0;
        int totalFailures = 0;
        int totalUnitsMade = 0;
        int totalQuality = 0;
        int consecutiveFailures = 0;
        final int QUALITY_THRESHOLD = 60;
        final int MAX_QUALITY = 100;
        final int UNITS_TO_MAKE = 50;
        final int CONSECUTIVE_FAILURE_LIMIT = 8;
        
        // create a Random object
        Random randGenerator = new Random();
        
        // run until there has been enough units made
        while (totalUnitsMade <= UNITS_TO_MAKE) {
            unitQuality = randGenerator.nextInt(MAX_QUALITY);
            System.out.println("Unit quality: " + unitQuality);
            
            // increment totalUnitsMade and totalQuality by appropriate amounts
            totalUnitsMade = totalUnitsMade + 1;
            totalQuality = totalQuality + unitQuality;
            
            
            // determine if unit is above or below quality threshold
            if (unitQuality < QUALITY_THRESHOLD) {
                System.out.println("This unit is under the quality threshold.");
                // increment totalFailures and consecutiveFailures
                totalFailures = totalFailures + 1;
                consecutiveFailures = consecutiveFailures + 1;
                
                // if there is the max amount of consecutive failures, stop and display warning
                if (consecutiveFailures == CONSECUTIVE_FAILURE_LIMIT) {
                    System.out.println("There has been " + consecutiveFailures + 
                            " consecutive failures. The machines may need attention.");
                    break;
                }
                
            } else {
                System.out.println("This unit exceeds the quality threshold.");
                // reset consecutiveFailures to 0
                consecutiveFailures = 0;
            } // close if/else
            
            // display information about quality
            System.out.println("Total failures: " + totalFailures + 
                    " out of " + totalUnitsMade + " units made");
            System.out.println("Average quality: " + (totalQuality / totalUnitsMade));
            
        } // close while

    } // close main method
} // close class QualityControlOnMyOwn