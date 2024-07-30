package WEEK_1.Design_Patterns_And_Principles.Exercise1.SingletonPatternExample;

public class SingletonTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        logger1.log("First log message");
        logger2.log("Second log message");
        if(logger1==logger2)
        System.out.println("Both logger instances are the same");
        else
        System.out.println("Both logger instances are different");
    }
}
