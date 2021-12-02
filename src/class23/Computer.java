package class23;

public class Computer {
    String model;
    Computer(String model){
        this.model=model;
    }
    void operatingSystem(){
        System.out.println(model+" has operating system");
    }
    void playVideo(){
        System.out.println("can play videos");
    }
}
class Apple extends Computer{
    Apple (String model){
        super(model);
    }

    @Override
    void operatingSystem() {
        System.out.println(model+" has MacOs");
    }
}
class Lenovo extends Computer{
Lenovo(String model){
    super(model);
}

    @Override
    void operatingSystem() {
        System.out.println(model+" has windows");
    }
}
class HP extends Computer{
    HP(String model){
        super(model);
    }

    @Override
    void operatingSystem() {
        System.out.println(model+" has windows");
    }
}