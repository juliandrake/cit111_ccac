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

/**
 *
 * @author julian
 */
public class IntegerArray {
    
    public static void main(String[] args) {
        
        // create an array of integer values to represent # of instruments in each beaker
        int[] instruments = new int[5];
        
        // store contents of beaker in respective indices
        instruments[0] = 20;
        instruments[1] = 22;
        instruments[2] = 5;
        instruments[3] = 24;
        instruments[4] = 15;
        
        // print array contents manually
        printNumericArrayManually(instruments);
        
        // print array contents using a while() loop
        printNumericArrayWithWhileLoop(instruments);
        
        // print array contents using a for() loop
        printNumericArrayWithForLoop(instruments);
        
        // calculate sum of array's contents
        System.out.println("Sum: " + calculateArrayTotal(instruments));
        
        // calculate average value per beaker
        System.out.println("Average instruments/beaker: " + calculateArrayAverage(instruments));
        
        // call createAndAnalyzeFlasksArray
        createAndAnalyzeFlasksArray();
        
    } // close method main
    
    public static void printNumericArrayManually(int[] arrayInsideMethod) {
        System.out.println("Manually accessing array...");
        // manually access the value stored in each index, and display it
        System.out.println("array[0]: " + arrayInsideMethod[0]);
        System.out.println("array[1]: " + arrayInsideMethod[1]);
        System.out.println("array[2]: " + arrayInsideMethod[2]);
        System.out.println("array[3]: " + arrayInsideMethod[3]);
        System.out.println("array[4]: " + arrayInsideMethod[4]);
    } // close method printNumericArrayManually
    
    public static void printNumericArrayWithWhileLoop(int[] arrayInsideMethod) {
        System.out.println("Accessing array with while() loop...");
        int i = 0; // counter variable used to iterate over array
        int arraySize = arrayInsideMethod.length; // get array's length and store in arraySize
        // use a while() loop to loop through array's contents and display them
        while (i < arraySize) {
            System.out.println("array["+i+"]: " + arrayInsideMethod[i]);
            // increment i
            i = i + 1;
        } // close while() loop
    } // close method printNumericArrayWithWhileLoop
    
    public static void printNumericArrayWithForLoop(int[] arrayInsideMethod) {
        System.out.println("Accessing array with for() loop...");
        int arraySize = arrayInsideMethod.length; // get array's length and store in arraySize
        // use a for() loop to iterate over the array and display its contents
        for (int i = 0; i < arraySize; i = i + 1) {
            System.out.println("array["+i+"]: " + arrayInsideMethod[i]);
        } // close for() loop
    } // close method printNumericArrayWithForLoop
    
    public static int calculateArrayTotal(int[] arrayInsideMethod) {
        System.out.println("Calculating sum of integers...");
        int runningTotal = 0; // store current total of values inside array
        int arraySize = arrayInsideMethod.length; // get array's length and store in arraySize
        // use a for() loop to iterate over the array, adding its contents to runningTotal
        for (int i = 0; i < arraySize; i = i + 1) {
            runningTotal = runningTotal + arrayInsideMethod[i];
        } // close for() loop
        return runningTotal; // return total integer sum
    } // close method calculateArrayTotal
    
    public static double calculateArrayAverage(int[] arrayInsideMethod) {
        System.out.println("Calcuating average array value...");
        // use the previously-created method to find the sum of the array
        int arraySum = calculateArrayTotal(arrayInsideMethod);
        int arraySize = arrayInsideMethod.length; // get array's length and store in arraySize
        // return the average ( (total value)/(# of values) )
        return (arraySum / arraySize);
    } // close method calculateArrayAverage
    
    public static void createAndAnalyzeFlasksArray() {
        // create an array of integer values to represent amount of liquid per flask
        int[] flaskContents = new int[4];
        // store approximate fluid levels per flask in new array
        flaskContents[0] = 250;
        flaskContents[1] = 100;
        flaskContents[2] = 190;
        flaskContents[3] = 150;
        // print contents of this array
        System.out.println("******** FLASK CONTENTS ********");
        // call printNumericArrayWithForLoop to display contents of flaskContents
        printNumericArrayWithForLoop(flaskContents);
        System.out.println("******** FLASK TOTAL CONTENTS ********");
        // call calculateArrayTotal to calculate the total contents of the flasks
        System.out.println("Total Contents: " + calculateArrayTotal(flaskContents) + " mL");
        System.out.println("******** FLASK AVERAGE CONTENTS ********");
        // call calculateArrayTotal to calculate the average amount per flask
        System.out.println("Average Contents: " + calculateArrayAverage(flaskContents) + " mL");
    } // close method createAndAnalyzeFlasksArray
    
} // close class IntegerArray
