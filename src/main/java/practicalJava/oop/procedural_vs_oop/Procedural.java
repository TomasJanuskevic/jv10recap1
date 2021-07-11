package practicalJava.oop.procedural_vs_oop;

public class Procedural {
    public static void main(String[] args) {
        int baseSalary = 1000;
        int hourlyRate = 5;
        int extraHours = 7;

        int wage = calculateWage(baseSalary, hourlyRate, extraHours);
        System.out.println(wage);
    }

    private static int calculateWage(int baseSalary, int hourlyRate, int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }
}
