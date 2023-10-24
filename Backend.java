
public class Backend {
import java.util.ArrayList;
import java.util.List;

public class Product {
    private String type;
    private String name;
    private double price;
    private int quantity; 

    public Product(String type, String name, double price, int quantity) {
        this.type = type;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and setters for Product class
}
public class Stock {
    private List<Product> products;

    public Stock() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(int productId) {
        products.removeIf(product -> product.getType() == productType);
    }

    // methods for managing the stock and the products+ stock class
}

public class Statistics {
    public double calculateTotalValue(Stock stock) {
        double totalValue = 0;
        for (Product product : stock.getProducts()) {
            totalValue += product.getPrice() * product.getQuantity();
        }
        return totalValue;
    }

    public int getAvailableProducts(Stock stock) {
        int count = 0;
        for (Product product : stock.getProducts()) {
            count += product.getQuantity();
        }
        return count;
    }

    // Stats method and Stats Class
} 
public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock();
        Product product1 = new Product(1, "Product A", 10.0, 100);
        Product product2 = new Product(2, "Product B", 15.0, 50);

        stock.addProduct(product1);
        stock.addProduct(product2);

        Statistics statistics = new Statistics();

        double totalValue = statistics.calculateTotalValue(stock);
        int availableProducts = statistics.getAvailableProducts(stock);

        System.out.println("Total Stock Value: $" + totalValue);
        System.out.println("Available Products: " + availableProducts);
    }
} 
// main class to run the previously made methods
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriteExample {
    public static void main(String[] args) {
        // File path for reading and writing
        String filePath = "example.txt";

        // Writing to a text file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("Hello, this is a test line.");
            writer.newLine(); // Add a newline
            writer.write("This is another line.");
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }

        // Reading from the text file
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath)) ) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}

} 


