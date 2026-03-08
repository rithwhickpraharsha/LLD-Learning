package ObservableDesignPattern.Interface;

import ObserverDesignPattern.Interface.Observer;

public interface Observable {
    public void addObserver(Observer observer);

    public void removeObserver(Observer observer);
    
    public void notifyObservers();

    public void setData(int count);
}
