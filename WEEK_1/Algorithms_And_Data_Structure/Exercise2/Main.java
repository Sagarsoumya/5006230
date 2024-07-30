package WEEK_1.Algorithms_And_Data_Structure.Exercise2;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Product[] products ={
            new Product(101,"Laptop", "Electronics"),
            new Product(202, "Smartphone", "Electronics"),
            new Product(303, "Tablet", "Electronics"),
            new Product(404, "Smartwatch", "Electronics")

        };
        Product result = SearchAlgorithms.linerSearch(products, 202);
        if(result!=null){
            System.out.println(result);
        }
        else
        System.out.println("Product not found");

        Arrays.sort(products,Comparator.comparingInt(p -> p.ProductId));
        Product result2 = SearchAlgorithms.binarySearch(products, 202);
        if(result2!=null){
            System.out.println(result);
        }
        else
        System.out.println("Product not found");
}
}