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
package week9;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * A program to convert units into other units
 * All conversion factors are taken from either this Wikipedia article:
 * https://en.wikipedia.org/wiki/Conversion_of_units or Google's unit converter
 * @author julian
 */
public class UnitConverter {
    
    public static void main(String[] args) {
        
        // create Scanner object for use in user interface
        Scanner inputScanner = new Scanner(System.in);
        
        // create DecimalFormat object to format decimals
        // I learned how to do this from here:
        // https://www.baeldung.com/java-round-decimal-number
        DecimalFormat decimalFormat = new DecimalFormat("###.###");
        
        // display message to user and ask them to select a category
        System.out.println("====================================");
        System.out.println("Welcome to my useful Unit Converter!");
        System.out.println("====================================");
        System.out.println("Select a category of conversions:");
        System.out.println("1 - Length");
        System.out.println("2 - Area");
        System.out.println("3 - Mass");
        System.out.println("4 - Velocity");
        System.out.println("5 - Miscellaneous");
        System.out.println("====================================");
        
        // store inputted value in int categoryChoice
        int categoryChoice = inputScanner.nextInt();
        
        System.out.println("====================================");
        System.out.println("Select a conversion to use:");
        
        // show appropriate conversions depending on desired category
        switch(categoryChoice) {
            case 2:
                System.out.println("1 - Acres -> Square yards");
                System.out.println("2 - Square feet -> Square inches");
                System.out.println("3 - Square yards -> Square meters");
                break;
            case 3:
                System.out.println("1 - Kilograms -> Grams");
                System.out.println("2 - Tons -> Pounds");
                System.out.println("3 - Pounds -> Kilograms");
                break;
            case 4:
                System.out.println("1 - Miles/hour -> Meters/second");
                System.out.println("2 - Kilometers/hour -> Meters/second");
                System.out.println("3 - Meters/second -> Feet/minute");
                break;
            case 5:
                System.out.println("1 - Degrees -> Radians");
                System.out.println("2 - Fahrenheit -> Celsius");
                System.out.println("3 - Bytes -> Gigabytes");
                break;
            default:
                // default to length if an invalid category is chosen
                System.out.println("1 - Miles -> Feet");
                System.out.println("2 - Feet -> Meters");
                System.out.println("3 - Kilometers -> Light-years");
        } // close switch block
        System.out.println("====================================");
        
        // store inputted value in int conversionChoice
        int conversionChoice = inputScanner.nextInt();
        
        System.out.println("====================================");
        
        // determine which conversion the user wants to make, and make it
        // case 1 is the default case, to make it do something if an incorrect
        // value is inputted
        switch(categoryChoice) {
            case 2:
                // Area
                switch(conversionChoice) {
                    case 2:
                        double inputSquareFeet = collectUserInput("Square feet: ");
                        System.out.println(decimalFormat.format(inputSquareFeet) + " sq ft -> "
                        + decimalFormat.format(squareFeetToSquareInches(inputSquareFeet)) + " sq in");
                        break;
                    case 3:
                        double inputSquareYards = collectUserInput("Square yards: ");
                        System.out.println(decimalFormat.format(inputSquareYards) + " sq yd -> "
                        + decimalFormat.format(squareYardsToSquareMeters(inputSquareYards)) + " m^2");
                        break;
                    default:
                        double inputAcres = collectUserInput("Acres: ");
                        System.out.println(decimalFormat.format(inputAcres) + " ac -> "
                        + decimalFormat.format(acresToSquareYards(inputAcres)) + " sq yd");
                } // close switch block
                break;
            case 3:
                // Mass
                switch(conversionChoice) {
                    case 2:
                        double inputTons = collectUserInput("Tons: ");
                        System.out.println(decimalFormat.format(inputTons) + " tons -> "
                        + decimalFormat.format(tonsToPounds(inputTons)) + " lbs");
                        break;
                    case 3:
                        double inputPounds = collectUserInput("Pounds: ");
                        System.out.println(decimalFormat.format(inputPounds) + " lbs -> "
                        + decimalFormat.format(poundsToKilograms(inputPounds)) + " kg");
                        break;
                    default:
                        double inputKilograms = collectUserInput("Kilograms: ");
                        System.out.println(decimalFormat.format(inputKilograms) + " kg -> "
                        + decimalFormat.format(kilogramsToGrams(inputKilograms)) + " g");
                } // close switch block
                break;
            case 4:
                // Velocity
                switch(conversionChoice) {
                    case 2:
                        double inputKmph = collectUserInput("Kilometers/hour: ");
                        System.out.println(decimalFormat.format(inputKmph) + " kmph -> " 
                        + decimalFormat.format(kmphToMs(inputKmph)) + " m/s");
                        break;
                    case 3:
                        double inputMs = collectUserInput("Meters/second: ");
                        System.out.println(decimalFormat.format(inputMs) + " m/s -> " 
                        + decimalFormat.format(msToFm(inputMs)) + " ft/min");
                        break;
                    default:
                        double inputMph = collectUserInput("Miles/hour: ");
                        System.out.println(decimalFormat.format(inputMph) 
                        + " mph -> " + decimalFormat.format(mphToMs(inputMph)) + " m/s");
                } // close switch block
                break;
            case 5:
                // Miscellaneous
                switch(conversionChoice) {
                    case 2:
                        double inputFahrenheit = collectUserInput("Fahrenheit: ");
                        System.out.println(decimalFormat.format(inputFahrenheit) + " °F -> " 
                        + decimalFormat.format(fahrenheitToCelsius(inputFahrenheit)) + " °C");
                        break;
                    case 3:
                        double inputBytes = collectUserInput("Bytes: ");
                        double kilobytes = bytesToKilobytes(inputBytes);
                        System.out.println(decimalFormat.format(inputBytes)
                        + " bytes -> " + decimalFormat.format(kilobytes) + " kilobytes");
                        double megabytes = kilobytesToMegabytes(kilobytes);
                        System.out.println(decimalFormat.format(kilobytes)
                        + " kilobytes -> " + decimalFormat.format(megabytes) + " megabytes");
                        System.out.println(decimalFormat.format(megabytes)
                        + " megabytes -> " + decimalFormat.format(megabytesToGigabytes(megabytes)) + " gigabytes");
                        break;
                    default:
                        double inputDegrees = collectUserInput("Degrees: ");
                        System.out.println(decimalFormat.format(inputDegrees) + " ° -> "
                        + decimalFormat.format(degreesToRadians(inputDegrees)) + " radians");
                } // close switch block
                break;
            default:
                // Length
                switch(conversionChoice) {
                    case 2:
                        double inputFeet = collectUserInput("Feet: ");
                        System.out.println(decimalFormat.format(inputFeet + " ft -> "
                        + feetToMeters(inputFeet)) + " m");
                        break;
                    case 3:
                        double inputKilometers = collectUserInput("Kilometers: ");
                        System.out.println(decimalFormat.format(inputKilometers) + " km -> "
                        + decimalFormat.format(kilometersToLightyears(inputKilometers)) + " ly");
                        break;
                    default:
                        double inputMiles = collectUserInput("Miles: ");
                        System.out.println(decimalFormat.format(inputMiles) + " mi -> "
                        + decimalFormat.format(milesToFeet(inputMiles)) + " ft");
                } // close switch block
        } // close switch block
    } // close method main
    
