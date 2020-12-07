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

/**
 * Demonstrates the most essential functionality of a switched block in the form
 * of if/else chains.
 * @author julian
 */
public class BasicSwitchAsIf {
    
    public static void main(String[] args) {
        // a hard-coded value to use in if/else
        final int SELECTOR = 1;
        
        if (SELECTOR == 1) {
            System.out.println("First case selected");
        } else if (SELECTOR == 2) {
            System.out.println("Second case selected");
        } else if (SELECTOR == 78) {
            System.out.println("Third case selected");
        } else {
            System.out.println("Default case");
        } // close if/else chain
    } // close main
    
} // close class
