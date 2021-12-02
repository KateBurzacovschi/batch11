package class23;

public abstract class Vehicle {
   //abstract String vin_number;abstract not allowed with fields

    String vinNumber;
    static int totalVehicles;
   //abstract  Vehicle(){}abstract not allowed with constructors

    Vehicle(String vinNumber){
        totalVehicles++;
        this.vinNumber=vinNumber;
        System.out.println("Grandpa constructor is called");
    }
    public void printVehicleCount(){
        System.out.println(totalVehicles+" vehicle creating");
    }
    public void drive(){
        System.out.println(" Vehicle is driving");
    }
    public void stop(){
        System.out.println("vehicle stopping");
    }
    public abstract void start();

}
    abstract class  Car extends Vehicle{
    String CarType;
    Car(String CarType,String vinNumber){
        super(vinNumber);
        this.CarType=CarType;
        System.out.println("parent constructor is called");
    }
   public void drive(){
       System.out.println("car is driving");
   }
   public abstract void speed();
}
class BMW extends Car{
    String make;
    String model;
    BMW (String vinNumber,String carType,String make,String model){
        super(carType,vinNumber);
    }
    @Override
    public void speed() {
        System.out.println("BMW can run 300 km/h");
    }

    @Override
    public void start() {
        System.out.println("BMW can start using remote");
    }
    void displayInfo(){
        System.out.println("we build "+make+" model "+model+" "+CarType+" "+vinNumber);
    }
}
