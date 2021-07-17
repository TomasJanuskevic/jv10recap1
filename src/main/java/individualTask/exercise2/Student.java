package individualTask.exercise2;

public class Student extends Person{
    private String study;
    private int yearOfStudy;
    private double price;

    public Student(String study, int yearOfStudy, double price) {
        this.study = study;
        this.yearOfStudy = yearOfStudy;
        this.price = price;
    }

    public Student(String name, String address, String study, int yearOfStudy, double price) {
        super(name, address);
        this.study = study;
        this.yearOfStudy = yearOfStudy;
        this.price = price;
    }

    public String getStudy() {
        return study;
    }

    public void setStudy(String study) {
        this.study = study;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Student{" +
                "study='" + study + '\'' +
                ", yearOfStudy=" + yearOfStudy +
                ", price=" + price +
                '}';
    }
}
