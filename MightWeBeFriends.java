/*
 * Copyright 2020 julian.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package week6;

import java.util.Scanner;

/**
 * This program asks the user a series of questions to determine if they might
 * be good friends with me.
 * @author julian
 */
public class MightWeBeFriends {
    
    public static void main(String[] args) {
        
        // declare and initialize constants and score
        final int SCORE_THRESHOLD = 50;
        final int SCORE_THRESHOLD_HIGH = 85;
        int score = 0;
        
        // declare variables for storing user's responses
        int response;
        String personalityType;
        
        // create new Scanner object and store in myScanner
        Scanner myScanner = new Scanner(System.in);
        
        // ask the user if they are passionate about music
        System.out.println("Are you passionate abount music? (0 = no, 1 = yes)");
        // store their response (as an int) in the variable "response"
        response = myScanner.nextInt();
        
        // see if the user's response was 1 (yes) or not (no)
        if (response == 1) {
            // increment score and display message
            score = score + 50;
            System.out.println("Awesome, me too!");
        } else {
            // subtract from score and display message
            score = score - 20;
            System.out.println("Oh, that's okay.");
        } // close if/else
        
        // ask the user if they would describe themselves as mature
        System.out.println("Would you describe yourself as mature? (0 = no, 1 = yes)");
        // store their response (as an int) in the variable "response"
        response = myScanner.nextInt();
        
        // see if the user's response was 1 (yes) or not (no)
        if (response == 1) {
            // increment score and display message
            score = score + 30;
            System.out.println("Great!");
        } else {
            // subtract from score and display message
            score = score - 30;
            System.out.println("Oh, okay.");
        } // close if/else
        
        // ask the user if they are introverted
        System.out.println("Are you, in your opinion, introverted? (0 = no, 1 = yes)");
        // store their response (as an int) in the variable "response"
        response = myScanner.nextInt();
        
        // see if the user's response was 1 (yes) or not (no)
        if (response == 1) {
            // increment score and display message
            score = score + 25;
            System.out.println("Nice, I would describe myself as introverted too.");
        } else {
            // display message
            System.out.println("I'm not personally, but that's okay too!");
        } // close if/else
        
        // ask the user if they play any instruments
        System.out.println("Do you play any instruments? (0 = no, 1 = yes)");
        // store their response (as an int) in the variable "response"
        response = myScanner.nextInt();
        
        // see if the user's response was 1 (yes) or not (no)
        if (response == 1) {
            // increment score and display message
            score = score + 15;
            System.out.println("Cool, I also play some instruments!");
            // ask the user if they play the guitar
            System.out.println("Do you play the guitar? (0 = no, 1 = yes)");
            // store their response (as an int) in the variable "response"
            response = myScanner.nextInt();
            
            // see if the user's response was 1 (yes)
            if (response == 1) {
                // increment score and display message
                score = score + 35;
                System.out.println("Awesome, me too!");
            } else {
                // display message
                System.out.println("That's okay, I'm sure your instrument is cool too.");
            }
            
            // ask the user if they like to play jazz
            System.out.println("Do you like to play jazz? (0 = no, 1 = yes)");
            // store their response (as an int) in the variable "response"
            response = myScanner.nextInt();
            
            // see if the user's response was 1 (yes) or not (no)
            if (response == 1) {
                // increment score and display message
                score = score + 15;
                System.out.println("Yeah, I like to play jazz too.");
            } else {
                // display message
                System.out.println("Not a problem!");
            } // close if/else
        } // close if/else
        
        // ask the user if they've ever taken a Myers-Briggs personality test
        System.out.println("Have you ever taken a Myers-Briggs personality test?"
                + " (0 = no, 1 = yes)");
        // store their response (as an int) in the variable "response"
        response = myScanner.nextInt();
        
        //see if the user's response was 1 (yes) or not (no)
        if (response == 1) {
            // ask the user what their personality type was
            System.out.println("What was your personality type? (Enter 4 letters)");
            // store their response (as a String) in the variable "personalityType"
            personalityType = myScanner.next();
            // compare the user's personality type to mine
            if (personalityType.equals("INTJ")) {
                // increment score and display message
                score = score + 35;
                System.out.println("Although it doesn't correspond to much scientifically, "
                        + " we have the same personaltiy type!");
            } else {
                System.out.println("We don't have the same personality type, although"
                        + " we can still be friends!");
            }
        } else {
            // display message
            System.out.println("You might want to take one. You might find your results interesting,"
                    + " even if it's not totally backed up by science.");
        } // close if/else
        
        // check compatibility score against defined thresholds
        if (score >= SCORE_THRESHOLD) { // if score is greater than medium threshold
            if (score >= SCORE_THRESHOLD_HIGH) { // if score is greater than high threshold
                // display message
                System.out.println("We would probably be very good friends!");
            } else { // if score is greater than medium threshold but not high threshold
                // display message
                System.out.println("We might be good friends, at least according"
                        + " to this quiz.");
            } // close if/else
        } else { // if score is not greater than either threshold
            // display message
            System.out.println("We might not be good friends, but who knows for sure?");
        } // close if/else 

    } // close main method
} // close class MightWeBeFriends
