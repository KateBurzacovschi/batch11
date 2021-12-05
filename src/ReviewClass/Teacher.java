package ReviewClass;

public abstract class Teacher extends Human{

    protected double salary;
    public Teacher(String name,String lastName,double salary){
     super(name,lastName);
       this.salary=salary;
    }
    public void teach(){
        System.out.println("teacher tech");
    }
    public void getPaid(){
        System.out.println("gets paid"+salary);
    }
    public abstract void takeExam();
}
class Math extends Teacher{
    String subject;
    public Math(String name,String lastName,double salary,String subject){
        super ( name, lastName, salary);
        this.subject=subject;
    }
    public void speak(){
        System.out.println(name+""+lastName+"spaeks math language");
    }
    public void takeExam(){
        System.out.println(name+""+lastName+"takes examon "+subject);
    }
}