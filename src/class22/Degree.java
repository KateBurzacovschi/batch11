package class22;

public class Degree {
    void getPrerequisite(){

        System.out.println("To get a degree you need a high school diploma");
    }
}
class Bachelors extends Degree{
}
class Masters extends Degree{
    void getPrerequisite(){
        System.out.println("To get a Masters degree you need a bachelors degree");
    }
}
class Tester{
    public static void main(String[] args) {

        Degree degree = new Degree();
        degree.getPrerequisite();
        Masters masters = new Masters();
        masters.getPrerequisite();
        Bachelors bachelors = new Bachelors();
        bachelors.getPrerequisite();
    }
}