package WEEK_1.Design_Patterns_And_Principles.Exercise7.ObserverPatternExample;

import java.util.List;

public interface Stock {
     void registerObserver(Observer observer);
    void deregisterObserver(Observer observer);
    void notifyObservers();
}
