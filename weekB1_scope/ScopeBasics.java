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
package weekB1_scope;

/**
 * Demonstrates basic scope concepts
 * @author julian
 */
public class ScopeBasics {
    // first member variable: can be read from and written to by ANY code/method
    // in this class
    private static String classScopedVar = "All methods can access me!";
    
    // this method demonstrate which variables can be accessed in its local scope:
    // only class-scoped variables and its own loccal variable called localScope2
    public static void demonstrateScope() {
        System.out.println("Inside demonstrateScope");
        // declaration and initalization of a local variable to demonstrateScope
        String localScope2 = "I'm local to demonstrateScope";
        // .out.println(localScope1); // localScope1 was declared in main
                                         // and cannot be accessed by other methods
        System.out.println(classScopedVar);
        System.out.println(localScope2);
        // any method can change a class-scoped variable's value
        classScopedVar = "I can be changed in any method.";
    } // close method demonstrateScope
    
    // Remember: the main method can be located anywhere you want-- method order
    // withing a class doesn't affect the execution of the code itself
    public static void main(String[] args) {
        System.out.println("Inside Main");
        // declaration and initalization of a local variable to main
        String localScope1 = "I'm local to main";
        System.out.println(localScope1);
        System.out.println(classScopedVar);
        // System.out.println(localScope2); // localScope 2 is only accessible in
                                         // the method in which it is declared:
                                         // demonstrateScope
                                         
        // call a method that will test variable scope concepts
        demonstrateScope();
                                         
    } // close method main
    
} // close class ScopeBasics
