/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

/**
 * A simple guess-the-letter game.
 * @author julian
 */
public class Guess {
    
    public static void main(String args[])
        throws java.io.IOException {

        // declares the variables ch and answer with type char
        // initializes answer with K
        char ch, answer = 'K';
        
        // describes the game to the user and prompts them for input
        System.out.println("I'm thinking of a letter between A and Z.");
        System.out.println("Can you guess it: ");
        
        // reads a char from the keyboard
        ch = (char) System.in.read();
        
        // if the character is the correct answer, tell the user they guessed correctly
        if (ch == answer) System.out.println("** Right **");
        
    } // close main method
} // close class Guess
