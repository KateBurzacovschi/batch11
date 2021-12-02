package Project2;

public abstract class Marks {
    abstract void getPercentage();
}
class StudentA extends Marks{
    int n1;int n2;int n3;
    StudentA(int n1,int n2, int n3){
        this.n1=n1;
        this.n2=n2;
        this.n3=n3;
    }
    @Override
    void getPercentage() {
        System.out.println("The average of marks for StudentA is :"+(n1+n2+n3)/3);
    }
}
class StudentB extends Marks{
    int m1;int m2;int m3;int m4;
    StudentB(int m1,int m2,int m3,int m4){
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
        this.m4=m4;
    }
    @Override
    void getPercentage() {
        System.out.println("The average of marks for StudentB is :"+(m1+m2+m3+m4)/4);
    }
}
class Tester{
    public static void main(String[] args) {
        StudentA a=new StudentA(60,40,30);
        a.getPercentage();
        StudentB b=new StudentB(10,20,30,40);
        b.getPercentage();
    }
}
