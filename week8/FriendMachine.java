
package week8;

import java.util.Scanner;

/**
 *
 * @author jordanriskus
 */
public class FriendMachine {

    final static int COMPAT_THRESH = 100;
    // main method
    public static void main(String[] args) {
        // set variables to initial values
        int compatScore = 0;
        int responseNum = 0;
        Scanner scan = new Scanner (System.in);

        // welcome and ask Q1
        System.out.println("Welcome to my Friend Machine!");
        System.out.println("Question 1: In your free time, do you enjoy a good book?");
        System.out.println("1: Yes; 0: No");
        // use scanner to read input
        responseNum = scan.nextInt();

        // evaluate response
        if(responseNum == 1){
            System.out.println("Good answer, I like how you think!");
            
            // +100 for being well read
            compatScore = compatScore + 100;

            // ask Q2; only if answered yes
            // nested/dependant question
            System.out.println("Question 2: Which category is your favorite?");
            System.out.println("1: Fiction - I just love a good story!");
            System.out.println("2: Non-fiction - I dont have time for made-up stuff.");
            System.out.println("3: Classic Literature - I'm a man of culture, sir.");
            
            responseNum  = scan.nextInt();

            if(responseNum == 1){
                System.out.println("Probably the most popular choice.. can't go wrong!");
                compatScore = compatScore + 50;
            } else if(responseNum == 2){
                System.out.println("Ahh I see.. I bet you're pretty smart huh.");
                compatScore = compatScore + 100;
            } else if(responseNum == 3){
                System.out.println("Another good answer! You just can't beat the classics.");
                compatScore = compatScore + 200;
            }

        } else {
            // if they answered no to Q1
            System.out.println("What a shame... you're missing out!");
            System.out.println("In that case, we'll skip Question 2");
        } // close if/else Q1

        // reunite logic on Q3
        System.out.println("Question 3:");
        System.out.println("How about film? 1: Yes; 0: No");
        // read user input
        responseNum = scan.nextInt();
        if(responseNum == 1){
            System.out.println("Of course, who doesn't like TV!?");
            compatScore = compatScore + 100;
        } else {
            System.out.println("That's okay, some people just don't like entertainment.");
            compatScore = compatScore + 0;
        } // close if/else Q3

        // display score
        System.out.println("Our compatability score is: ");
        System.out.println(compatScore);
        System.out.println("The minimum compatability score is: ");
        System.out.println(COMPAT_THRESH);
        
        // final compatability determination
        if(compatScore >= COMPAT_THRESH){
            System.out.println("There's a good chance we could be friends!");
        } else {
            System.out.println("It doesn't seem like we'll have much to talk about.");
        }
        // sign off
        System.out.println("Thanks for giving my Friend Machine a try!");
        
        
    } // close main method

} // close class FriendMachine