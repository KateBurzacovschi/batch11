package class26;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo2 {
    public static void main(String[] args) {
        ArrayList<String> subject1=new ArrayList<>();
        subject1.add("SDLC");
        subject1.add("Manual Testing");
        subject1.add("JAva");
        subject1.add("G");
        subject1.add("Selenium");
        subject1.add("TestNg");
        subject1.add("SQL");
        Iterator<String> iterator= subject1.iterator();
        subject1.removeIf(element->element.length()>4);

        while(iterator.hasNext()){
            String element= iterator.next();
            if(element.length()>4){
                iterator.remove();
            }
        }
        System.out.println(subject1);
    }
}
