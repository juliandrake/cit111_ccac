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

import java.io.IOException;

/**
 * Displays a menu and prompts the user for a choice, then displays information
 * about the selected topic
 * @author julian
 */
public class Help {
    
    public static void main(String[] args) throws IOException {
        
        // declare char choice
        char choice;
        
        // display a menu and prompt user for input
        System.out.println("Help on:");
        System.out.println("  1. if");
        System.out.println("  2. switch");
        System.out.println("Choose one: ");
        
        // store inputted character in variable choice
        choice = (char) System.in.read();
        
        // print blank line
        System.out.println("");
        
        switch(choice) {
            case '1':
                System.out.println("The if:\n");
                System.out.println("if(condition) statement;");
                System.out.println("else statement;");
                break;
            case '2':
                System.out.println("The switch:\n");
                System.out.println("switch(expression) {");
                System.out.println("    case constant:");
                System.out.println("        statement sequence");
                System.out.println("        break;");
                System.out.println("    // ...");
                System.out.println("}");
            default:
                System.out.println("Selection not found.");
        } // close switch block
    } // close main method
    
} // close class Help
