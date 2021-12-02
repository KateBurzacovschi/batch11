package class23;

public class FinalDemo {
    private final String NAME="Fatma";
    protected final int AGE=20;
    public final double WEIGHT=30;
    final double HEIGHT=5.4;
    static final int NR=2;
    private  void printName(){
        System.out.println(NAME);
    }
    final void printAge(){
        System.out.println(AGE);
    }
    protected final void printHeight(){
        System.out.println(HEIGHT);
    }
    public final void printWeight(){
        System.out.println(NR);
    }
    public static void printNr(){
        System.out.println(NR);
    }
}




