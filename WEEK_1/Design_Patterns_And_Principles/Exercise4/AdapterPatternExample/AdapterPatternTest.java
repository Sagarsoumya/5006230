package WEEK_1.Design_Patterns_And_Principles.Exercise4.AdapterPatternExample;

public class AdapterPatternTest {
    public static void main(String[] args) {
        PayPalGateway payPalGateway = new PayPalGateway();
        StripeGateway stripeGateway = new StripeGateway();

        // Create adapters for the payment gateways
        PaymentProcessor payPalProcessor = new PayPalAdapter(payPalGateway);
        PaymentProcessor stripeProcessor = new StripeAdapter(stripeGateway);

        // Process payments using the adapters
        payPalProcessor.processPayment(100.0);
        stripeProcessor.processPayment(200.0);
    }
}
