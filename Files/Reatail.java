import java.util.ArrayList;
import java.util.List;

class Product {
    String name;
    double price;
    int quantity;

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void displayProduct() {
        System.out.println(name + " - Price: " + price + ", Quantity: " + quantity);
    }
}

public class RetailStore {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Product01", 10, 50));
        products.add(new Product("Product02", 25, 100));
        products.add(new Product("Product03", 50, 65));

        System.out.println("Available Products: ");
        for (Product product : products) {
            product.displayProduct();
        }
    }
}
