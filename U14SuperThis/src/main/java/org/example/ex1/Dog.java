package org.example.ex1;

public class Dog extends Animal{
    private String name = "I am dog";

    public void printMethod(){
        super.printMethod();
        System.out.println(super.name);
        System.out.println("Printed from class: Dog" + getClass().getName());
        System.out.println(name);
    }
}
