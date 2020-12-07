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

import java.util.Random;

/**
 * Represents an electric guitar
 * @author julian
 */
public class Guitar {
    
    // member variables
    private String model;
    private String color;
    private int year;
    private String modifier;
    private int price;
    private String name = "";
    private Random rand = new Random();
    
    // arrays to represent choices for models, colors, etc...
    private final String[] models = new String[8];
    private final String[] colors = new String[15];
    private final String[] modifiers = new String[6];
    
    // constructor, learned about from here: https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html
    public Guitar() {
        // store values in previously-mentioned arrays
        // models
        models[0] = "Stratocaster";
        models[1] = "Telecaster";
        models[2] = "Les Paul";
        models[3] = "Mustang";
        models[4] = "Jazzmaster";
        models[5] = "Jaguar";
        models[6] = "SG";
        models[7] = "Flying V";
        // colors
        colors[0] = "Black";
        colors[1] = "Olympic White";
        colors[2] = "Sunburst";
        colors[3] = "Candy Apple Red";
        colors[4] = "Surf Green";
        colors[5] = "Butterscotch";
        colors[6] = "Pink";
        colors[7] = "Sonic Blue";
        colors[8] = "Dark Blue";
        colors[9] = "Gold";
        colors[10] = "Green";
        colors[11] = "Purple";
        colors[12] = "Seafoam Green";
        colors[13] = "Indigo";
        colors[14] = "Violet";
        // modifiers
        // (these have spaces at the end to make getting the guitar's name
        // easier if there is no modifier, as the default value will be a space)
        modifiers[0] = "7-String";
        modifiers[1] = "8-String";
        modifiers[2] = "12-String";
        modifiers[3] = "Semi-hollow";
        modifiers[4] = "Electric-acoustic";
        modifiers[5] = "Used";
        
        // assign values to member variables by pulling random values from these arrays
        model = models[rand.nextInt(models.length)];
        color = colors[rand.nextInt(colors.length)];
        
        // only half of the guitars will have a "modifier"
        if (rand.nextBoolean()) {
            modifier = modifiers[rand.nextInt(modifiers.length)];
        } else {
            modifier = "";
        } // close if/else
        
        // set the year from a random value between 1960 - 2020
        // (perhaps some of these dates are inaccurate, but who cares?)
        year = 1960 + rand.nextInt(60);
        
        // set the price from a random value between 300 - 3000
        price = 300 + rand.nextInt(2700);
        
        // set name based on variables
        name = name + year + " ";
        if (modifier != "") { // if there is a modifier...
            name = name + modifier + " "; // add it to the name String
        } // close if
        name = name + color + " " + model + " ($" + price + ")";
        
        
        
    } // close constructor
    
    // method to get the guitar's name
    public String getName() {
        return name;
    } // close method getName
    
    // method to get the guitar's price
    public int getPrice() {
        return price;
    } // close method getName
    
    // method to mark the guitar as "nonexistent"
    public void markNonexistent() {
        name = "None";
    } // close method purchase
    
} // close class Guitar
