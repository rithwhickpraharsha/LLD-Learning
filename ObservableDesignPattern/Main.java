package ObservableDesignPattern;

import ObservableDesignPattern.Impl.LaptopObserver;
import ObservableDesignPattern.Impl.MobileObserver;
import ObservableDesignPattern.Impl.ObservableImpl;
import ObservableDesignPattern.Interface.Observable;
public class Main {

    public static void main(String[] args) {
        Observable observable = new ObservableImpl();
        LaptopObserver laptopObserver1 = new LaptopObserver("Laptop@rmail.com", observable);
        MobileObserver mobileObserver1 = new MobileObserver("mobile@gmail.com", observable);

        observable.addObserver(laptopObserver1);
        observable.addObserver(mobileObserver1);
        observable.setData(10);
    }
    
}
