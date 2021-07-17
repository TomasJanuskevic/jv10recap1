package inheritance.example1;

public class InheritanceDemo {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum = calculator.add(1, 3);
        System.out.println(sum);

        CalculatorV2 calculatorV2 = new CalculatorV2();
        System.out.println(calculatorV2.add(1, 3));
        System.out.println(calculatorV2.subtract(5, 3));

        CalculatorV3 calculatorV3 = new CalculatorV3();
        calculatorV3.multiply(1, 3); //From child class
        calculatorV3.add(1, 3); //From super/parent class

        CalculatorV4 calculatorV4 = new CalculatorV4();
        calculatorV4.divide(5,3); //From class itself
        calculatorV4.multiply(5,3); //extended From CalculatorV3
        calculatorV4.add(5,3); //extended using multilevel inheritance from Calculator
    }
}

/**
 * Immutible class, we cant make changes here. (Eg. Class is from the third party library)
 */
class Calculator {
    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}

/**
 * Copy pasted behavior + new behavior
 */
class CalculatorV2 {
    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
}

/**
 * Inheritance IS-A relationship
 * Composition (kompozicija) HAS-A relationship
 */
class CalculatorV3 extends Calculator {
    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
}

/**
 * Multilevel inheritance.
 * Java supports MULTILEVEL inheritance but not MULTIPLE inheritance
 */

class CalculatorV4 extends CalculatorV3 {
    public int divide(int firstNumber, int secondNumber){
        return firstNumber / secondNumber;
    }
}
