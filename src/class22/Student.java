package class22;

public class Student {
    void read(){
        System.out.println("You have to spend more time to read something new");
    }
    void walk(){
        System.out.println("Walking will help you gain energy ");
    }
    void relax(){
        System.out.println("Focusing is the main thing in learning");
    }
}
class SyntaxStudent extends Student{
    @Override
    void read(){
        System.out.println("You have to spend more time to read something new");
    }
    void teach(){
        System.out.println("You have to spend more time to read something new");
    }
    void sleep(){
        System.out.println("Sleeping more than 8 hours is harmful");
    }
}
class CollegeStudent extends Student{
    @Override
    void read(){
        System.out.println("You have to spend more time to read something new");
    }
    void study(){
        System.out.println("There is never too much study");
    }
}
class SchoolStudent extends Student{
    @Override
    void read(){
        System.out.println("You have to spend more time to read something new");
    }
    void eat(){
        System.out.println("Healthy food is important for brain");
    }
}
