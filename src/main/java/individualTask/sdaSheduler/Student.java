package individualTask.sdaSheduler;

import java.time.LocalDate;

public class Student extends Person {
    private boolean hasPreviousJavaKnowledge;

    public Student(String name, String lastName, LocalDate dateOfBirth, boolean hasPreviousJavaKnowledge) {
        super(name, lastName, dateOfBirth);
        this.hasPreviousJavaKnowledge = hasPreviousJavaKnowledge;
    }

    public boolean isHasPreviousJavaKnowledge() {
        return hasPreviousJavaKnowledge;
    }

    public void setHasPreviousJavaKnowledge(boolean hasPreviousJavaKnowledge) {
        this.hasPreviousJavaKnowledge = hasPreviousJavaKnowledge;
    }

    @Override
    public String toString() {
        return "Student{" +
                "hasPreviousJavaKnowledge=" + hasPreviousJavaKnowledge +
                '}';
    }
}