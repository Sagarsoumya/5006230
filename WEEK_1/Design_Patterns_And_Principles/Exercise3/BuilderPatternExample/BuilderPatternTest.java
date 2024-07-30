package WEEK_1.Design_Patterns_And_Principles.Exercise3.BuilderPatternExample;

public class BuilderPatternTest {
    public static void main(String[] args) {
        Computer basicComputer = new Computer.Builder()
            .setCPU("Intel i3")
            .setRAM("8GB")
            .setStorage("256GB SSD")
            .build();

        // Create a gaming computer using the Builder pattern
        Computer gamingComputer = new Computer.Builder()
            .setCPU("Intel i9")
            .setRAM("32GB")
            .setStorage("1TB SSD")
            .build();

        // Display the details of the computers
        System.out.println("Basic Computer: " + basicComputer);
        System.out.println("Gaming Computer: " + gamingComputer);
    }
}
