package WEEK_1.Design_Patterns_And_Principles.Exercise6.ProxyPatternExample;

public class ProxyPatternTest {
    public static void main(String[] args) {
        // Create a proxy image object
        Image image1 = new ProxyImage("image1.jpg");

        // Display the image (will load from the server)
        image1.display();

        // Display the image again (will use cached version)
        image1.display();

        // Create another proxy image object
        Image image2 = new ProxyImage("image2.jpg");

        // Display the second image (will load from the server)
        image2.display();
    }
}
