package class27;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Listdemo1 {
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<>();
        cars.add("BMW M3");
        cars.add("Ferarri");
        cars.add("Ford");
        cars.add("Mercedes");
        cars.add(1,"Toyota");
        System.out.println(cars);
        System.out.println("*********************");
        for(String car:cars){
            System.out.println(car);
        }
        System.out.println("*************************");
        for (int i=0;i<cars.size();i++){
            System.out.println(cars.get(i));
        }
        System.out.println("**************************");
        int i=0;
        while(i< cars.size()) {

            System.out.println(cars.get(i));
            i++;
        }
        System.out.println("**************************");
          Iterator<String>iterator= cars.iterator();
          while (iterator.hasNext()){
              System.out.println(iterator.next());
          }
        }





   }
