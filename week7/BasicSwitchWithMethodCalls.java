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

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

/**
 * Demonstration class for the concept of a method in its most basic form
 * @author julian
 */
public class BasicSwitchWithMethodCalls {
    
    public static void main(String[] args) {

        // declare int input
        int input;
        
        // display menu and prompt user for input
        System.out.println("***** switches and methods *****");
        System.out.println("Options:");
        System.out.println("1 - Print a special statement");
        System.out.println("2 - Generate a really big random number");
        System.out.println("3 - Get me out of here!");
        System.out.println("Enter an int and press enter:");
        
        // create new Scanner object
        Scanner myScanner = new Scanner(System.in);
        
        // store user input in variable input
        input = myScanner.nextInt();
        
        switch(input) {
            case 1:
                printStatement(); // execute printStatement method
                break;
            case 2:
                generateBigNumber(); // execute generateBigNumber method
                break;
            case 3:
                break;
            default:
                System.out.println("Your selection was not recognized.");
        }
        
    } // close method main
    
    // illustration method that takes no parameters and returs nothing to the caller
    public static void printStatement() {
        System.out.println("*********INSIDE printStatement*********");
        System.out.println("Statement: Where there's a will, there's a way.");
        System.out.println("************************************");
    } // close method printStatement
    
    // method that generates and prints a very large, random number
    public static void generateBigNumber() {
        System.out.println("*********INSIDE generateBigNumber*********");
        // create a random number generator
        Random r = new Random();
        // create an object to do math with large numbers
        BigInteger bigInt = new BigInteger(100, r);
        // display the randomly generated huge number
        System.out.println(bigInt);
        System.out.println("************************************");
    } // close method generateBigNumber
    
    
    
} // close class SimpleMethod
