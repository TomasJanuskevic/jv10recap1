package exercises.exercise4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    void add() {
        //when
        int actualResult = calculatorService.add(5, 7, 5, 1);
        //then
        assertEquals(18, actualResult);
    }

    @Test
    void substract() {

        int actualResult = calculatorService.subtract(10, 2);

        assertEquals(8, actualResult);
    }

    @Test
    void divide() {

        double actualResult = calculatorService.divide(5.0, 2.0);
        assertEquals(2.5, actualResult);
    }

    @Test
    void cubePerimeter() {

        double actualResult = calculatorService.cubePerimeter(5, 7, 4);
        assertEquals(64, actualResult);
    }
}