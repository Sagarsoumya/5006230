package WEEK_1.Design_Patterns_And_Principles.Exercise4.AdapterPatternExample;

public class PayPalAdapter implements PaymentProcessor{
    private PayPalGateway payPalGateway;
    public PayPalAdapter(PayPalGateway payPalGateway) {
        this.payPalGateway = payPalGateway;
    }
    @Override
    public void processPayment(double amount){
        payPalGateway.makePayment(amount);
    }
}
