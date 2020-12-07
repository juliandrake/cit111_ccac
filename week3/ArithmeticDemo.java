/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 * Demonstration of arithmetic operators
 * @author julian
 */
class ArithmeticDemo {

    public static void main (String[] args) {
        
        // demonstrate addition operator
        int result = 1 + 2;
        // result is now 3
        System.out.println("1 + 2 = " + result);
        int original_result = result;
        
        // demonstrate subtraction operator
        result = result - 1;
        // result is now 2
        System.out.println(original_result + " - 1 = " + result);
        original_result = result;
        
        // demonstrate multiplication operator
        result = result * 2;
        // result is now 4
        System.out.println(original_result + " * 2 = " + result);
        original_result = result;
        
        // demonstrate division operator
        result = result / 2;
        // result is now 2
        System.out.println(original_result + " / 2 = " + result);
        original_result = result;
        
        result = result + 8;
        // result is now 10
        System.out.println(original_result + " + 8 = " + result);
        original_result = result;
        
        // demonstrate remainder operator
        result = result % 7;
        // result is now 3
        System.out.println(original_result + " % 7 = " + result);
        
    } // close main
} // close class ArithmeticDemo