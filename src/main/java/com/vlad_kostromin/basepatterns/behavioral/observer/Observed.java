package main.java.com.vlad_kostromin.basepatterns.behavioral.observer;

public interface Observed {
     void registerObserver(Observer observer);
     void removeObserver(Observer observer);
     void notifyObservers();
}
