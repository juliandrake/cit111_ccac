/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.util.Scanner;

/**
 * Demonstrates nested logic in while loops
 * @author julian
 */
public class RetirementAge {
    
    public static void main(String[] args) {
        
        // declare and initialize necessary variables

        final double IRS_RET_AGE = 65.5;
        final double SUGGESTED_SAVINGS = 25000.00;
        double age;
        double savings;
        int users = 0;
        int eligibleUsers = 0;
        int ineligibleUsers = 0;
        double totalAge = 0;
        
        // create new Scanner object
        Scanner myScanner = new Scanner(System.in);
        
        while (true) {
            
            System.out.println("Enter your age please, include decimal as needed:");
            
            // read in the input from the user and store in variable age
            age = myScanner.nextDouble();

            System.out.println("Enter your savings:");
            
            // read in the input from the user and store in variable savings
            savings = myScanner.nextDouble();
            
            // compare age to retirement min of 65.5
            // display output telling user if he/she/they can retire
            if (age >= IRS_RET_AGE) {
                // increment eligibleUsers
                eligibleUsers = eligibleUsers + 1;
                System.out.println("Yeah! Grab the next plane to Florida!");
                // compare inputted savings to suggested amount
                if (savings < SUGGESTED_SAVINGS) {
                    System.out.println("Save $" + (SUGGESTED_SAVINGS - savings) + " more before you retire.");
                }
            } else if (age < 0) {
                    System.out.println("Total users: " + users);
                    System.out.println("Eligible users: " + eligibleUsers);
                    System.out.println("Ineligible users: " + ineligibleUsers);
                    break;
            } else {
                // increment ineligibleUsers
                ineligibleUsers = ineligibleUsers + 1;
                System.out.println("Sorry, too young to chill.");
            } // close chained if statements
            
            // increment users
            users = users + 1;
            // increment total age
            totalAge = totalAge + age;
            
            System.out.println("Average age of all previous users: " + (totalAge / users));
            
        } // close while
        
        // statement given after user submits termination code (negative number)
        System.out.println("Than you so much for using can I retire yet?");
 
    } // close main method
} // close class RetirementAge
