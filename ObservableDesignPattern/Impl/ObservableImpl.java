package ObservableDesignPattern.Impl;

import java.util.List;
import ObservableDesignPattern.Interface.Observable;
import java.util.ArrayList;
import ObservableDesignPattern.Interface.Observer;

public class ObservableImpl implements Observable {
    int data;
    List<Observer> observers;
    public ObservableImpl() {
        this.data = 0;
        this.observers = new ArrayList<>();
    }
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        // implementation to remove observer
        observers.remove(observer);
    }

    public void notifyObservers() {
        // implementation to notify all observers
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void setData(int count) {
        // implementation to set data and notify observers
        this.data = count;
        if (count > 0) {
            notifyObservers();
        }
    
    }

}
