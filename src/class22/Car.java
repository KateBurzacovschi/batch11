package class22;

public class Car {
    void start(){
        System.out.println("use keys to start me");
    }
    void stop(){
        System.out.println("use brake to stop me");
    }
    void park(){
        System.out.println("park me manually");
    }
}
class BMW extends Car{
    @Override
    void start(){
        System.out.println("use the button to start me");
    }
}
class Tesla extends Car{
    @Override
    void start() {
        System.out.println("use mobile app to start me");
    }

    @Override
    void park() {
        System.out.println("use parking sensors to park me");
    }
}
class Toyota extends Car{

}