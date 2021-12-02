package class22;

public class WebDriver {
    void openWebsite(){
        System.out.println("Opening a Website");
    }
    void signup(){
        System.out.println("Signup on the website");
    }
    void login(){
        System.out.println("login to website");
    }
    void enterUserPassword(){
        System.out.println("enter password");
    }
    void clickSubmit(){
        System.out.println("clicking on submit button");
    }
    void closeBrowser(){
        System.out.println("closing te browser");
    }
}
class GoogleChrome extends WebDriver{
    void openWebsite(){
        System.out.println("Opening a Website in a GoogleChrome");
    }
    void signup(){
        System.out.println("Signup on the website in a GoogleChrome");
    }
    void login(){
        System.out.println("login to website in a GoogleChrome");
    }
    void enterUserPassword(){
        System.out.println("enter password in a GoogleChrome");
    }
    void clickSubmit(){
        System.out.println("clicking on submit button in a GoogleChrome");
    }
    void closeBrowser(){
        System.out.println("closing te browser in a GoogleChrome");
    }

}
class Firefox extends WebDriver{
    void openWebsite(){
        System.out.println("Opening a Website in a Firefox");
    }
    void signup(){
        System.out.println("Signup on the website in a Firefox");
    }
    void login(){
        System.out.println("login to website in a Firefox");
    }
    void enterUserPassword(){
        System.out.println("enter password in a Firefox");
    }
    void clickSubmit(){
        System.out.println("clicking on submit button in a Firefox");
    }
    void closeBrowser(){
        System.out.println("closing te browser in a Firefox");
    }

}
    class Safari extends WebDriver{
        void openWebsite(){
        System.out.println("Opening a Website in a Safari");
        }
        void signup(){
        System.out.println("Signup on the website in a Safari");
        }
        void login(){
        System.out.println("login to website in a Safari");
        }
        void enterUserPassword(){
        System.out.println("enter password in a Safari");
        }
        void clickSubmit(){
        System.out.println("clicking on submit button in a Safari");
        }
        void closeBrowser(){
        System.out.println("closing te browser in a Safari");
        }

        }