package class22;

public class Person {
    String name;
    Person(String name){
        this.name=name;

    }
    void eat(){
        System.out.println("person eating");
    }
    void performDailyTask(){
        System.out.println("eat sleep repeat");
    }
}
class Employee extends Person{
    Employee(String name){
        super(name);
    }
    void performDailyTask(){
        System.out.println("working all day");
    }
}
class Studen extends Person{
    Studen(String name){
        super(name);
    }
    void performDailyTask(){
        System.out.println("attending the classes at day");
    }
}
class Teacher extends Person{
    Teacher(String name){
        super(name);
        System.out.println("giving homeworks ");
    }
    void design(){
        System.out.println("create repls");
    }
}
