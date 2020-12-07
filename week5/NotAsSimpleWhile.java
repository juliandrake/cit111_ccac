/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

/**
 * Demonstrates the while() loop.
 * @author julian
 */
public class NotAsSimpleWhile {
    
    public static void main(String[] arg) {

        int numLoops = 0;

        // while()-controlled blocks
        while (numLoops <= 10) {
            System.out.println("The value of numLoops: " + numLoops);
            numLoops = numLoops + 1;
        } // close while loop     
        
        System.out.println("...After the while loop");

    } // close main method
} // close class NotAsSimpleWhile
