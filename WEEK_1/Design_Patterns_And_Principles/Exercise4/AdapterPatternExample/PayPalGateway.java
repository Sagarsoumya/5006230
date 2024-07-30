package WEEK_1.Design_Patterns_And_Principles.Exercise4.AdapterPatternExample;

public class PayPalGateway {
    public void makePayment(double amount) {
        System.out.println("PayPal payment of $" + amount + " made through PayPal.");
    }
}
