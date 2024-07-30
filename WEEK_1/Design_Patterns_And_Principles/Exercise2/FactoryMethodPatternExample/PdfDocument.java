package WEEK_1.Design_Patterns_And_Principles.Exercise2.FactoryMethodPatternExample;

public class PdfDocument implements Document {
    @Override
    public void open(){
        System.out.println("PdfDocument opened");
    }
    @Override
    public void close(){
        System.out.println("PdfDocument closed");
    }
    
}
