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
package weekB1_scope;

import java.util.Scanner;

/**
 * Simulates a point-of-sale system for a restaurant
 * @author julian
 */
public class OrderTabulator {
    
    // initalize member variables
    private static int numPizzaSlidersOrdered = 0;
    private static int numRoastBeefSlidersOrdered = 0;
    private static int numBuns = 10;
    private static int numCheese = 20;
    private static int numMeat = 8;
    private static int numSauce = 10;
    private static double totalRevenue = 0;
    final static double SALES_TAX_MULTIPLER = 1.07;
    final static double PIZZA_SLIDER_PRICE = 1.49;
    final static double ROAST_BEEF_SLIDER_PRICE = 1.79;
    
    public static void main(String[] args) {
        
        // create a Scanner object
        Scanner myScanner = new Scanner(System.in);
        
        // display message to user asking for input
        System.out.println("=======Point-of sales System=======");
        // prompt user for input
        System.out.println("Enter the number of pizza sliders ordered:");
        // store inputted number in int pizzaSlidersToOrder
        int pizzaSlidersToOrder = myScanner.nextInt();
        // use appropriate method to order desired quantities of food
        orderPizzaSliders(pizzaSlidersToOrder);
        // prompt user for input
        System.out.println("Enter the number of roast beef sliders ordered:");
        // store inputted number in int roastBeefSlidersToOrder
        int roastBeefSlidersToOrder = myScanner.nextInt();
        // use appropriate method to order desired quantities of food
        orderRoastBeefSliders(roastBeefSlidersToOrder);
        
        // use method to display total orders
        displayOrderTotals();
    } // close method main
    
    public static void orderPizzaSliders(int amount) {
        // increment numPizzaSlidersOrdered by inputted amount
        numPizzaSlidersOrdered = numPizzaSlidersOrdered + amount;
        // determine if the order is possible
        if (numBuns >= amount && numCheese >= amount && numSauce >= amount) {
            // if it is, subtract the ingredients used from their respective variables
            numBuns = numBuns - amount;
            numCheese = numCheese - amount;
            numSauce = numSauce - amount;
            // calculate revenue from purchase and add it to totalRevenue
            totalRevenue = totalRevenue + taxItems(amount, PIZZA_SLIDER_PRICE);
        } else {
            // determine what ingredient is the limiting factor in the order
            int leastAmount = 0;
            if (numBuns < amount) {
                leastAmount = numBuns;
            }
            if (numCheese < amount && numCheese < leastAmount) {
                leastAmount = numCheese;
            }
            if (numSauce < amount && numSauce < leastAmount) {
                leastAmount = numSauce;
            }
            // tell user the greatest amount of orders possible, and make them
            System.out.println("Warning! Your order cannot be completed due to an ingredient shortage.");
            System.out.println("The greatest amount of orders made will be " + leastAmount);
            numBuns = numBuns - leastAmount;
            numCheese = numCheese - leastAmount;
            numSauce = numSauce - leastAmount;
            // calculate revenue from purchase and add it to totalRevenue
            totalRevenue = totalRevenue + taxItems(leastAmount, PIZZA_SLIDER_PRICE);
        } // close if / else
    } // close method orderPizzaSliders
    
    public static void orderRoastBeefSliders(int amount) {
        // increment numPizzaSlidersOrdered by inputted amount
        numPizzaSlidersOrdered = numPizzaSlidersOrdered + amount;
        // determine if the order is possible
        if (numBuns >= amount && numCheese >= amount && numMeat >= amount) {
            // if it is, subtract the ingredients used from their respective variables
            numBuns = numBuns - amount;
            numCheese = numCheese - amount;
            numMeat = numMeat - amount;
            // calculate revenue from purchase and add it to totalRevenue
            totalRevenue = totalRevenue + taxItems(amount, ROAST_BEEF_SLIDER_PRICE);
        } else {
            // determine what ingredient is the limiting factor in the order
            int leastAmount = 0;
            if (numBuns < amount) {
                leastAmount = numBuns;
            }
            if (numCheese < amount && numCheese < leastAmount) {
                leastAmount = numCheese;
            }
            if (numMeat < amount && numMeat < leastAmount) {
                leastAmount = numMeat;
            }
            // tell user the greatest amount of orders possible, and make them
            System.out.println("Warning! Your order cannot be completed due to an ingredient shortage.");
            System.out.println("The greatest amount of orders made will be " + leastAmount);
            numBuns = numBuns - leastAmount;
            numCheese = numCheese - leastAmount;
            numMeat = numMeat - leastAmount;
            // calculate revenue from purchase and add it to totalRevenue
            totalRevenue = totalRevenue + taxItems(leastAmount, ROAST_BEEF_SLIDER_PRICE);
        } // close if / else
    } // close method orderRoastBeefSliders
    
    public static void displayOrderTotals() {
        // display statistics about orders
        System.out.println("=======Total Orders=======");
        System.out.println("Pizza sliders ordered: " + numPizzaSlidersOrdered);
        System.out.println("Roast beef sliders ordered: " + numRoastBeefSlidersOrdered);
        System.out.println("Total revenue: " + totalRevenue);
        System.out.println("=======Inventory Tracking=======");
        System.out.println("Buns remaining: " + numBuns);
        System.out.println("Cheese remaining: " + numCheese);
        System.out.println("Meat remaining: " + numMeat);
        System.out.println("Sauce remaining: " + numSauce);
    } // close method orderRoastBeefSliders
    
    public static double taxItems(int items, double price) {
        // multiply items by price
        double subtotal = (double) items * price;
        // multiply subtotal by tax multiplier, and return it
        return subtotal * SALES_TAX_MULTIPLER;
    } // close method taxItems
    
} // close class OrderTabulator
