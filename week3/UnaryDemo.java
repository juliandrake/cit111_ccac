/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 * Demonstration of unary operators
 * @author julian
 */
public class UnaryDemo {
    
    public static void main(String[] args) {
        
        // demonstrate unary plus operator
        int result = +1;
        // result is now 1
        System.out.println(result);
        
        // demonstrate decrement operator
        result--;
        // result is now 0
        System.out.println(result);
        
        // demonstrate increment operator
        result++;
        // result is now 1
        System.out.println(result);
        
        // demonstrate unary minus operator
        result = -result;
        // result is now -1
        System.out.println(result);
        
        boolean success = false;
        // false
        System.out.println(success);
        // true
        // demonstrate logical complement operator
        System.out.println(!success);
        
    } // close main
} // close class UnaryDemo
