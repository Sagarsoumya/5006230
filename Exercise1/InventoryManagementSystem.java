package week1;
import java.util.*;
public class InventoryManagementSystem {
	private Map<String,Product> inventory;
	public InventoryManagementSystem() {
		this.inventory=new HashMap<>();
	}
	public void addProduct(Product product) {
		inventory.put(product.getProductId(), product);
		System.out.println("Product added: "+product);
	}
	public void updateProduct(String productId, Product newProductDetails) {
		if(inventory.containsKey(productId)) {
			inventory.put(productId, newProductDetails);
			System.out.println("Product Updated: "+newProductDetails);
		}
		else
			System.out.println("Product not found: "+productId);
	}
	public void deleteProduct(String productId) {
		Product removedProduct = inventory.remove(productId);
		 if (removedProduct != null) 
	            System.out.println("Product removed: " + removedProduct);
	     else 
	            System.out.println("Product not found: " + productId);
	        
			
	}
	public void displayInventory() {
		for (Product product: inventory.values()) {
			System.out.println(product);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InventoryManagementSystem ims = new InventoryManagementSystem();

        Product product1 = new Product("P001", "Product 1", 10, 99.99);
        Product product2 = new Product("P002", "Product 2", 20, 199.99);
        Product product3 = new Product("P003", "Product 3", 15, 299.99);

        ims.addProduct(product1);
        ims.addProduct(product2);
        ims.addProduct(product3);

        ims.displayInventory();

        Product updatedProduct2 = new Product("P002", "Updated Product 2", 25, 219.99);
        ims.updateProduct("P002", updatedProduct2);

        ims.displayInventory();

        ims.deleteProduct("P001");
        ims.displayInventory();

	}

}
