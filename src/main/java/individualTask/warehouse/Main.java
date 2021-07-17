package individualTask.warehouse;

import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.List;



public class Main {
    public static void main(String[] args) throws IOException, ParseException {

        WarehouseWorker warehouseWorker = new WarehouseWorker();
        List <Product> products =JsonReader.getListOfObjects("src/main/resources/products.json", Product.class);
        warehouseWorker.setProducts(products);

        System.out.println("Product with max price: " + warehouseWorker.mostExpensive(warehouseWorker.getProducts()));
        System.out.println("Product with min price: " + warehouseWorker.cheapestProduct(warehouseWorker.getProducts()));
        System.out.println("Product with max weight: " + warehouseWorker.heaviestProduct(warehouseWorker.getProducts()));
        System.out.println("Product with max quantity: " + warehouseWorker.maxQuantityProduct(warehouseWorker.getProducts()));
        System.out.println("Average products price: " + warehouseWorker.averagePrice(warehouseWorker.getProducts()));
        System.out.println("----------------------");
        System.out.println("Display all products");
        warehouseWorker.viewProducts();
        System.out.println("----------------------");
        System.out.println(warehouseWorker.deleteProductByName(warehouseWorker.getProducts(), "Milk"));
        System.out.println("----------------------");
        System.out.println(warehouseWorker.updateProductPriceByName(warehouseWorker.getProducts(), "Bread", 10.0));



    }
}
