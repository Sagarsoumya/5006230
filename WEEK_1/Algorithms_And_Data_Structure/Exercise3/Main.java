package WEEK_1.Algorithms_And_Data_Structure.Exercise3;

public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(1, "Alice", 250.50),
            new Order(2, "Bob", 150.75),
            new Order(3, "Charlie", 300.00),
            new Order(4, "Dave", 200.20)
        };

        System.out.println("Original Orders:");
        for (Order order : orders) {
            System.out.println(order);
        }

        // Bubble Sort
        SortingAlgorithms.bubbleSort(orders);
        System.out.println("\nOrders after Bubble Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }
        Order[] shuffledOrders = {
            new Order(1, "Alice", 250.50),
            new Order(2, "Bob", 150.75),
            new Order(3, "Charlie", 300.00),
            new Order(4, "Dave", 200.20)
        };

        // Quick Sort
        SortingAlgorithms.quicksort(shuffledOrders, 0, shuffledOrders.length - 1);
        System.out.println("\nOrders after Quick Sort:");
        for (Order order : shuffledOrders) {
            System.out.println(order);
        }
    }
}
