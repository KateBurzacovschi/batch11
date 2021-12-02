package class22;

public class CarTester {
    public static void main(String[] args) {
        Car car=new BMW();
        car.start();



        Car[] cars={new BMW(),new Tesla(),new Toyota()};
        for (Car ca:cars){
            car.start();
            car.stop();
            car.park();
        }
    }
}
