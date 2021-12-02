package class21;

public class Task4 {
    private void method(){
        System.out.println("void method");
    }
    private int method(int num){
        System.out.println(" int method");
        return num;
    }
    private int method(String str){
        System.out.println("str method");
        return 5;
    }

    public static void main(String[] args) {
        Task4 task=new Task4();
        task.method();
        task.method(4);
        task.method("kate");

        }
    }


