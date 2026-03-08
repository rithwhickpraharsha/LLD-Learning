package ObservableDesignPattern.Impl;

import ObservableDesignPattern.Interface.Observable;
import ObservableDesignPattern.Interface.Observer;

public class LaptopObserver implements Observer {

    String email;
    Observable observable;

    public LaptopObserver(String email, Observable observable) {
        this.email = email;
        this.observable = observable;
    }
    
    public void update() {
        System.out.println("Laptop Observer: " + email + " has been notified with data");
    }
}
