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
package week7;

import java.util.Scanner;

/**
 * Presents the user with three doors to choose from, each door using a method
 * to do a unique action.
 * @author julian
 */
public class MysteryDoors {
    
    public static void main(String[] args) {
        
        // create variables to store user's inputs
        int userChoice = -1;
        String userName;
        int userAge;
        String userCandy;
        
        // create a Scanner object and store it in the variable "myScanner"
        Scanner myScanner = new Scanner(System.in);
        
        // ask user for information
        System.out.println("Welcome to Mystery Doors! Before playing, please tell us some information about yourself.");
        System.out.println("What is your name?");
        // store inputted String in userName
        userName = myScanner.nextLine();
        System.out.println("How old are you?");
        // store inputted int in userAge
        userAge = myScanner.nextInt();
        myScanner.nextLine(); // without this, the next Scanner input is skipped
        System.out.println("What is your favorite candy? (please enter in the plural form)");
        // store inputted String in userCandy
        userCandy = myScanner.nextLine();
        
        do { // loops until user inputs a choice of 0
            
            // display user info
            displayUserInfo(userName, userAge, userCandy);
            
            // display text to the user and prompt them for input
            System.out.println("-----------Mystery Doors-----------");
            System.out.println("There are three doors, and each one does something interesting.");
            System.out.println("[Door 1] [Door 2] [Door 3]");
            System.out.println("-----------------------------------");
            System.out.println("Enter a door number of your choice: (press 0 to exit)");

            // store inputted int in variable userChoice
            userChoice = myScanner.nextInt();

            // determine which method to run
            switch (userChoice) {
                case 1:
                    // door 1
                    // prompt user for input
                    System.out.println("-----------------------------------");
                    System.out.println("This method counts to any integer!");
                    System.out.println("What number should it count to? ");
                    System.out.println("-----------------------------------");
                    // get user's input and store in int userInt
                    int userInt = myScanner.nextInt();
                    // execute countToNumber, passing in inputted int
                    countToNumber(userInt);
                    break;
                case 2:
                    // door 2
                    // prompt user for input
                    System.out.println("Enter a number to cube and square it: ");
                    System.out.println("-----------------------------------");
                    // get user's input and store in double userDouble
                    double userDouble = myScanner.nextDouble();
                    // execute squareNumber, passing in inputted double
                    System.out.println("-----------------------------------");
                    squareNumber(userDouble);
                    break;
                case 3:
                    // door 3
                    giveCandy(userCandy);
                    break;
                case 0:
                    // user wants to exit program
                    System.out.println("Thank you for playing Mystery Doors!");
                    break;
                default:
                    System.out.println("That isn't a valid choice!");
            } // close switch block
        } while (userChoice != 0);
        
    } // close method main
    
    /* The single job of this method is to count to a given integer, starting from 0
    * @param target the target number to count to
    */
    
    public static void countToNumber(int target) {
        int x;
        // increment x and print its value until it reaches target
        for (x = 0; x < target+1; x++) {
            System.out.println(x);
        } // close for loop
    } // close method countToNumber
    
    /* The single job of this method is to take a double, square it, and print the result.
    * @param input the number to square
    */
    
    public static void squareNumber(double input) {
        // store inputted number to the power of 2 in inputSquared
        double inputSquared = Math.pow(input, 2);
        // print inputSquared
        System.out.println(input + " squared is " + inputSquared);
        // also, find the input cubed
        cubeNumber(input);
    } // close method squareNumber
        
    /* The single job of this method is to take a double, cube it, and print the result.
    * @param input the number to cube
    */
    
    public static void cubeNumber(double input) {
        // store inputted number to the power of 3 in inputCubed
        double inputCubed = Math.pow(input, 3);
        // print inputCubed
        System.out.println(input + " cubed is " + inputCubed);
    } // close method cubeNumber
    
    /* The single job of this method is to tell the user that they have won 100 pieces
    *  of their favorite candy.
    * @param candy the name of the candy
    */
    
    public static void giveCandy(String candy) {
        System.out.println("-----------------------------------");
        System.out.println("Congratulations!");
        System.out.println("You have won 100 " + candy + "!");
    } // close method giveCandy
    
    /* The single job of this method is to display the user's name, age, and favorite candy
    * @param name the name of the user
    * @param age the age of the user
    * @param candy the user's favorite candy
    */
    
    public static void displayUserInfo(String name, int age, String candy) {
        System.out.println("-----------User Info-------------");
        System.out.println("User's name: " + name);
        System.out.println("User's age: " + age);
        System.out.println("User's favorite candy: " + candy);
    } // close method displayUserInfo
    
} // close class MysteryDoors
