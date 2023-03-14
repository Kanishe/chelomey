package org.example.ex2;

public class Animal {
    protected String name;

    public Animal() {
    }

    public Animal(String name){
        this.name = name;
    }

    public void printMethod(){
        System.out.println("Printed from class Animal");
    }

}
