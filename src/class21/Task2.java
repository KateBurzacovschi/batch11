package class21;

public class Task2 {
    Task2(){
        System.out.println("I love programming languages");
    }
    Task2(String value){
        System.out.println("i love "+value);
    }

    public static void main(String[] args) {
        new Task2();
        new Task2("Java");
    }
}
