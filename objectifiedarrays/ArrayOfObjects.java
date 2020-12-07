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
package objectifiedarrays;

import java.util.Scanner;

/**
 * Stores an array of objects
 * @author julian
 */
public class ArrayOfObjects {
    public static void main(String[] args) {
        // create an array to store flask objects
        Flask[] flasks = new Flask[3];
        // create flask objects in every index
        flasks[0] = new Flask();
        flasks[1] = new Flask();
        flasks[2] = new Flask();
        
        // set up the properties of the flasks (not used, user creates their own)
        // flasks[0].setCurrentVolume(250);
        // flasks[1].setCurrentVolume(100);
        // flasks[2].setCurrentVolume(50);
        // flasks[0].setTotalCapacity(250);
        // flasks[1].setTotalCapacity(400);
        // flasks[2].setTotalCapacity(90);
        // flasks[0].setMaterial("Glass");
        // flasks[1].setMaterial("Metal");
        // flasks[2].setMaterial("Plastic");
        
        // prompt the user to input information about the flasks
        setupFlasks(flasks);
        
        // display information about the flasks (not used, user picks which one they'd like to look at)
        // displayFlaskInfo(flasks);
        
        // get a flask index from the user
        int userFlaskIndex = getValidIndexRequest(flasks);
        
        // display information about this flask
        displaySpecificFlaskInfo(flasks[userFlaskIndex], userFlaskIndex+1);
        
        // check capacities of flasks
        checkFlaskCapacities(flasks);
        
        // calculate and display sum and average of liquid volume
        System.out.println("Total volume of liquid: " + calculateArrayTotal(flasks) + " mL");
        System.out.println("Average volume of liquid: " + calculateArrayAverage(flasks) + " mL");
        
    } // close method main
    
    public static void setupFlasks(Flask[] flaskArray) {
        // create Scanner object
        Scanner myScanner = new Scanner(System.in);
        
        int arraySize = flaskArray.length; // get array's length and store in arraySize
        for (int i = 0; i < arraySize; i = i + 1) {
            System.out.println("Flask " + (i+1) + ":");
            // get user's input and use appropriate methods to store it
            System.out.println("Enter the flask's total capacity (mL):");
            flaskArray[i].setTotalCapacity(myScanner.nextDouble());
            System.out.println("Enter the flask's current volume (mL):");
            flaskArray[i].setCurrentVolume(myScanner.nextDouble());
            System.out.println("Enter the flask's material:");
            flaskArray[i].setMaterial(myScanner.next());
            myScanner.nextLine();
        } // close for() loop
    } // close method setupFlasks
    
    public static void displayFlaskInfo(Flask[] flaskArray) {
        int arraySize = flaskArray.length; // get array's length and store in arraySize
        // use a for() loop to iterate over the array and display its contents
        for (int i = 0; i < arraySize; i = i + 1) {
            displaySpecificFlaskInfo(flaskArray[i], i+1);
        } // close for() loop
    } // close method displayFlaskInfo
    
    public static void displaySpecificFlaskInfo(Flask flask, int index) {
        System.out.println("Flask " + (index) + ":");
        System.out.println("    - Current Volume: " + flask.getCurrentVolume() + " mL");
        System.out.println("    - Total Capacity: " + flask.getTotalCapacity() + " mL");
        System.out.println("    - Percent Filled: " + (flask.getCurrentVolume()/flask.getTotalCapacity()) * 100 + "%");
        System.out.println("    - Material: " + flask.getMaterial());
    } // close method displaySpecificFlaskInfo
    
    // this method was created by me in my GuitarArray class; I am reusing it here
    public static int getValidIndexRequest(Flask[] array) {
        // store array's length in arraySize
        int arraySize = array.length;
        // create a Scanner object
        Scanner myScanner = new Scanner(System.in);
        int requestedIndex = 0; // index requested by user (+1)
        // ask user for the index they'd like to access and store in requestedIndex
        // I learned how to validate the user's input from here:
        // https://stackoverflow.com/questions/25491097/how-to-verify-that-input-is-a-positive-integer-in-java
        do {
            System.out.println("What flask would you like to look at? (1-"+arraySize+")");
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
    
    public static void checkFlaskCapacities(Flask[] flaskArray) {
        int arraySize = flaskArray.length; // get array's length and store in arraySize
        // use a for() loop to iterate over the array and check its contents
        for (int i = 0; i < arraySize; i = i + 1) {
            Flask currentFlask = flaskArray[i];
            if ((currentFlask.getCurrentVolume()/currentFlask.getTotalCapacity()) > 1.0) {
                System.out.println("Flask " + (i+1) + " is overflowing!");
            } else if ((currentFlask.getCurrentVolume()/currentFlask.getTotalCapacity()) > 0.85) {
                System.out.println("Flask " + (i+1) + " is nearly full (over 85%)!");
            } else if ((currentFlask.getCurrentVolume()/currentFlask.getTotalCapacity()) < 0.10) {
                System.out.println("Flask " + (i+1) + " is nearly empty (below 10%)!");
            }
        } // close for() loop
    } // close method checkFlaskCapacities
    
    public static double calculateArrayTotal(Flask[] flaskArray) {
        double runningTotal = 0; // store current total of values inside array
        int arraySize = flaskArray.length; // get array's length and store in arraySize
        // use a for() loop to iterate over the array, adding its contents to runningTotal
        for (int i = 0; i < arraySize; i = i + 1) {
            runningTotal = runningTotal + flaskArray[i].getCurrentVolume();
        } // close for() loop
        return runningTotal; // return total integer sum
    } // close method calculateArrayTotal
    
    public static double calculateArrayAverage(Flask[] flaskArray) {
        // use the previously-created method to find the sum of the array
        double arraySum = calculateArrayTotal(flaskArray);
        int arraySize = flaskArray.length; // get array's length and store in arraySize
        // return the average ( (total value)/(# of values) )
        return (arraySum / arraySize);
    } // close method calculateArrayAverage
    
} // close class ArrayOfObjects
