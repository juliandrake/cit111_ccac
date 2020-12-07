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
 * Demonstrates the most essential functionality of a switched block.
 * @author julian
 */
public class BasicSwitch {
    
    public static void main(String[] args) {
        // a hard-coded value to test switch unctionality
        final int SELECTOR = 23;
        
        // match the value of SELECTOR to a case's value and execute the code
        // in that case until a break; is encountered
        switch (SELECTOR) {
            case 1:
                System.out.println("First case selected");
                break;
            case 2:
                System.out.println("Second case selected");
                break;
            case 78:
                System.out.println("Cases can match any int value");
                break;
            // any pass through this switch which doesn't match a case hits here
            default:
                System.out.println("Default case");
        } // close switching block
    } // close main
    
} // close class
