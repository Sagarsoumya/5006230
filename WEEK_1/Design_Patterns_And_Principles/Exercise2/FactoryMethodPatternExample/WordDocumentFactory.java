package WEEK_1.Design_Patterns_And_Principles.Exercise2.FactoryMethodPatternExample;

public class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
        }
    
}
