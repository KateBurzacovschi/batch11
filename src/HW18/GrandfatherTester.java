package HW18;

public class GrandfatherTester {
    public static void main(String[] args) {
        Grandfather grandfather=new Grandfather();
        grandfather.eyes="blue";
        grandfather.hair="brown";
        grandfather.behavior="calm";
        grandfather.name="Alex";

        F father=new F();
        father.name();
        father.eyes="green";
        father.hair="black";
        father.behavior="nervous";
        father.name="Ivan";

       Child child=new Child();
       child.name();
       child.eyes="blue";
       child.hair="black";
       child.behavior="calm";
       child.name="Max";

        System.out.println("Grandfather has a "+grandfather.eyes+" eyes and "+grandfather.hair+" hair,his name is "+grandfather.name);
        System.out.println("Father has a "+father.eyes+" eyes and "+father.hair+" hair,his name is "+father.name);
        System.out.println("Child has a "+child.eyes+" eyes and "+child.hair+" hair,his name is "+child.name);

    }
}
