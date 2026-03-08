package ObservableDesignPattern.Impl;

import ObservableDesignPattern.Interface.Observable;
import ObservableDesignPattern.Interface.Observer;

public class MobileObserver implements Observer {
    Observable observable;
    String email;
    public MobileObserver(String email, Observable observable) {
        // implementation to initialize the mobile observer
        this.email = email;
        this.observable = observable;
    }
    public void update() {
        // implementation to update the mobile observer
        System.out.println("Mobile Observer: " + email + " has been notified with data: ");
    }
}
