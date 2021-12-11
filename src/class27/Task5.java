package class27;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Task5 {
    public static void main(String[] args) {
        List<String> alist=new ArrayList<>();
        alist.add("John");
        alist.add("Jane");
        alist.add("James");
        alist.add("Jasmine");
        alist.add("Jane");
        alist.add("James");

        Set<String> set =new LinkedHashSet<>(alist);
        alist=new ArrayList<>(set);
        System.out.println(alist);
    }
}
