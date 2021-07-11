package individualTask.calculatorTask;

public class Main {

    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        AverageCalculator averageCalculator = new AverageCalculator();

        System.out.println(averageCalculator.averageCalculator(userInput.userNumberInput()));

    }
}
