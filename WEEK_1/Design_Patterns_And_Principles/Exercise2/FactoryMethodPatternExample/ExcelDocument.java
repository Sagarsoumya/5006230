package WEEK_1.Design_Patterns_And_Principles.Exercise2.FactoryMethodPatternExample;

public class ExcelDocument implements Document {
    @Override
    public void open(){
        System.out.println("ExcelDocument opened");
    }
    @Override
    public void close(){
        System.out.println("ExcelDocument closed");
    }
}
