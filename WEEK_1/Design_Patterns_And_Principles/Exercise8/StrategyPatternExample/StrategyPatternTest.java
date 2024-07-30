package WEEK_1.Design_Patterns_And_Principles.Exercise8.StrategyPatternExample;

public class StrategyPatternTest {
    public static void main(String[] args) {
        // Create a payment context with CreditCardPayment strategy
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9876-5432", "John Doe");
        PaymentContext context = new PaymentContext(creditCardPayment);
        context.executePayment(250.0);

        // Change payment strategy to PayPalPayment
        PaymentStrategy payPalPayment = new PayPalPayment("john.doe@example.com");
        context = new PaymentContext(payPalPayment);
        context.executePayment(150.0);
    }
}

