package individualTask.calculatorTask;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AverageCalculatorTest {

    @Test
    void averageCalculator() {
        List <Integer> numbers = Arrays.asList(10, 6, 2);
        AverageCalculator averageCalculator = new AverageCalculator();

        double actualAverage = averageCalculator.averageCalculator(numbers);

        assertEquals(6.0, actualAverage);
    }
}