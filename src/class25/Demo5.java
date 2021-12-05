package class25;

import java.util.ArrayList;

public class Demo5 {
    public static void main(String[] args) {
        ArrayList<String> subject=new ArrayList<>();
        subject.add("SDLC");
        subject.add("Manual Testing");
        subject.add("JAva");
        subject.add("G");
        subject.add("Selenium");
        subject.add("TestNg");
        subject.add("Cucumber");
        subject.add("SQL");
        subject.add("API");
        subject.add("Doker");
        subject.add("AWS");
        subject.add("Mob Testing");
        subject.add("Mock interview");

        System.out.println(subject.size());
        subject.remove("TestNg");
        System.out.println(subject.size());

    }
}
