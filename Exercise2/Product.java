package Exercise2;

public class Product {
    int ProductId;
    String productName;
    String category;
    public Product(int ProductId,String productName,String category){
        this.ProductId=ProductId;
        this.productName=productName;
        this.category=category;
    }
    public String toString(){
        return "Product ID: "+ProductId+"\nProduct Name: "+productName+"\nCategory: "+category;
    }
}
