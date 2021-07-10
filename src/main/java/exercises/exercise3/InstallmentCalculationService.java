package exercises.exercise3;

public class InstallmentCalculationService {

    public static final double MIN_LOAN_AMOUNT = 100.00;
    public static final double MAX_LOAN_AMOUNT = 10000.00;
    public static final double DEFAULT_LOAN_AMOUNT = 5000.00;
    public static final int MIN_INSTALLMENTS = 6;
    public static final int MAX_INSTALLMENTS = 48;
    public static final int DEFAULT_OF_INSTALLMENTS = 36;

    public double calculateMonthlyInstallmentPrice(double amount, int numberOfInstallments) {

        //Ternary operator approach
        boolean isAmountEligible = amount > MIN_LOAN_AMOUNT && amount < MAX_LOAN_AMOUNT;
        amount = isAmountEligible ? amount : DEFAULT_LOAN_AMOUNT;

        //regular if else approach
        if (numberOfInstallments < MIN_INSTALLMENTS || numberOfInstallments > MAX_INSTALLMENTS) {
            numberOfInstallments = DEFAULT_OF_INSTALLMENTS;
        }

        double loanInterestRate;
        double monthlyInstallmentPrice;

        loanInterestRate = getLoanInterestRate(numberOfInstallments);
        monthlyInstallmentPrice = Math.round(amount * (1.00 + loanInterestRate) / numberOfInstallments);


        System.out.println("Initial amount: " + amount);
        System.out.println("Your monthly installment with interest is " + amount);
        System.out.println("Number of Installment: " + numberOfInstallments);

        return monthlyInstallmentPrice ;
    }

    private double getLoanInterestRate(int numberOfInstallments) {
        double loanInterestRate;
        if (numberOfInstallments <= 12) {
            loanInterestRate = 0.025;
        } else if (numberOfInstallments <= 24) {
            loanInterestRate = 0.05;
        } else {
            loanInterestRate = 0.1;
        }
        return loanInterestRate;
    }
}
