/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

/**
 * Reads a character from the keyboard.
 * @author julian
 */
public class KbIn {
    
    public static void main(String[] args)
        throws java.io.IOException { // necessary to handle input errors
        
        // declares the variable ch with type char
        char ch;
        
        // prompts the user for input
        System.out.println("Press a key followed by ENTER: ");
        
        // reads the user's input and returns a character, which is stored in ch
        ch = (char) System.in.read();
        
        // prints the user's key to the console
        System.out.println("Your key is: " + ch);
        
    } // close main method
} // close class KbIn
