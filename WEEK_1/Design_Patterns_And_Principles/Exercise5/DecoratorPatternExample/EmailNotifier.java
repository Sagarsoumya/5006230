package WEEK_1.Design_Patterns_And_Principles.Exercise5.DecoratorPatternExample;

public class EmailNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending email : " + message);
    }
}
