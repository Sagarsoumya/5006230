package WEEK_1.Design_Patterns_And_Principles.Exercise2.FactoryMethodPatternExample;

public class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
    
}
