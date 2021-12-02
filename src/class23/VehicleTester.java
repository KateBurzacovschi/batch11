package class23;

public class VehicleTester {
    public static void main(String[] args) {
        BMW bmw=new BMW("123","Sedan","BMW","X5");
        bmw.printVehicleCount();
        bmw.speed();
        bmw.start();
        bmw.drive();
        bmw.stop();
    }
}
