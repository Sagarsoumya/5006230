package WEEK_1.Design_Patterns_And_Principles.Exercise7.ObserverPatternExample;

public class MobileApp implements Observer {
    @Override
    public void update(double price) {
        System.out.println("Mobile App: Stock price updated to $" + price);
    }
}
