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
package objects1;

/**
 * Simulates various foods using object-oriented programming
 * The protein values for the various foods were from USDA and carbmanager.com
 * @author julian
 */
public class FoodLand {
    
    // final member variables to store bite sizes
    final static int SMALL_BITE = 25;
    final static int MEDIUM_BITE = 50;
    final static int LARGE_BITE = 75;
    
    public static void main(String[] args) {
        // create a variable to store a Donut object
        Donut myDonut;
        // create a new Donut and store it in myDonut
        myDonut = new Donut();
        // create a variable to store a Sandwich object
        Sandwich mySandwich;
        // create a new Sandwich and store it in mySandwich
        mySandwich = new Sandwich();
        // create a variable to store a Banana object
        Banana myBanana;
        // create a new Banana and store it in myBanana
        myBanana = new Banana();
        
        // set up the name property for myDonut
        myDonut.name = "Bob";
        
        // display information about donut
        System.out.println("A donut has been created. Here is some information about it.");
        // call displayDonutInfo method and pass in myDonut
        displayDonutInfo(myDonut);
        
        // simulate eating the donut
        System.out.println("Eating a small bite of the donut.");
        myDonut.simulateEating(SMALL_BITE); // call myDonut's simulateEating method
        displayDonutInfo(myDonut);
        
        // display information about sandwich
        System.out.println("There is also a sandwich. It has nothing in it right now.");
        // call displaySandwichInfo method and pass in mySandwich
        displaySandwichInfo(mySandwich);
        
        // modify properties of sandwich
        System.out.println("Adding sauce...");
        mySandwich.addSauce(); // call mySandwich's addSauce method
        System.out.println("Adding ingredients...");
        // call mySandwich's addIngredients method and pass in 3 Strings
        mySandwich.setIngredients("Cheese", "Lettuce", "Tomatoes");
        System.out.println("Eating a medium bite of the sandwich.");
        mySandwich.eatSandwich(MEDIUM_BITE); // call mySandwich's eatSandwich method
        displaySandwichInfo(mySandwich);
        
        // display information about banana
        System.out.println("Finally, there is also a banana on the table.");
        // call displayBananaInfo and pass in myBanana
        displayBananaInfo(myBanana);
        
        System.out.println("It looks like it isn't ripe yet.");
        System.out.println("Let's wait for a while...");
        
        // set myBanana's ripeness to 50
        myBanana.ripeness = 50;
        displayBananaInfo(myBanana);
        System.out.println("It looks good now.");
        System.out.println("Eating a large bite of the banana.");
        myBanana.eatBanana(LARGE_BITE); // call myBanana's eatBanana method
        displayBananaInfo(myBanana);
        
        // display protein content of all food
        System.out.println("If I were to eat all of this food, I would eat " +
                (myDonut.protein_grams + mySandwich.protein_grams + myBanana.protein_grams)
                + "g of protein!");
    } // close method main
    
    private static void displayDonutInfo(Donut donut) {
        System.out.println(""); // display a blank line
        System.out.println("Donut info:");
        System.out.println("--Name: " + donut.name);
        System.out.println("--Percent Remaining: " + donut.getPercRemaining() + "%");
        System.out.println("");
    } // close method displayDonutInfo
    
    private static void displaySandwichInfo(Sandwich sandwich) {
        System.out.println(""); // display a blank line
        System.out.println("Sandwich info:");
        System.out.println("--Has sauce: " + sandwich.hasSauce);
        System.out.println("--Ingredients: ");
        sandwich.displayIngredients(); // call the sandwich's displayIngrdients method
        System.out.println("--Percent Remaining: " + sandwich.percRemaining + "%");
        System.out.println("");
    } // close method displaySandwichInfo
    
    private static void displayBananaInfo(Banana banana) {
        System.out.println(""); // display a blank line
        System.out.println("Banana info:");
        // call the banana's getColor method and display its color
        System.out.println("--Color: " + banana.getColor());
        System.out.println("--Percent Remaining: " + banana.percRemaining + "%");
        System.out.println("");
    } // close method displayBananaInfo
    
} // close class FoodLand
