/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

/**
 * Demonstrates the while() loop.
 * @author julian
 */
public class SimpleWhile {
    
    public static void main(String[] arg) {

        int numLoops = 0;

        // while()-controlled blocks
        while (numLoops < 10) {
            System.out.println("I'm looping!");
            numLoops = numLoops + 1;
        } // close while loop     
        // after while

    } // close main method
} // close class SimpleWhile
