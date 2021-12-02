package class21;

public class Overloading2Tester {
    public static void main(String[] args) {
        Overloading2.add(10, 10);
        Overloading2.add(10, 10.5);
        int[] arr = {10, 29, 10};
        Overloading2.add(arr);
    }
}