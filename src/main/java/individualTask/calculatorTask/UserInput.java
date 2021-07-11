package individualTask.calculatorTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInput {
    public List<Integer> userNumberInput() {
        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite skiacius, norint gauti vidurki spauskite 0");
        Integer number;
        String userInput;

        do {
            userInput = scanner.nextLine();
            ValidationService validationService = new ValidationService();
            number = validationService.validateNumber(userInput);
            if(number != null){
                if (number != 0) {
                    numbers.add(number);
                }
            }

        } while (number==null || number != 0);

        return numbers;
    }
}
