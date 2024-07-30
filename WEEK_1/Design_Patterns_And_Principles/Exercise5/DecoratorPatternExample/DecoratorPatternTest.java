package WEEK_1.Design_Patterns_And_Principles.Exercise5.DecoratorPatternExample;

public class DecoratorPatternTest {
    //public static void main(String[] args) {
        public static void main(String[] args) {
            // Create an email notifier
            Notifier emailNotifier = new EmailNotifier();
    
            // Decorate the email notifier with SMS notifier
            Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);
    
            // Decorate the SMS notifier with Slack notifier
            Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);
    
            // Send a notification through all the notifiers
            slackNotifier.send("This is a test notification.");
    }
}
