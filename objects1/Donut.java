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
 * Represents a donut
 * @author julian
 */
public class Donut {
    
    // member variables
    private int percRemaining = 100;
    public String name;
    public double protein_grams = 2.1;
    
    // method: takes in an integer represetning the size of bite
    // being taken of this donut. returns nothing
    public void simulateEating(int percentEaten) {
        // subtract the bite size from the existing donut percent remaining
        percRemaining = percRemaining - percentEaten;
    } // close method simulateEating
    
    // method: takes no input parameters and returns percRemaining
    public int getPercRemaining() {
        // very simple guts: just send back the value of one of the object's
        // member variables to the calling method. this is called a "getter"
        return percRemaining;
    } // close method getPercRemaining
    
    // there's no main() method in this class!
    // we must make this object with the new keyword inside another  class
    // in order for this class to do anything
} // close class Donut
