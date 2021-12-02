package class21;

public class Task1 {
    static void Rectangle(int l,int w){
        System.out.println( l *  w);
    }
    static void Square(int s,int s2){
        System.out.println(s*s2);
    }
    static void Box(int l,int w,int h){
        System.out.println(l*w*h);
    }

    public static void main(String[] args) {
       Task1.Rectangle(10,5);
       Task1.Square(10,10);
       Task1.Box(2,4,6);
    }
}
