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
package objectproject;

import java.util.Scanner;

/**
 * Simulates a music store, allowing the user to perform transactions
 * @author julian
 */
public class MusicStore {
    
    // int to store the next index of purchasedGuitars that needs to be filled
    private static int nextGuitar = 0;
    // int to store the user's balance
    private static int userBalance = 5000;
    
    public static void main(String[] args) {
        
        // display initial scenario to user
        System.out.println("You, a generous philanthropist, are dedicated to supporting local musicans.");
        System.out.println("A local band has no instruments, and they need four guitars.");
        System.out.println("You head down to the local music store with $5000...");
        
        // create a new Scanner object
        Scanner myScanner = new Scanner(System.in);
        
        // int to store the index the user wants to buy
        int userIndex = 0;
        
        // create an array of Guitar objects
        // this represents the store's inventory
        Guitar[] inventory = new Guitar[15];
        
        // create an array of Guitar objects
        // this represents the user's purchased guitars
        Guitar[] purchasedGuitars = new Guitar[4];
        
        // get inventory's length and store in inventorySize
        int inventorySize = inventory.length;
        // use a for() loop to iterate over the array, storing a new Guitar object
        // in each index
        for (int i = 0; i < inventorySize; i = i + 1) {
            inventory[i] = new Guitar();
        } // close for() loop
        // do the same thing but for purchasedGuitars, also calling markNonexistent() on each guitar
        int purchasedGuitarsSize = purchasedGuitars.length;
        for (int i = 0; i < purchasedGuitarsSize; i = i + 1) {
            purchasedGuitars[i] = new Guitar();
            purchasedGuitars[i].markNonexistent();
        } // close for() loop
        
        while (purchasedGuitarsSize - nextGuitar != 0) { // run until user has filled up their inventory with guitars
            System.out.println("********GUITARS AVAILABLE TO PURCHASE********");
            displayInventory(inventory); // display inventory to user
            System.out.println("*********************************************");
            userIndex = getValidIndexRequest(myScanner, inventory, purchasedGuitars); // get index the user wishes to purchase
            purchaseGuitar(inventory, userIndex, purchasedGuitars); // purchase the Guitar object at that index
        } // close while() loop
        
    } // close main method
    
    // method to display store's inventory to user
    public static void displayInventory(Guitar[] array) {
        int arraySize = array.length; // get array's length and store in arraySize
        // use a for() loop to iterate over the array and display its contents
        for (int i = 0; i < arraySize; i = i + 1) {
            displayGuitar(array[i], i+1);
        } // close for() loop
    } // close method displayInventory
    
    // method to display information about a specific guitar to user
    public static void displayGuitar(Guitar guitar, int index) {
        System.out.println(index + ".) " + guitar.getName());
    } // close method displayGuitar
    
    // method to purchase a guitar
    public static void purchaseGuitar(Guitar[] inventory, int index, Guitar[] purchasedGuitars) {
        purchasedGuitars[nextGuitar] = inventory[index]; // place the desired guitar into the purchasedGuitars[] array
        nextGuitar = nextGuitar + 1; // increment nextGuitar by 1
        System.out.println("**********GUITARS YOU'VE PURCHASED***********");
        displayInventory(purchasedGuitars); // display the user's purchased guitars
        userBalance = userBalance - inventory[index].getPrice();
    } // close method purchaseGuitar
    
    public static int getValidIndexRequest(Scanner scanner, Guitar[] array, Guitar[] userArray) {
        // store array's length in arraySize
        int arraySize = array.length;
        int requestedIndex = 0; // index requested by user (+1)
        // ask user for the index they'd like to access and store in requestedIndex
        // I learned how to validate the user's input from here:
        // https://stackoverflow.com/questions/25491097/how-to-verify-that-input-is-a-positive-integer-in-java
        do {
            System.out.println("You have $"+userBalance+", and can purchase "
                    + (userArray.length - nextGuitar) + " more guitars.");
            System.out.println("What guitar would you like to purchase? (1-"+arraySize+")");
            if (scanner.hasNextInt()) {
                requestedIndex = scanner.nextInt();
            } else {
                System.out.println("That isn't a number!");
                scanner.next();
            } // close if/else
        } while ((requestedIndex <= 0 || requestedIndex > arraySize) || (userBalance - array[requestedIndex-1].getPrice() <= 0));

        // decrement requestedIndex by 1 so the user can enter 1 to access index 0
        requestedIndex = requestedIndex - 1;
        return requestedIndex;
    } // close method getValidIndexRequest
    
} // close class MusicStore
