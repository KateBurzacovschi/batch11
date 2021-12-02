package class19;

public class Emloyee {
    String name;
    int age;
    int baseSalary=300000;
    int baseNoDaysOf=20;

    void printSalary(){
        System.out.println(baseSalary);
    }
    void printNoDaysOf(){
        System.out.println( baseNoDaysOf);
    }
}
class Manager extends Emloyee{
    int bonus=10;
    int travelingAllowance=200;
    void printSalary(){
        super.printSalary();
        System.out.println(bonus+travelingAllowance);
    }
}
