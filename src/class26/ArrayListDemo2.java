package class26;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> subject1=new ArrayList<>();
        subject1.add("SDLC");
        subject1.add("Manual Testing");
        subject1.add("JAva");
        subject1.add("G");
        subject1.add("Selenium");
        subject1.add("TestNg");
        subject1.add("SQL");


        ArrayList<String> subject2=new ArrayList<>();
        subject2.add("TestNg");
        subject2.add("Cucumber");
        subject2.add("SQL");
        subject2.add("API");
        subject2.add("Doker");
        subject2.add("AWS");
        subject2.add("Mob Testing");
        subject2.add("Mock interview");
        subject2.retainAll(subject1);
        System.out.println(subject2);
        subject1.set(2,"AWS");
        System.out.println(subject1);
    }
}
