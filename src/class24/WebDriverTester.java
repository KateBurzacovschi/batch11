package class24;

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver[] webDrivers={new ChromeDriver(),new FirefoxDriver()};
        for(WebDriver web:webDrivers){
            web.CloseBrowser();
            web.FindElement();
            web.MaximazeWindow();
            web.OpenBrowser();
        }
    }
}
