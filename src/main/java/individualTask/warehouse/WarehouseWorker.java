package individualTask.warehouse;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class WarehouseWorker {
    private List<Product> products = new ArrayList<>();

    public WarehouseWorker() {
        setProducts();
    }

    private void setProducts(){
            products.add(new Product("Milk", 1.8, 2.99, 20));
            products.add(new Product("Bread", 0.8, 0.99, 29));
            products.add(new Product("Soap", 0.1, 2.99, 200));
            products.add(new Product("Shampoo", 1.8, 4.99, 20));
            products.add(new Product("Beer", 1.1, 1.99, 140));
            products.add(new Product("Apple", 0.05, 0.19, 4110));
            products.add(new Product("Salad", 0.07, 0.99, 280));
            products.add(new Product("Egg", 0.08, 0.49, 902));
            products.add(new Product("Water", 1, 0.99, 278));
            products.add(new Product("Juice", 1, 1.99, 264));

    }

    public Product mostExpensive(){
        return products
                .stream()
                .max(Comparator.comparing(Product::getPrice))
                .orElseThrow(NoSuchElementException::new);
    }
}
