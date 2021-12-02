package class21;

public class Task3 {
    static void method(boolean bol) {
        System.out.println(1);
    }

    static void method(String bol) {
        System.out.println(2);
    }

    static void method(double bol) {
        System.out.println(3);
    }

    static void method(int[] bol) {
        System.out.println(4);
    }

    static void method(Task3 bol) {
        System.out.println(5);
    }
}
