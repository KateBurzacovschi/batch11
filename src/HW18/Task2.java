package HW18;

public class Task2 {
    public static void main(String[] args) {
        B.printF();
    }
}
class A{
    static void printF(){
        System.out.println("printF from A");
    }
}
class B extends A{

}