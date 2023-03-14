package org.example.ex1;

public class Animal {
    protected String name = "I am animal";
    public void printMethod(){
        System.out.println("Printed from class: Animal" + getClass().getName());
    }
}
