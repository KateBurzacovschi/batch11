package class27;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Life");
        arrayList.add("Orange");
        arrayList.add("Car");
        arrayList.add("lamp");
        arrayList.add("Purple");
        arrayList.add("Love");

        for (int i = 0; i < arrayList.size(); i++) {
            String str = arrayList.get(i);
            if (str.toLowerCase().endsWith("e")) {
                arrayList.set(i, str.substring(0, str.length() - 1));
            }


        }
            Iterator<String> iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                String word = iterator.next();
                if (word.toLowerCase().endsWith("e")) {
                    iterator.remove();
                }
            }
            System.out.println(arrayList);

        }
    }


