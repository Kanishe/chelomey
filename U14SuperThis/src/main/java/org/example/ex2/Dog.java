package org.example.ex2;

import java.util.Date;

public class Dog extends Animal{
    private String name;

    public Dog(String name) {
        super(name);
    }

    public Dog(){
        super();
    }
    public void printMethod(){
        super.printMethod();
        System.out.println("Name of dog " + super.name);
        System.out.println("Print from class Dog");
    }
}
