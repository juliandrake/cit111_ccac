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
 * Represents a banana
 * @author julian
 */
public class Banana {
    public int percRemaining = 100; // represents percent eaten
    public int ripeness = 0; // reprecents percentage of ripeness
    public double protein_grams = 1.3;
    
    public void eatBanana(int percEaten) {
        // subtract percEaten from percRemaining
        percRemaining = percRemaining - percEaten;
    } // close method eatBanana
    
    public String getColor() {
        // returns a String that represents the banana's color based on its
        // ripeness value
        if (ripeness >= 80) {
            return "Brown";
        } else if (ripeness >= 60) {
            return "Yellowish-brown";
        } else if (ripeness >= 40) {
            return "Yellow";
        } else if (ripeness >= 20) {
            return "Light yellow";
        } else {
            return "Light green";
        } // close nested if/else statements
    } // close method getColor
    
} // close class Banana
