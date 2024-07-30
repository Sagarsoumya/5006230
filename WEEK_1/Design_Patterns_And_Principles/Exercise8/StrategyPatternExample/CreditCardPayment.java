package WEEK_1.Design_Patterns_And_Principles.Exercise8.StrategyPatternExample;

public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String cardHolder;

    public CreditCardPayment(String cardNumber, String cardHolder) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Processing credit card payment of $" + amount +
                " with card number " + cardNumber +
                " for cardholder " + cardHolder);
    }
}
