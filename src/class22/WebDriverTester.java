package class22;

public class WebDriverTester {
    public static void main(String[] args) {
        GoogleChrome googleChrome = new GoogleChrome();
        googleChrome.openWebsite();
        googleChrome.signup();
        googleChrome.login();
        googleChrome.enterUserPassword();
        googleChrome.clickSubmit();
        googleChrome.closeBrowser();

        WebDriver webDriver = new Safari();
        webDriver.openWebsite();
        webDriver.signup();
        webDriver.login();
        webDriver.enterUserPassword();
        webDriver.clickSubmit();
        webDriver.closeBrowser();

        WebDriver[] webDrivers = {new GoogleChrome(), new Firefox(), new Safari()};
        for (WebDriver webDriver1 : webDrivers) {
            webDriver1.clickSubmit();

        }
    }
}