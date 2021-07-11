package individualTask.warehouse;

public class Main {
    public static void main(String[] args) {
        WarehouseWorker warehouseWorker = new WarehouseWorker();
        System.out.println("Product with max price: " + warehouseWorker.mostExpensive());
    }
}
