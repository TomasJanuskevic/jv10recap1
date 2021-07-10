package exercises.exercise3;

import java.util.Scanner;

public class InstallmentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite suma kuria norite pasiskolinti (100 - 10000)");
        double amount = scanner.nextDouble();
        System.out.println("Iveskite menesiniu mokejimu kieki. (6 - 48)");
        int numberOfInstallments = scanner.nextInt();

        InstallmentCalculationService installmentCalculationService = new InstallmentCalculationService();

        double loanAmount = installmentCalculationService.calculateMonthlyInstallmentPrice(amount, numberOfInstallments);






    }
}
