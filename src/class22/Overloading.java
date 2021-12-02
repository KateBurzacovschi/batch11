package class22;

public class Overloading {
  void  method(int number){
    System.out.println(number);

  }
 void  method(int number,String name){
    System.out.println(number);
   System.out.println("Kate");

  }

  public static void main(String[] args) {
    Overloading md=new Overloading();
    md.method(10);
    md.method(12,"Kate");

  }
}
