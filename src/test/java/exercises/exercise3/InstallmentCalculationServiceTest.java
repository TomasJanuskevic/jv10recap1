package exercises.exercise3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstallmentCalculationServiceTest {

    @Test
    void calculateMonthlyInstallmentPrice() {
        //given
        InstallmentCalculationService installmentCalculationService = new InstallmentCalculationService();
        //when
        double actualInstPrice = installmentCalculationService.calculateMonthlyInstallmentPrice(2000, 12);
        assertEquals(171.0, actualInstPrice);
    }
    @Test
    void calculateMonthlyInstallmentPriceWithDefaultInstallment(){
        InstallmentCalculationService service = new InstallmentCalculationService();
        double actualInstPrice = service.calculateMonthlyInstallmentPrice(2000, 2);
        assertEquals(61.0, actualInstPrice);
        actualInstPrice = service.calculateMonthlyInstallmentPrice(2000, 14);
        assertEquals(150.0, actualInstPrice);

    }
}