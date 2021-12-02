package class23;

import sun.awt.image.PNGImageDecoder;

public class AbstractionPnoneTester {
    public static void main(String[] args) {
        Iphone iphone=new Iphone();
        iphone.displayPictures();
        iphone.unlockPhone();
        iphone.makePhoneCalls();
        iphone.sendText();

        Samsung samsung=new Samsung();
        samsung.displayPictures();
        samsung.makePhoneCalls();


        AbstractionPhone[]abstractionPhones={new Iphone(),new Samsung()};
        for (AbstractionPhone ph:abstractionPhones){
            ph.displayPictures();
            ph.makePhoneCalls();
            ph.sendText();
        }
    }
}
