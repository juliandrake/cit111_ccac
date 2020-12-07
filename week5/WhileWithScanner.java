/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.util.Scanner;

/**
 * Adding user input to our while loop learning
 * @author julian
 */
public class WhileWithScanner {
    
    public static void main(String[] args) {
        int numLoops = 0;
        // declare but not initialize
        int loopControl;
        String loopString;
        
        // create a Scanner object
        Scanner myScanner = new Scanner(System.in);
        
        // prompt user for a number
        System.out.println("Enter the number of loops to execute: ");
        
        // use Scanner object to gather integer from user
        loopControl = myScanner.nextInt();
        
        // prompt user for a String
        System.out.println("Enter the phrase that will be repeated: ");
        
        // use Scanner object to gather String from user
        loopString = myScanner.next();
                
        while (numLoops <= loopControl) {
            System.out.println(loopString);
            numLoops = numLoops + 1;
        } // close while loop
        
        System.out.println("...After the while loop");
        
    } // close main method
} // close class WhileWithScanner
