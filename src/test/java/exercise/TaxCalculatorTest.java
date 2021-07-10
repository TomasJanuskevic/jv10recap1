package exercise;

import exercises.exercise2.TaxCalculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaxCalculatorTest {
    private static TaxCalculator taxCalculator;
    @BeforeAll
    public static void setUp() {
        taxCalculator = new TaxCalculator();
    }
    @Test
    void shouldCalculateTaxWhenIncomeIsBelowMargin() {
        //given
        //when
        double calculatedTax = taxCalculator.getTax(20000);
        //then
        assertEquals(3243.98, calculatedTax);
    }
    @Test
    void shouldCalculateTaxWhenIncomeIsAboveMargin() {
        //given
        //when
        double calculatedTax = taxCalculator.getTax(100000);
        //then
        assertEquals(19470.06, calculatedTax);
    }
    @Test
    void shouldNotCalculateAnyTaxesForLowIncome() {
        //given
        //when
        double calculatedTax = taxCalculator.getTax(300);
        //then
        assertEquals(0, calculatedTax);
    }


}