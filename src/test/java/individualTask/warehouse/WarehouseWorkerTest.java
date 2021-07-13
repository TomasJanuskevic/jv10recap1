package individualTask.warehouse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WarehouseWorkerTest {

    private WarehouseWorker warehouseWorker;
    private List<Product> products = new ArrayList<>();
    Product product1;
    Product product2;

    @BeforeEach
    void setUp() {
        warehouseWorker = new WarehouseWorker();
        product1 = new Product("Milk", 1.8, 10.0, 20);
        product2 = new Product("Bread", 0.8, 2.0, 29);
        products.add(product1);
        products.add(product2);

    }

    @Test
    void mostExpensive() {
        Product actualProduct = warehouseWorker.mostExpensive(products);
        assertEquals(products.get(0), actualProduct);
    }

    @Test
    void cheapestProduct() {
        Product actualProduct = warehouseWorker.cheapestProduct(products);
        assertEquals(products.get(1), actualProduct);
    }

    @Test
    void heaviestProduct() {
        Product actualProduct = warehouseWorker.cheapestProduct(products);
        assertEquals(products.get(1), actualProduct);
    }

    @Test
    void maxQuantityProduct() {
        Product actualProduct = warehouseWorker.maxQuantityProduct(products);
        assertEquals(products.get(1), actualProduct);
    }

    @Test
    void averagePrice() {
        double actualAveragePrice = warehouseWorker.averagePrice(products);
        assertEquals(6.0, actualAveragePrice);
    }

    @Test
    void deleteProductByName() {
        List<Product> expectedListOfProducts = new ArrayList<>();
        expectedListOfProducts.add(product2);

        List<Product> actualListOfProducts = warehouseWorker.deleteProductByName(products, "Milk");

        assertEquals(expectedListOfProducts, actualListOfProducts);
    }

    @Test
    void updateProductPriceByName() {
        List<Product> actualProductList = warehouseWorker.updateProductPriceByName(products, "Milk", 12.0);

        assertEquals(12.0,actualProductList.get(0).getPrice());
    }
}