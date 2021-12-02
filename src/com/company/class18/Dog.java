package com.company.class18;

public class Dog extends Animal{
    boolean loyal=true;
    void printAllInfo(){
        System.out.println(name+breed+age+weight);
        eat();
    }
    void bark(){
        System.out.println(name+"barking");
    }
}

