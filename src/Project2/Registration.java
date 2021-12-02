package Project2;

public class Registration {
    private String email="kaka@yahoo";
    private String userName="kat";
    private String password="kater";
    void EnterEmail() {
        if (email.contains("yahoo")) {
            System.out.println("Your email is accepted");
        }else{
            System.out.println("your email is not accepted");
        }}
        void EnterUsername(){
            if(userName.isEmpty()){
                System.out.println("Your user name can't be empty");
        }
            if(userName.length()>6){
                System.out.println("Your username match");
            }else{
                System.out.println("Choose shorter username");
            }}
    void EnterPassword() {
        if (password.contains(userName)) {
            System.out.println("Password can't contain username");
        } else {
            System.out.println("your password looks good");
        }}
    public static void main(String[] args) {
        Registration registration=new Registration();
        registration.EnterEmail();
        registration.EnterUsername();
        registration.EnterPassword();
    }
}
