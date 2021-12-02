package Project2;

public class Carr {
int carPrice;
    String color;
     void calculateSalePrice(){
         System.out.println("The price after sale is "+10*carPrice+" and color is "+color);
     }
}
class Truck extends Carr{

    void calculateSalePrice(int weight,int carPrice, String color) {
        if(weight>2000){
            System.out.println("Price for this car will be with 10 % discount");
        }else{
            System.out.println("Price for this car will be with 20 % discount");
        }
    }
}
class Sedan extends Carr{

    void calculateSalePrice(int length,int carPrice, String color) {
        if(length>20){
            System.out.println("Price for car should include 5% discount");
        }else{
            System.out.println("Price for car should include 10% discount");
        }
    }
}
class Testik {
    public static void main(String[] args) {
        Truck truck = new Truck();
       truck.calculateSalePrice(300,3999,"white");
       Sedan sedan=new Sedan();
       sedan.calculateSalePrice(8999,90000,"black");

    }
}
