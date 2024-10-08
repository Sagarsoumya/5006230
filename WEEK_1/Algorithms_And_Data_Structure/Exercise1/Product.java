package WEEK_1.Algorithms_And_Data_Structure.Exercise1;

//package week1;

public class Product {
	private String productId;
	private String productName;
	private int quantity;
	private double price;
	public Product(String productId, String productName, int quantity, double price) {
	this.productId=productId;
	this.productName=productName;
	this.quantity=quantity;
	this.price=price;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity=quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public String toString() {
		 return "Product{" +
	                "productId='" + productId + '\'' +
	                ", productName='" + productName + '\'' +
	                ", quantity=" + quantity +
	                ", price=" + price +
	                '}';
	}


}
