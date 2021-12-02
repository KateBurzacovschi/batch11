package class22;

public class CreditCard {
    double balance;
    double interest;

    public CreditCard(double balance) {
        this.balance = balance;
    }
    void calculateInterest(){
        interest=balance*0.15;
        System.out.println(interest);
        System.out.println(balance);
    }
}
class AX extends CreditCard{
    AX(double balance){

        super(balance);
    }

    @Override
    void calculateInterest() {
        interest=balance*0.05;
        System.out.println(interest);
    }
}
class Visa extends CreditCard{
    Visa(double balance){
        super (balance);
    }

}
