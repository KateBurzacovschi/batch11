package Project2;

import java.util.Locale;

public class Registration {
    private String email;
    private String userName;
    private String password;

       public String getEmail(){
       return email;
}
public void setEmail (String email){
    if(email.toLowerCase().contains("yahoo")){
        this.email=email;
    }else{
        System.out.println("not valid email");
    }
}
public String getUserName(){
    return  userName;
}
public void setUserName(String userName){
    if (userName.isEmpty()||userName.length()<=6){
        System.out.println("user can not empty");
    }else{
        this.userName=userName;
    }
}
public String getPassword(){
    return password;
}

public void setPassword(String password){
    if (password.length()<6){
        System.out.println("password can not be empty");
    }else{
        if (password.contains(userName)){
            System.out.println("password can't contain username");
        }else{
            this.password=password;
        }
    }
}

}

