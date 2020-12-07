/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 * A class to explore how comparison operators and if-controlled blocks function.
 * @author julian
 */
public class Comparisons2 {
    
    public static void main(String[] args) {
        
        int correctPasscode = 5934;
        int attemptedPasscode = 1234;
        
        // try comparing correctPasscode to attemptedPasscode with the == operator
        if (correctPasscode == attemptedPasscode) {
            // if the passcodes are equal, print "Codes Match! You're in!"
            System.out.println("Codes Match! You're in!");
        } else {
            // if the passcodes are not equal, print "Codes don't match--No soup for you!"
            System.out.println("Codes don't match--No soup for you!");
        } // close if/else

    } //close main
} // close class Comparisons2