package class23;

public abstract class AbstractionPhone {
    void makePhoneCalls() {
        System.out.println("Making a call");
    }
    void sendText(){
        System.out.println("sending text");
    }
    abstract void displayPictures();
    abstract void unlockPhone();
}
class Iphone extends AbstractionPhone{
    @Override
    void displayPictures() {
        System.out.println("Iphone uses photos to display the pictures");
    }
    @Override
    void unlockPhone() {
        System.out.println("uses FaceId to unlock the phone");
    }
}
class Samsung extends AbstractionPhone{
    @Override
    void displayPictures() {
        System.out.println("use fingerprint sensor to unlock phone");
    }
    @Override
    void unlockPhone() {
        System.out.println("use gallery app to view pictures");
    }
}