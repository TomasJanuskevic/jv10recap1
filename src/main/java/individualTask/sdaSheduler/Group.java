package individualTask.sdaSheduler;

import individualTask.sdaSheduler.exception.MaximumNumberOfStudentsReached;

import java.util.HashSet;
import java.util.Set;

public class Group {
    private String name;
    private Trainer trainer;
    private Set<Student> students = new HashSet<>();

    public Group(String name, Trainer trainer) {
        this.name = name;
        this.trainer = trainer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) throws MaximumNumberOfStudentsReached {
        if (this.students.size() >= 5) {
            throw new MaximumNumberOfStudentsReached(" to much students");
        } else {
            this.students.add(student);
        }
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", trainer=" + trainer +
                ", students=" + students +
                '}';
    }
}