    public static double degreesToRadians(double degrees) {
        // store conversion factor (degrees to radians)
        final double CONVERSION_FACTOR = (Math.PI / 180);
        // multiply inputted value by conversion factor
        double radians = degrees * CONVERSION_FACTOR;
        // return the result
        return radians;
    } // close method degreesToRadians
    
    public static double feetToMeters(double feet) {
        // store conversion factor (feet to meters)
        final double CONVERSION_FACTOR = 0.3048;
        // multiply inputted value by conversion factor
        double meters = feet * CONVERSION_FACTOR;
        // return the result
        return meters;
    } // close method feetToMeters
    
    public static double kilometersToLightyears(double kilometers) {
        // store conversion factor (kilometers to light-years)
        final double CONVERSION_FACTOR = (1/(9.461e12));
        // multiply inputted value by conversion factor
        double lightyears = kilometers * CONVERSION_FACTOR;
        // return the result
        return lightyears;
    } // close method kilometersToLightyears
    
    public static double milesToFeet(double miles) {
        // store conversion factor (miles to feet)
        final double CONVERSION_FACTOR = (5280);
        // multiply inputted value by conversion factor
        double feet = miles * CONVERSION_FACTOR;
        // return the result
        return feet;
    } // close method milesToFeet
    
    public static double acresToSquareYards(double acres) {
        // store conversion factor (acres to square yards)
        final double CONVERSION_FACTOR = (4840);
        // multiply inputted value by conversion factor
        double squareYards = acres * CONVERSION_FACTOR;
        // return the result
        return squareYards;
    } // close method acresToSquareYards
    
