package abstraction.example1;

/**
 * 1. Abstract class can not be instantiated. Can not have an instance of it's own.
 * 2. To use abstract class it has to be extended.
 * 3. Abstract class might include abstract methods (without implementation)
 * 4. Fields, non abstract methods (regular), sytatic methods works in a same way as in a regular class.
 * <p>
 * Abstract class vs Interface
 * <p>
 * Abstract class is defining characteristics of an object type. Specifies WHAT AN OBJECT IS.
 * Interface is defining capabilities that we PROMISE to provide. Specifies WHAT OBJECT CAN DO.
 * <p>
 * Abstract class can have shared state or functionality.
 * Interfaces is only a promise to provide the functionality.
 */

public class AbstractionDemo {
    public static void main(String[] args) {

        Swedbank swedbank = new Swedbank();
        swedbank.depositCash();
        swedbank.cashOut();
        swedbank.calculateSpecificBankTax();
        swedbank.executeSecurityChecks();
        swedbank.processCryptoTransactions();

    }
}


abstract class Bank {
    public double euriborRate = 0.2; //Galetu buti ir final konstanta, nes rate visiem visada vienodas
    //public static EURI_BOR_RATE = 0.2 NOTE: Taip gali buti tik interfasuose

    public void depositCash() {
        System.out.println("Common cash deposit method, applicable for all the banks.");
    }

    public void cashOut() {
        System.out.println("Common cash out method for all the banks");
    }

    abstract void calculateSpecificBankTax();

}

class Swedbank extends Bank implements AntiMoneyLaundering, CryptoCurrency {

    @Override
    void calculateSpecificBankTax() {
        System.out.println("Specific Swedbank tax rate is " + 1.9);
    }

    @Override
    public void executeSecurityChecks() {
        System.out.println("Processing security for loundering...");
    }

    @Override
    public void processCryptoTransactions() {
        System.out.println("Process crypto");
    }
}

class SEB extends Bank implements CryptoCurrency, AntiMoneyLaundering {

    @Override
    void calculateSpecificBankTax() {
        System.out.println("Specific SEB tax rate is " + 1.2);
    }

    @Override
    public void processCryptoTransactions() {
        System.out.println("Process crypto");
    }

    @Override
    public void executeSecurityChecks() {
        System.out.println("Processing security for loundering...");
    }
}

class Snoras extends Bank {

    @Override
    void calculateSpecificBankTax() {
        System.out.println("Its free");
    }
}

interface CryptoCurrency {
    void processCryptoTransactions();
}

interface AntiMoneyLaundering {
    void executeSecurityChecks();
}
