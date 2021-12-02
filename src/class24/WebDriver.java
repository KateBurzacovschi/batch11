package class24;

public interface WebDriver {
    void OpenBrowser();
    void CloseBrowser();
    void MaximazeWindow();
    void FindElement();
}
class ChromeDriver implements WebDriver{
    @Override
    public void CloseBrowser() {
        System.out.println("Closing page");
    }
    @Override
    public void OpenBrowser() {
        System.out.println("Open home page");
    }
    @Override
    public void MaximazeWindow() {
        System.out.println("maximaze window");
    }
    @Override
    public void FindElement() {
        System.out.println("find element");
    }
}
class FirefoxDriver implements WebDriver{
    @Override
    public void OpenBrowser() {
    }
    @Override
    public void CloseBrowser() {
    }
    @Override
    public void MaximazeWindow() {
    }
    @Override
    public void FindElement() {
    }
}
