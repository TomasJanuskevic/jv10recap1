package exercises.exercise4;

import java.util.Arrays;

public class CalculatorService {

    public int add(int... numbers) {
        return Arrays.stream(numbers).sum();
    }

    public int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public double divide(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

    public int cubePerimeter(int plotis, int aukstis, int ilgis) {
        return plotis * 4 + aukstis * 4 + ilgis * 4;
    }
}
