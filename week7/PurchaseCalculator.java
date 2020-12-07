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
package week7;

import java.util.Scanner;

/**
 * Simulates functionality of a purchase calculator to demonstrate
 * the creation and use of methods that take input parameters
 * @author julian
 */
public class PurchaseCalculator {
    
    static double totalTransactionAmount = 0;
    static double totalTaxCollected = 0;
    static double totalNonTaxRevenue = 0;
        
    public static void main(String[] args) {
        
        double salePrice;
        double spendingLimit;
        double taxRate;
        
        // create a Scanner object and store it in the variable "myScanner"
        Scanner myScanner = new Scanner(System.in);
        
        while (true) {
        
            // display a line to separate previous text
            System.out.println("=============================");

            // prompt user to enter price
            System.out.println("Enter a sale price: (Enter 0 to exit)");

            // read in price from user and store in salePrice;
            salePrice = myScanner.nextDouble();
            
            // break out of while loop if inputted price is 0
            
            if (salePrice == 0) {
                break;
            }

            // prompt user to enter their spending limit
            System.out.println("Enter your spending limit: ");

            // read in spending limit from user and store in spendingLimit;
            spendingLimit = myScanner.nextDouble();

            // prompt user to enter their tax rate
            System.out.println("Enter the tax rate: ");

            // read in tax rate from user and store in taxRate;
            taxRate = myScanner.nextDouble();

            double discount = 0.15;
            System.out.println("Price value: $" + salePrice);

            // call method displayPriceWithTax and pass in a double 
            displayPriceWithTax(salePrice, taxRate);

            // call method computePriceAfterDiscount and pass in two doubles
            computePriceAfterDiscount(salePrice, discount);

            // call method displayPurchasableNumber and pass in two doubles
            displayPurchasableNumber(salePrice, spendingLimit);
        } // close while loop
        
        // display total statistics
        displayTotalStatistics();
        
    } // close method main
    
    /*
    * Computes and diplays the inputted price with the inputted tax rate added
    * @param price the initial purchase price
    * @param tax the tax rate
    */
    
    public static void displayPriceWithTax(double price, double tax) {
        // compute price + tax
        double totalPrice = price * (1 + tax);
        // increment totalTransactionAmount, totalTaxCollected, and totalNonTaxRevenue
        totalTransactionAmount = totalTransactionAmount + totalPrice;
        totalTaxCollected = totalTaxCollected + (price * tax);
        totalNonTaxRevenue = totalNonTaxRevenue + price;
        // display total price, including tax
        System.out.println("Total price with tax: $" + totalPrice);
    } // close method displayPriceWithTax
    
    /*
    * Computes the final sale price given an intital sale price and a discount
    * @param price the price of the item before discount
    * @param discount the discount percent as a decimal value
    */
    
    public static void computePriceAfterDiscount(double price, double discount) {
        double finalPrice = price - (price * discount);
        System.out.println("Price after discount: $" + finalPrice);
    } // close method computePriceAfterDiscount
    
    /*
    * Computes the number of units that can be purchased given a spending limit
    * @param price the price per unit
    * @param limit the spending limit
    */
    
    public static void displayPurchasableNumber(double price, double limit) {
        int numPurchasable = (int) Math.floor(limit / price);
        System.out.println("Given a spending limit of $" + limit + ", " +
                "you can purchase " + numPurchasable + " unit(s).");
    } // close method displayPurchasableNumber
    
    // Displays total statistics about all transactions
    
    public static void displayTotalStatistics() {
        System.out.println("Total amount of all transactions: " + totalTransactionAmount);
        System.out.println("Total tax collected: " + totalTaxCollected);
        System.out.println("Total non-tax revenue: " + totalNonTaxRevenue);
    }
    
} // close class PurchaseCalculator