    public static double squareFeetToSquareInches(double squareFeet) {
        // store conversion factor (square feet to square inches)
        final double CONVERSION_FACTOR = (144);
        // multiply inputted value by conversion factor
        double squareInches = squareFeet * CONVERSION_FACTOR;
        // return the result
        return squareInches;
    } // close method squareFeetToSquareInches
    
    public static double squareYardsToSquareMeters(double squareYards) {
        // store conversion factor (square yards to square meters)
        final double CONVERSION_FACTOR = (0.83612736);
        // multiply inputted value by conversion factor
        double squareMeters = squareYards * CONVERSION_FACTOR;
        // return the result
        return squareMeters;
    } // close method squareYardsToSquareMeters
    
    public static double kilogramsToGrams(double kilograms) {
        // store conversion factor (kilograms to grams)
        final double CONVERSION_FACTOR = (1000);
        // multiply inputted value by conversion factor
        double grams = kilograms * CONVERSION_FACTOR;
        // return the result
        return grams;
    } // close method kilogramsToGrams
    
    public static double tonsToPounds(double tons) {
        // store conversion factor (tons to pounds)
        final double CONVERSION_FACTOR = (2000);
        // multiply inputted value by conversion factor
        double pounds = tons * CONVERSION_FACTOR;
        // return the result
        return pounds;
    } // close method tonsToPounds
    
    public static double poundsToKilograms(double pounds) {
        // store conversion factor (pounds to kilograms)
        final double CONVERSION_FACTOR = (0.453592);
        // multiply inputted value by conversion factor
        double kilograms = pounds * CONVERSION_FACTOR;
        // return the result
        return kilograms;
    } // close method poundsToKilograms
    
    public static double mphToMs(double mph) {
        // store conversion factor (mph to m/s)
        final double CONVERSION_FACTOR = (0.44704);
        // multiply inputted value by conversion factor
        double ms = mph * CONVERSION_FACTOR;
        // return the result
        return ms;
    } // close method mphToMs
    
    public static double kmphToMs(double kmph) {
        // store conversion factor (kmph to m/s)
        final double CONVERSION_FACTOR = (0.277778);
        // multiply inputted value by conversion factor
        double ms = kmph * CONVERSION_FACTOR;
        // return the result
        return ms;
    } // close method kmphToMs
    
    public static double msToFm(double ms) {
        // store conversion factor (m/s to ft/min)
        final double CONVERSION_FACTOR = (196.85);
        // multiply inputted value by conversion factor
        double fm = ms * CONVERSION_FACTOR;
        // return the result
        return fm;
    } // close method msToFm
    
    public static double fahrenheitToCelsius(double fahrenheit) {
        // convert fahrenheit to celsius
        double celsius = (fahrenheit - 32) * (0.55555556);
        // return the result
        return celsius;
    } // close method fahrenheitToCelsius
    
    public static double bytesToKilobytes(double bytes) {
        // store conversion factor (bytes to kilobytes)
        final double CONVERSION_FACTOR = (0.001);
        // multiply inputted value by conversion factor
        double kilobytes = bytes * CONVERSION_FACTOR;
        // return the result
        return kilobytes;
    } // close method bytesToKilobytes
    
    public static double kilobytesToMegabytes(double kilobytes) {
        // store conversion factor (kilobytes to megabytes)
        final double CONVERSION_FACTOR = (0.001);
        // multiply inputted value by conversion factor
        double megabytes = kilobytes * CONVERSION_FACTOR;
        // return the result
        return megabytes;
    } // close method kilobytesToMegabytes
    
    public static double megabytesToGigabytes(double megabytes) {
        // store conversion factor (megabytes to gigabytes)
        final double CONVERSION_FACTOR = (0.001);
        // multiply inputted value by conversion factor
        double gigabytes = megabytes * CONVERSION_FACTOR;
        // return the result
        return gigabytes;
    } // close method megabytesToGigabytes
    
    public static double collectUserInput(String message) {
        // create new Scanner object
        Scanner myScanner = new Scanner(System.in);
        // display text to user, prompting them for input
        System.out.println(message);
        // collect user input and store in variable userInput
        double userInput = myScanner.nextDouble();
        // separate from previous text with line
        System.out.println("====================================");
        // return user's input
        return userInput;
    } // close method collectUserInput
    
} // close class UnitConverter