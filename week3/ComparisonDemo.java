/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 * Demonstrates comparison operators
 * @author julian
 */
public class ComparisonDemo {
    
    public static void main(String[] args) {
        
        int value1 = 1;
        int value2 = 2;
        // demonstrate equal to operator
        if (value1 == value2)
            System.out.println("value1 == value2");
        // demonstrate not equal to operator
        if (value1 != value2)
            System.out.println("value1 != value2");
        // demonstrate greater than operator
        if (value1 > value2)
            System.out.println("value1 > value2");
        // demonstrate less than operator
        if (value1 < value2)
            System.out.println("value1 < value2");
        // demonstrate less than or equal to operator
        if (value1 <= value2)
            System.out.println("value1 <= value2");
        
    } // close main
} // close class ComparisonDemo
