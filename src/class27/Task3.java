package class27;

import java.util.ArrayList;
import java.util.Locale;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new  ArrayList<>();
        arrayList.add("Tea");
        arrayList.add("Coffee");
        arrayList.add("Soft Drinks");
        arrayList.add("Pepsi");
        arrayList.add("Water");
        arrayList.add("Hot chocolate");
        arrayList.add("Lemon Tea");

        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i).toLowerCase().replaceAll("[ae]","").length()<arrayList.get(i).length()){
                arrayList.set(i,"Water");
            }

        }
        System.out.println(arrayList);
    }
}
