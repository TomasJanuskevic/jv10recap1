package individualTask.sdaSheduler;
import java.time.LocalDate;
public class Trainer extends Person{
    private boolean isAuthorized;
    private double gradeAverage;
    public Trainer(String name, String lastName, LocalDate dateOfBirth, boolean isAuthorized, double gradeAverage) {
        super(name, lastName, dateOfBirth);
        this.isAuthorized = isAuthorized;
        this.gradeAverage = gradeAverage;
    }
    public boolean isAuthorized() {
        return isAuthorized;
    }
    public void setAuthorized(boolean authorized) {
        isAuthorized = authorized;
    }
    public double getGradeAverage() {
        return gradeAverage;
    }
    public void setGradeAverage(double gradeAverage) {
        this.gradeAverage = gradeAverage;
    }
    @Override
    public String toString() {
        return "Trainer{" +
                "isAuthorized=" + isAuthorized +
                ", gradeAverage=" + gradeAverage +
                '}';
    }
}