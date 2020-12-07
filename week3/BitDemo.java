/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 * Demonstrates bitwise AND operator
 * @author julian
 */
public class BitDemo {
    
    public static void main(String[] args) {
        int bitmask = 0x000F;
        int val = 0x2222;
        // prints "2"
        // demonstrate bitwise AND operator
        System.out.println(val & bitmask);
        
    } // close main
} // close class BitDemo
