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
package week13;

/**
 * Creates and loads up a String Array
 * @author julian
 */
public class ProgrammingBooks {
    
    public static void main(String[] args) {
        // create an array object that stores only Strings
        // and store a reference to that array in the variable books
        String[] books = new String[5];
        
        books[0] = "Perl Cookbook";
        books[1] = "PHP Cookbook";
        books[2] = "Python in a Nutshell";
        books[3] = "Javascript: The Definitive Guide";
        books[4] = "Java in a Nutshell";
        
        printArrayContents(books);
    } // close method main
    
    /**
     * Prints the contents of a String array of size 5, indexed from 0 to 4
     * @param arrayInsideMethod an array of String objects with 5 bins
     */
    public static void printArrayContents(String[] arrayInsideMethod) {
        System.out.println("******** Extract array value and store it ********");
        // Extract contents of each array bin, then print it to the console
        String extractedArrayValue = arrayInsideMethod[0];
        System.out.println("Book at array at index 0: " + extractedArrayValue);
        // do this process for each bin of the array
        extractedArrayValue = arrayInsideMethod[1];
        System.out.println("Book at array at index 1: " + extractedArrayValue);
        extractedArrayValue = arrayInsideMethod[2];
        System.out.println("Book at array at index 2: " + extractedArrayValue);
        extractedArrayValue = arrayInsideMethod[3];
        System.out.println("Book at array at index 3: " + extractedArrayValue);
        extractedArrayValue = arrayInsideMethod[4];
        System.out.println("Book at array at index 4: " + extractedArrayValue);
        // INTENTIONALLY generate an IndexOutOfBoundsException
        extractedArrayValue = arrayInsideMethod[5];
        System.out.println("Book at array at index 5: " + extractedArrayValue);
        
        System.out.println("");
        System.out.println("******** Extract from array inside println() ********");
        // since the array stores String values, we can extract the value of
        // each array bin directly inside our call to the println() method
        System.out.println("Book at array index 0: " + arrayInsideMethod[0]);
        System.out.println("Book at array index 1: " + arrayInsideMethod[1]);
        System.out.println("Book at array index 2: " + arrayInsideMethod[2]);
        System.out.println("Book at array index 3: " + arrayInsideMethod[3]);
        System.out.println("Book at array index 4: " + arrayInsideMethod[4]);
        
    }
    
} // close class ProgrammingBooks