package practicalJava.oop.procedural_vs_oop;

public class EmployeeV1 {
    private int baseSalary;
    private int hourlyRate;
    
    public EmployeeV1(int baseSalary, int hourlyRate) {
        setHourlyRate(hourlyRate);
        setBaseSalary(baseSalary);
    }

    private void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0) {
            System.out.println("Not valid");
        }
        this.baseSalary = baseSalary;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0) {
            System.out.println("Not valid");
        } else
            this.hourlyRate = hourlyRate;

    }

    public int calculateWage(int extraHours) {
        return baseSalary + hourlyRate * extraHours;
    }
}
