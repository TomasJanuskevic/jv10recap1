package individualTask.calculatorTask;

import java.util.List;

public class AverageCalculator {
    public double averageCalculator(List<Integer> numbers){
        return numbers.stream().mapToInt(i->i).average().getAsDouble();
    }
}
