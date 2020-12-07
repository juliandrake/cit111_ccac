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
package week8;

import java.util.Scanner;

/**
 * Illustrates the flow of values into method and their
 * returned type-specified values to the calling method.
 * @author julian
 */
public class GeometricShapes {
    
    public static void main(String[] args) {
        
        // create new Scanner object and store in myScanner
        Scanner myScanner = new Scanner(System.in);
        
        // prompt user for input
        System.out.println("Enter the side length of the cube in order to calculate its volume:");
        
        // take user's input and store in double sideLength
        
        double sideLength = myScanner.nextDouble();
        
        // calculate volume and print to console in a nested method call
        System.out.println("The volume of a cube with a side length of " + sideLength
                + " is " + calcVolumeOfCube(sideLength) + ".");
        System.out.println("----------------------------------");
        
        // prompt user for input
        System.out.println("Enter the radius of the cylinder:");
        
        // take user's input and store in double cylinderRadius
        
        double cylinderRadius = myScanner.nextDouble();
        
        // prompt user for input
        System.out.println("Enter the height of the cylinder:");
        
        // take user's input and store in double cylinderHeight
        
        double cylinderHeight = myScanner.nextDouble();
        
        // calculate volume and print to console in a nested method call
        System.out.println("The volume of a cylinder with a radius of " + cylinderRadius
                + " and a height of " + cylinderHeight
                + " is " + calcVolumeOfCylinder(cylinderRadius, cylinderHeight) + ".");
        System.out.println("----------------------------------");
        
        // prompt user for input
        System.out.println("Enter the base of the parallelogram:");
        
        // take user's input and store in double parallelogramBase
        
        double parallelogramBase = myScanner.nextDouble();
        
        // prompt user for input
        System.out.println("Enter the height of the parallelogram:");
        
        // take user's input and store in double parallelogramHeight
        
        double parallelogramHeight = myScanner.nextDouble();
        
        System.out.println("The area of a parallelogram with base " + parallelogramBase + " and height " + parallelogramHeight + 
                " is " + calcAreaOfParallelogram(parallelogramBase, parallelogramHeight) + ".");

    } // close method main
    
    public static double calcVolumeOfCube(double sideLength) {
        // raise side length to 3 and store the result
        double cubeVolume = Math.pow(sideLength, 3);
        // return calculated volume to calling method
        return cubeVolume;
    } // close method calcVolumeOfCube
    
    public static double calcVolumeOfCylinder(double radius, double height) {
        final double PI = 3.1416;
        // calculates volume of cylinder with formula V = pi * r^2 * h
        double cylinderVolume = PI * (radius * radius) * height;
        return cylinderVolume;
    } // close method calcVolumeOfCylinder
    
    public static double calcAreaOfParallelogram(double base, double height) {
        double parallelogramArea = (base * height);
        return parallelogramArea;
    } // close method calcAreaOfParallelogram
    
} // close class GeometricShapes
