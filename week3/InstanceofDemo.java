/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 * Demonstrates the instanceof operator
 * @author julian
 */
public class InstanceofDemo {
    public static void main(String[] args) {
        
        Parent obj1 = new Parent();
        Parent obj2 = new Child();
        
        // demonstrate instanceof operator
        System.out.println("obj1 instanceof Parent: "
        + (obj1 instanceof Parent));
        System.out.println("obj1 instanceof Child: "
        + (obj1 instanceof Child));
        System.out.println("obj1 instanceof MyInterface: "
        + (obj1 instanceof MyInterface));
        System.out.println("obj2 instanceof Parent: "
        + (obj2 instanceof Parent));
        System.out.println("obj2 instanceof Child: "
        + (obj2 instanceof Child));
        System.out.println("obj2 instanceof MyInterface: "
        + (obj2 instanceof MyInterface));
        
    } // close main
} // close class InstanceofDemo

class Parent {}
class Child extends Parent implements MyInterface {}
interface MyInterface {}
