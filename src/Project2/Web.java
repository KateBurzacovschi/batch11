package Project2;

public interface Web {
    void open();
    void close();
    String  getTitle();
}
interface TakesScreenshoot{
    void getScreenshoot();
}
interface RemoteWebInterface extends Web,TakesScreenshoot{
    void navigate();
}
class Chromedriv implements RemoteWebInterface{
    @Override
    public void open() {
        System.out.println("open chrome");
    }
    @Override
    public void close() {
        System.out.println("close chrome");
    }
    @Override
    public String getTitle() {
       return null;
    }
    @Override
    public void getScreenshoot() {
        System.out.println("take screenshot");
    }
    @Override
    public void navigate() {
        System.out.println("navigate on chrome");

    }
}
class FirefoxDriv implements RemoteWebInterface{
    @Override
    public void open() {
        System.out.println("open firefox");
    }
    @Override
    public void close() {
        System.out.println("close firefox");
    }
    @Override
    public String getTitle() {
      return null;
    }
    @Override
    public void getScreenshoot() {
        System.out.println("take screenshot");
    }
    @Override
    public void navigate() {
        System.out.println("navigate on firefox");

    }
}
class Safaridriver implements RemoteWebInterface{
    @Override
    public void open() {
        System.out.println("open safari");
    }
    @Override
    public void close() {
        System.out.println("close safari");
    }
    @Override
    public String getTitle() {
        return null;
    }
    @Override
    public void getScreenshoot() {
        System.out.println("take screenshot");
    }
    @Override
    public void navigate() {
        System.out.println("navigate on safari");
    }
}
class Testi {
    public static void main(String[] args) {
Chromedriv chromedriv=new Chromedriv();
chromedriv.open();
Safaridriver safaridriver=new Safaridriver();
safaridriver.getScreenshoot();
FirefoxDriv firefoxDriv=new FirefoxDriv();
firefoxDriv.navigate();
    }
}
