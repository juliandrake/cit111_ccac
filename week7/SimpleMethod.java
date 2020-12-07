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

/**
 * Demonstration class for the concept of a method in its most basic form
 * @author julian
 */
public class SimpleMethod {
    
    public static void main(String[] args) {
        System.out.println("This code is inside method: main");
        // call the method printStatement, trasnferring execution to that block
        printStatement();
        
        System.out.println("...back in main");
        
        // call the method generateBigNumber
        generateBigNumber();
        
        System.out.println("...back in main");
        
        // call the same method again
        printStatement();
    } // close method main
    
    // illustration method that takes no parameters and returs nothing to the caller
    public static void printStatement() {
        System.out.println("*********INSIDE printStatement*********");
        System.out.println("Statement: Where there's a will, there's a way.");
        generateBigNumber();
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
