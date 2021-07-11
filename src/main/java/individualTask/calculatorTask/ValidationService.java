package individualTask.calculatorTask;

public class ValidationService {

    public Integer validateNumber(String input){
        if(input.matches("[0-9]")){
            return Integer.parseInt(input);
        } else {
            System.out.println("Ivedete ne skaiciu, veskite is naujo");
            return null;
        }
    }

}
