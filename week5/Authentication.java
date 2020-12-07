/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.util.Scanner;

/**
 * Uses a while() loop to give the user multiple chances to submit credentials
 * @author julian
 */
public class Authentication {
    
    public static void main(String[] args) {
        // initialize and declare variables as needed
        int attemptsMade = 0;
        final int ALLOWED_ATTEMPTS = 3;
        final String USERNAME_USER1 = "username1";
        final String USERNAME_USER2 = "username2";
        final String CORRECT_PASSWORD_USER1 = "p4ssw0rd";
        final String CORRECT_PASSWORD_USER2 = "p4ssw0rdtwo";
        final int CORRECT_CODE_USER1 = 1234;
        final int CORRECT_CODE_USER2 = 5678;
        final String SECRET_INFO_USER1 = "This is a secret!";
        final String SECRET_INFO_USER2 = "This is also a secret!";
        String attemptedPassword;
        String attemptedUsername;
        int attemptedCode;
        int currentUser = 0;
        boolean hasCorrectPassword;
        boolean hasCorrectCode;
        String attempt1 = "";
        String attempt2 = "";
        String attempt3 = "";
        String infoToPrint = "";
        
        // create a new Scanner object
        Scanner myScanner = new Scanner(System.in);
        
        // prompt the user for input
        System.out.println("====Authenticator Revisited====");
        
        while (true) {
            System.out.println("Please enter your username.");

            attemptedUsername = myScanner.next();

            if ((attemptedUsername.equals(USERNAME_USER1)) || (attemptedUsername.equals(USERNAME_USER2))) {
                System.out.println("Please enter the password to view the hidden information.");
                while (true) {
                    // store input in attemptedPassword
                    attemptedPassword = myScanner.next();

                    // increment attemptsMade by 1
                    attemptsMade = attemptsMade + 1;
                    
                    // determine which user is logging in
                    if (attemptedUsername.equals(USERNAME_USER1)) {
                        currentUser = 1;
                    } else {
                        currentUser = 2;
                    } // end if/else
                    
                    // check input against expected password
                    if (currentUser == 1 && attemptedPassword.equals(CORRECT_PASSWORD_USER1)) {
                        hasCorrectPassword = true;
                    } else if (currentUser == 2 && attemptedPassword.equals(CORRECT_PASSWORD_USER2)) {
                        hasCorrectPassword = true;
                    } else {
                        hasCorrectPassword = false;
                    }
                    
                    if (hasCorrectPassword) {
                        System.out.println("Please enter your phone's passcode:");
                        attemptedCode = myScanner.nextInt();
                        // check input against expected code
                        if (currentUser == 1 && attemptedCode == CORRECT_CODE_USER1) {
                            hasCorrectCode = true;
                            infoToPrint = SECRET_INFO_USER1;
                        } else if (currentUser == 2 && attemptedCode == CORRECT_CODE_USER2) {
                            hasCorrectCode = true;
                            infoToPrint = SECRET_INFO_USER2;
                        } else {
                            hasCorrectCode = false;
                        } // close if/else

                        if (hasCorrectCode) {
                            System.out.println("The information is: " + infoToPrint);
                            System.out.println("Logging out...");
                            attemptsMade = 0;
                            break;
                        } else {
                            System.out.println("You provided an incorrect passcode.");
                        } // close if/else
                    } else {

                        // store attempt in variable according to current attempt #

                        if (attemptsMade == 1) {
                            attempt1 = attemptedPassword;
                        } else if (attemptsMade == 2) {
                            attempt2 = attemptedPassword;
                        } else {
                            attempt3 = attemptedPassword;
                        } // close if/else

                        System.out.println("Number of attempts: " + attemptsMade);
                        System.out.println("Allowed attempts: " + ALLOWED_ATTEMPTS);
                        // check total attempts against maxmium attempts
                        if (attemptsMade < ALLOWED_ATTEMPTS) {
                            System.out.println("Please try again: ");
                        } else {
                            System.out.println("Sorry, you're out of attempts.");
                            System.out.println("Password attempt 1: " + attempt1);
                            System.out.println("Password attempt 2: " + attempt2);
                            System.out.println("Password attempt 3: " + attempt3);
                            attemptsMade = 0; // reset attempts
                            break;
                        } // close if/else
                    } // close if/else
                } // close while loop
            } else {
                System.out.println("Sorry, you've entered an incorrect username.");
            } // close if/else
        } // close while loop
        
    } // close main method
} // close class Authentication
