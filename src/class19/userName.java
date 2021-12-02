package class19;

public class userName {
    String name;
    int mobileNumber;

     }
class userInfo extends userName{
    String adress;
    userInfo(String name, int mobileNumber, String adress){

        this.name=name;
        this.mobileNumber=mobileNumber;
        this.adress = adress;
    }

    void info(){
        System.out.println("First name is "+name+" his phone number is: "+mobileNumber+" and his adress is-"+adress);
    }
    public static void main(String[] args) {
        userInfo user=new userInfo("Alex",324114122," Italia");
user.info();

}



    }