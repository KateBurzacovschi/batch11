package class26;

import java.util.ArrayList;

public class WrapperClass {
    public static void main(String[] args) {
        ArrayList<Fruit> fruits=new ArrayList<>();
        fruits.add(new Apple());
        fruits.add(new Orange());

        for(Fruit f:fruits){
            f.printName();
        }
    }

}
class Fruit{
    void printName(){
        System.out.println("I am fruit");
    }
}
class Apple extends Fruit{
    void printName(){
        System.out.println("i am apple");
    }
}
class Orange extends Fruit{
    void printNAme(){
        System.out.println("i am orange");
    }
}
