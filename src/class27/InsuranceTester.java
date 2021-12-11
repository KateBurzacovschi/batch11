package class27;

import java.util.ArrayList;

public class InsuranceTester {
    public static void main(String[] args) {
        ArrayList<Insurance> insuranceArrayList=new ArrayList<>();
        Car car=new Car("Geico","Tesla");
        Pet pet=new Pet("Geico","Dog");
        Health health=new Health("Geico");
        insuranceArrayList.add(car);
        insuranceArrayList.add(pet);
        insuranceArrayList.add(health);
        for(Insurance in:insuranceArrayList){
            in.getQuote();
            in.cancelInsurance();
        }


    }
}
