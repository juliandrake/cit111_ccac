/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 * Demonstrates the ternary operator
 * @author julian
 */
public class ConditionalDemo2 {
    
    public static void main(String[] args) {
        int value1 = 1;
        int value2 = 2;
        int result;
        boolean someCondition = true;
        // demonstrate the ternary operator (?:)
        result = someCondition ? value1 : value2;
        
        System.out.println(result);
        
    } // close main
} // close class ConditionalDemo2
