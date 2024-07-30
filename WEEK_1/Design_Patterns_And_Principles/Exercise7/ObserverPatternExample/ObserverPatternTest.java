package WEEK_1.Design_Patterns_And_Principles.Exercise7.ObserverPatternExample;

public class ObserverPatternTest {
    public static void main(String[] args) {
        // Create a stock market
        StockMarket stockMarket = new StockMarket();

        // Create observers
        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        // Register observers with the stock market
        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        // Change stock price and notify observers
        stockMarket.setPrice(150.0);

        // Deregister an observer and update stock price
        stockMarket.deregisterObserver(mobileApp);
        stockMarket.setPrice(200.0);
    }
}
