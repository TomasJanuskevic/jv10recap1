package exercises.exercise2;

import java.util.Scanner;

public class TaxCalculator {
    public static final int INCOME_MARGIN = 85528;
    public static final double TAX_BASE = 556.02;
    public static final double TAX_18 = 0.19;
    public static final double TAX_32 = 0.32;
    public static final double TAX_BASE_FOR_RICH_PEOPLE = 14839.02;


    public double getTax(double income) {
        double calculatedTax;
        if (income <= INCOME_MARGIN) {
            calculatedTax = income * TAX_18 - TAX_BASE;
            if (calculatedTax < 0) {
                calculatedTax = 0;
            }
            return calculatedTax;
        } else {
            calculatedTax = TAX_BASE_FOR_RICH_PEOPLE + TAX_32 * (income - INCOME_MARGIN);
            return calculatedTax;
        }
    }

    public double monthlyLoan() {
        Scanner scanner = new Scanner(System.in);
        double loan = scanner.nextDouble();
        int installments = scanner.nextInt();
        double monthlyLoanInstallment;

        if (loan > 10000 || loan < 100) {
            System.out.println("loan out of range, loan is 5000");
            loan = 5000;
        }

        if (installments > 48 || installments < 6) {
            System.out.println("installments out of range, installments is set to 36");
            installments = 36;
        }

        if (installments < 13) {
            monthlyLoanInstallment = loan / installments * 1.025;
        } else if (installments < 25) {
            monthlyLoanInstallment = loan / installments * 1.05;
        } else {
            monthlyLoanInstallment = loan / installments * 1.10;
        }
        return monthlyLoanInstallment;
    }
}