package ReviewClass;

public abstract class Human {
    String name,lastName;
    static boolean brain;

    Human(String name,String lastName){
        this.name=name;
        this.lastName=lastName;

    }
    void prinInfo(){
        System.out.println(name+""+lastName);
    }
   static void eat(){
        System.out.println("humans eat");
    }
   static void sleep(){
        System.out.println("humans sleep");
    }
   abstract void speak();


}
