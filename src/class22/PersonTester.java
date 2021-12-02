package class22;

public class PersonTester {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Asghar");
        teacher.eat();
        Person[] array={new Studen("Kate"),new Employee("Kill"),new Teacher("Kot")};
        for(Person person2:array){
            person2.performDailyTask();
            if (person2 instanceof Teacher){
                ((Teacher)person2).design();
            }
        }

    }
}
