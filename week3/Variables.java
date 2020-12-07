/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 * Demonstrates Java's primitive type and String type variables
 * and essential operators to manipulate those variables
 * @author julian
 */
public class Variables {
    
    public static void main(String[] args) {
        // declare and initialize variables
        int yearsEleSchl = 5;
        int yearsMS = 3;
        int yearsHS = 4;
        int yearsCollege = 2;
        int totalYears;

        totalYears = yearsEleSchl + yearsMS + yearsHS + yearsCollege;
        
        // print value of totalYears to console
        System.out.println("Total years in school: " + totalYears);
        
    } // close main method
} // close class Variables
