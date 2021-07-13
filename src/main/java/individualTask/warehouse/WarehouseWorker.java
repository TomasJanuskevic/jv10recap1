package individualTask.warehouse;

import java.util.*;

public class WarehouseWorker {
    private List<Product> products = new ArrayList<>();

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Product mostExpensive(List<Product> products) {
        return products
                .stream()
                .max(Comparator.comparing(Product::getPrice))
                .orElseThrow(NoSuchElementException::new);
    }

    public Product cheapestProduct(List<Product> products) {
        return products
                .stream()
                .min(Comparator.comparing(Product::getPrice))
                .orElseThrow(NoSuchElementException::new);
    }

    public Product heaviestProduct(List<Product> products) {
        return products
                .stream()
                .max(Comparator.comparing(Product::getWeight))
                .orElseThrow(NoSuchElementException::new);
    }

    public Product maxQuantityProduct(List<Product> products) {
        return products
                .stream()
                .max(Comparator.comparing(Product::getQuantity))
                .orElseThrow(NoSuchElementException::new);
    }

    public double averagePrice(List<Product> products) {
        return products.stream().mapToDouble(product -> product.getPrice()).average().getAsDouble();
    }

    public void viewProducts() {
        products.stream().forEach(System.out::println);
    }

    public List<Product> deleteProductByName(List<Product> products, String name) {
        products.remove(products.stream().filter(product -> product.getName().equals(name)).findFirst().get());
        return products;
    }

    public List<Product> updateProductPriceByName(List<Product> products, String name, double newPrice) {
        for (Product product : products) {
            if(name.equals(product.getName())){
                product.setPrice(newPrice);
            }
        }
        return products;
    }

}
