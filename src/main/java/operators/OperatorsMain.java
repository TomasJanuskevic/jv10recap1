package operators;

public class OperatorsMain {

    public static void main(String[] args) {
        /**
         * 1. Assignment Operators (priskyrimo)
         */
        int x = 5;
        int y = 3;
        x += y; // x = x + y;
        x -= y; // x = x - y;
        x *= y; // x = x * y;
        x /= y; // x = x / y;
        System.out.println(x);
        System.out.println(y);
        /**
         * Relation operators (palyginimo)
         * grazina booleana
         */
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x <= y);
        System.out.println(x >= y);
        /**
         * Logical operators (salygos)
         */
        CarService carService = new CarService();
        Car car = carService.getCar();
        x = 5;
        System.out.println(x == 8 && car.year == 5);
        System.out.println(x == 8 & car.year == 5);
        // && - short circuit (trumpesnio tikrinimo, tikrina tik viena puse jei reikia) logical operator
        // & - long circuit (ilgesnio tikrinimo, tikrina abi puses betkokiu atveju) logical operator
        System.out.println(x == 5 | car.getPrice() == 5);

        /**
         * Conditional operator
         */

        boolean isValid = x > y ? true : false;

    }
}

class Car {
    int price;
    Integer year;

    public int getPrice() {
        return price;
    }
}

class CarService {
    public Car getCar() {
        Car car = new Car();
        car.price = 50;
        car.year = null;
        return car;
    }

}
