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
package week13;

import java.util.Scanner;

/**
 * Stores 6 guitar types in an Array
 * @author julian
 */
public class GuitarArray {
    
    public static void main(String[] args) {
        
        // create an Array of Strings called "guitars" with size 6
        String[] guitars = new String[6];
        
        // store the name of each guitar in its respective array index
        guitars[0] = "Stratocaster";
        guitars[1] = "Les Paul";
        guitars[2] = "Telecaster";
        guitars[3] = "Jaguar";
        guitars[4] = "Classical";
        guitars[5] = "Mustang";
        
        // access the array with a for loop and display its contents
        for (int i = 0; i < 6; i++) { // loop through inner code 6 times incrementing i each time
            System.out.println("guitars["+i+"]: " + guitars[i]);
        } // close for loop
        
        // call facilitateUserInteraction
        facilitateUserInteraction(guitars);
        
    } // close main method
    
    public static int getValidIndexRequest(String[] array) {
        // store array's length in arraySize
        int arraySize = array.length;
        // create a Scanner object
        Scanner myScanner = new Scanner(System.in);
        int requestedIndex = 0; // index requested by user (+1)
        // ask user for the index they'd like to access and store in requestedIndex
        // I learned how to validate the user's input from here:
        // https://stackoverflow.com/questions/25491097/how-to-verify-that-input-is-a-positive-integer-in-java
        do {
            System.out.println("What index would you like to access? (1-"+arraySize+")");
            if (myScanner.hasNextInt()) {
                requestedIndex = myScanner.nextInt();
            } else {
                System.out.println("That isn't a number!");
                myScanner.nextLine();
            }
        } while (requestedIndex <= 0 || requestedIndex > 6);
        
        // decrement requestedIndex by 1 so the user can enter 1 to access index 0
        requestedIndex = requestedIndex - 1;
        return requestedIndex;
    } // close method getValidIndexRequest
    
    
    public static void facilitateUserInteraction(String[] array) {
        
        // create a Scanner object
        Scanner myScanner = new Scanner(System.in);
        
        // get requested index from user
        int userIndex = getValidIndexRequest(array);
        
        // display the value stored at requestedIndex
        System.out.println("Guitar " + (userIndex+1) + ": " + array[userIndex]);
        
        System.out.println("This array will be cleared, and a new one will be made.");
        System.out.println("How many guitars would you like to store in it?");
        
        // get requested size of array and store in int requestedSize
        int requestedSize = myScanner.nextInt();
        
        // create new array with given size in place of the old one
        array = new String[requestedSize];
        
        String userInput; // variable to store user's input
        
        for (int i = 0; i < requestedSize; i = i + 1) {
            // get user's input and store in userInput
            System.out.println("Enter guitar name " + (i+1) + ": ");
            userInput = myScanner.next();
            // store this value in the current index of the array
            array[i] = userInput;
            myScanner.nextLine();
            
        } // close for() loop
        
        // get requested index from user
        userIndex = getValidIndexRequest(array);
        
        // display the value stored at requestedIndex
        System.out.println("Guitar " + (userIndex+1) + ": " + array[userIndex]);
        
    } // close method facilitateUserInteraction;
    
} // close class GuitarArray
