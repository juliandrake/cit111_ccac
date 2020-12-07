/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.Scanner;

/**
 * Asks a user for their username and password, and compares them to expected values
 * @author julian
 */
public class UsernameAndPassword {
    
    public static void main(String[] args) {
        
        // declares and initializes final Strings USERNAME and PASSWORD
        final String USERNAME = "javaghost";
        final String PASSWORD = "ic0d3";
        
        // declares Strings userUsername and userPassword
        String userUsername;
        String userPassword;
        
        // creates a new Scanner object
        Scanner userInputScanner = new Scanner(System.in);
        
        // prompts the user to enter their username
        System.out.println("Enter your username followed by enter:");
        // stores the inputted username into the String variable userUsername
        userUsername = userInputScanner.next();
        // prompts the user to enter their password
        System.out.println("Enter your password followed by enter:");
        // stores the inputted password into the String variable userPassword
        userPassword = userInputScanner.next();
        
        // see if both the user's username and password match the specified values
        if (userUsername.equals(USERNAME) && userPassword.equals(PASSWORD)) {
            // if they do, tell the user that they logged in successfully
            System.out.println("Authentication successful! You have logged into nothing!");
        } else {
            // if they don't, tell the user that they failed to log in successfully
            System.out.println("Failure to authenticate! This attempt will not be recorded.");
        } // close if/else statement
        
    } // close main method
} // close class UsernameAndPassword
