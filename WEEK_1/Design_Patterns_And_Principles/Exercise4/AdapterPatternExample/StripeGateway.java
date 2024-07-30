package WEEK_1.Design_Patterns_And_Principles.Exercise4.AdapterPatternExample;

public class StripeGateway {
    public void sendPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " through Stripe.");
    }
}
