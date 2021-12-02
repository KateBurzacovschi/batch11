package class24;

public interface Person {
    void eat();
    void sleep();
}
interface Employee {
    void work();
}
interface SyntaxEmployee extends Employee,Person{
    void teach();
}
class SDETInstructor implements SyntaxEmployee{
    @Override
    public void eat() {
        System.out.println("Syntax Employees eating");
    }
    @Override
    public void sleep() {
        System.out.println("Syntax employees sleeping");
    }
    @Override
    public void work() {
        System.out.println("Creating new repls");
    }
    @Override
    public void teach() {
        System.out.println("Teach IT");

    }
}
