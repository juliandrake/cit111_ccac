/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.util.Random;
import java.util.Scanner;

/**
 * Asks the user for the answer to a math problem and provides them feedback
 * about their answer
 * @author julian
 */
public class MathQuiz {
    
    public static void main(String[] args) {
        
        // declare and initialize variables as needed
       
        
        
        
        
        
        
        
        
        
        final int MAXIMUM_ATTEMPTS = 3;
        final int NUMBER_OF_QUESTIONS = 3;
        final int MULTIPLIER_MAX = 10;
        int attemptedAnswer;
        int attempts = 0;
        int currentQuestion = 0;
        String currentQuestionString = "";
        int questionNum = 0;
        int score = 0;
        boolean isHard = false;
        
        // create a Scanner object
        Scanner myScanner = new Scanner(System.in);
        
        // create a Random object
        Random myRandom = new Random();
        int multiplier = myRandom.nextInt(MULTIPLIER_MAX) + 1;
        
        // multiply every number in each question by the multiplier amount
        final int MATH_PROBLEM = ((25 * multiplier) / (5 * multiplier)) % (5 * multiplier) + (2 * multiplier);
        final String MATH_PROBLEM_STRING = "(" + 25 * multiplier + " / " +
                5 * multiplier + ") % " + 5 * multiplier + " + " +  2 * multiplier;
        multiplier = myRandom.nextInt(MULTIPLIER_MAX) + 1;
        final int MATH_PROBLEM_2_EASY = 5 * multiplier * 5 * multiplier * 5 * multiplier;
        final String MATH_PROBLEM_2_EASY_STRING = (5 * multiplier) + " * " + (5 * multiplier) +
                " * " + (5 * multiplier);
        multiplier = myRandom.nextInt(MULTIPLIER_MAX) + 1;
        final int MATH_PROBLEM_2_HARD = (10 * multiplier - 2 * multiplier) * 4 * multiplier / (16 * multiplier);
        final String MATH_PROBLEM_2_HARD_STRING = "(" + 10 * multiplier + " - " + 2 * 
                multiplier + ") * " + 4 * multiplier + " / " +16 * multiplier;
        multiplier = myRandom.nextInt(MULTIPLIER_MAX) + 1;
        final int MATH_PROBLEM_3_EASY = 2 * multiplier + 2 * multiplier;
        final String MATH_PROBLEM_3_EASY_STRING = 2 * multiplier + " + " + 2 * multiplier;
        multiplier = myRandom.nextInt(MULTIPLIER_MAX) + 1;
        final int MATH_PROBLEM_3_HARD = ((4 * multiplier) * (4 * multiplier)) / (2 * multiplier) + (4 * multiplier);
        final String MATH_PROBLEM_3_HARD_STRING = "(" + 4 * multiplier + " * " + 4 * multiplier
                + ") / " + (2 * multiplier) + " + " + (4 * multiplier);
        
        // run until all questions are completed or attempted as many times as possible
        while (questionNum < NUMBER_OF_QUESTIONS) {
            // run until maximum attempts are made
            while (attempts < MAXIMUM_ATTEMPTS) {
                // set value of currentQuestion based on difficulty and progression through quiz
                if (questionNum == 0) {
                    currentQuestion = MATH_PROBLEM;
                } else if (questionNum == 1 && isHard == false) {
                    currentQuestion = MATH_PROBLEM_2_EASY;
                } else if (questionNum == 1 && isHard == true) {
                    currentQuestion = MATH_PROBLEM_2_HARD;
                } else if (questionNum == 2 && isHard == false) {
                    currentQuestion = MATH_PROBLEM_3_EASY;
                } else {
                    currentQuestion = MATH_PROBLEM_3_HARD;
                }

                // set value of currentQuestionString based on difficulty and progression through quiz
                if (questionNum == 0) {
                    currentQuestionString = MATH_PROBLEM_STRING;
                } else if (questionNum == 1 && isHard == false) {
                    currentQuestionString = MATH_PROBLEM_2_EASY_STRING;
                } else if (questionNum == 1 && isHard == true) {
                    currentQuestionString = MATH_PROBLEM_2_HARD_STRING;
                } else if (questionNum == 2 && isHard == false) {
                    currentQuestionString = MATH_PROBLEM_3_EASY_STRING;
                } else {
                    currentQuestionString = MATH_PROBLEM_3_HARD_STRING;
                }

                // prompt user for input
                System.out.println("==============================");
                System.out.println("Compute the value of " + currentQuestionString + ":");
                // store inputted int in attemptedAsnwer
                attemptedAnswer = myScanner.nextInt();
                // compare attempted answer to correct answer
                if (attemptedAnswer == currentQuestion) {
                    System.out.println("Your answer was correct. Nice job!");
                    // increment questionNum and Score by 1
                    questionNum = questionNum + 1;
                    score = score + 1;
                    // the user is ready for a harder question
                    isHard = true;
                    // display score
                    System.out.println("Moving on... Your score is: " + score);
                    break;
                } else {
                    System.out.println("Sorry, your answer was incorrect.");
                    // determine if incorrect answer was too high or too low
                    if (attemptedAnswer > currentQuestion) {
                        System.out.println("Your answer was too high.");
                    } else {
                        System.out.println("Your answer was too low.");
                    } // close if/else

                    // determine if the maximum attempts for the question have been made
                    if (attempts + 1 == MAXIMUM_ATTEMPTS) {
                        // reset attempts to 0
                        attempts = 0;
                        // increment questionNum by 1
                        questionNum = questionNum + 1;
                        // the user needs an easier question
                        isHard = false;
                        // display score and solution
                        System.out.println("Moving on... Your score is: " + score);
                        System.out.println("Solution: " + currentQuestionString + " =");
                        System.out.println(currentQuestion);
                        break;
                    }

                } // close if/else

                // increment attempts by 1
                attempts = attempts + 1;
            } // close while loop
        } // close while loop
    
    } // close main method
} // close class MathQuiz
