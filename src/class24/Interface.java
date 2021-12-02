package class24;

public interface Interface {
    default void method1(){
        System.out.println("i am default method in Interface");
    }
    static void method2(){
        System.out.println("i am a static method in Interface");
    }
}
class Test implements Interface {
}

class Main{
    public static void main(String[] args) {
        Interface.method2();
        //Interface.method1(); not allowed for default methods

        Interface I1=new Test();
        I1.method1();
    }
}