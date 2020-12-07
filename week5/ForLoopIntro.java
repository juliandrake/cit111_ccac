/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.util.Scanner;

/**
 * Demonstrates the essential functionality of a for() loop
 * @author julian
 */
public class ForLoopIntro {
    
    public static void main(String[] args) {
        // declare variable for controlling number of loops
        int loopControl;
        
        // create a scanner and store it in a variable of our choice
        Scanner userScanner = new Scanner(System.in);
        
        // prompt user and get an int from them
        System.out.println("How many loops shall I print with for()?");
        // grab an int from the user and store in loopControl
        loopControl = userScanner.nextInt();       
        
        // create a for() loop that initalizes numLoops to zero,
        // has the same true/false test as the while(), and adds 1 to our
        // numLoops variable after each pass through the loop
        for (int numLoops = 0; numLoops <= loopControl; numLoops = numLoops + 1) {
            // same contents of our loop body
            System.out.println("The value of numLoops: " + numLoops);
            // but the for() loop helps us by incrementing numLoops in its
            // own declaration
        } // close for loop
        
    } // close main method
} // close class ForLoopIntro
