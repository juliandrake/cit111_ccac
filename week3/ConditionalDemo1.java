/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 * Demonstrates the conditional-AND and conditional-OR operators
 * @author julian
 */
public class ConditionalDemo1 {
    
    public static void main(String[] args) {
        int value1 = 1;
        int value2 = 2;
        // demonstrate conditional-AND operator
        if ((value1 == 1) && (value2 == 2))
            System.out.println("value1 is 1 AND value2 is 2");
        // demonstrate conditional-OR operator
        if ((value1 == 1) || (value2 == 1))
            System.out.println("value1 is 1 OR value2 is 1");
        
    } // close main
} // close class ConditionalDemo1
