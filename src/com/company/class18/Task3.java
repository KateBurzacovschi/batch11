package com.company.class18;

public class Task3 {
    private Task3(){
        System.out.println("1");
    }
     Task3(String name){//default
        System.out.println("1");
    }
    protected Task3(int age){
        System.out.println("1");
    }
    public Task3(double weight){
        System.out.println("1");
    }

    public static void main(String[] args) {
        new Task3();
        new Task3("name");
        new Task3(10);
        new Task3(45.2);
    }
}
