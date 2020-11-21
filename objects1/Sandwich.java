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
 * Represents a sandwich
 * @author julian
 */
public class Sandwich {
    public int percRemaining = 100; // represents percent eaten
    private String ingredient1 = "None";
    private String ingredient2 = "None";
    private String ingredient3 = "None";
    public boolean hasSauce = false; // defaults to no sauce
    public double protein_grams = 8.1;
    
    public void eatSandwich(int percEaten) {
        // subtract percEaten from percRemaining
        percRemaining = percRemaining - percEaten;
    } // close method eatSandwich
    
    public void displayIngredients() {
        System.out.println("--Ingredient 1: " + ingredient1);
        System.out.println("--Ingredient 2: " + ingredient2);
        System.out.println("--Ingredient 3: " + ingredient3);
    } // close method displayIngredients
    
    public void setIngredients(String i1, String i2, String i3) {
        ingredient1 = i1;
        ingredient2 = i2;
        ingredient3 = i3;
    } // close method setIngredients
    
    public void addSauce() {
        // set hasSauce to true
        hasSauce = true;
    } // close method addSauce
    
} // close class Sandwich
