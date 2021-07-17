package individualTask.exercise3;

public abstract class Shape {
    protected String color;
    protected boolean isFilled;

    public Shape() {
        this.color = "unknown";
        this.isFilled = false;
    }

    public Shape(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    @Override
    public String toString() {
        return "Shape with color of " + color + " and " + filledInformation();
    }

    private String filledInformation() {
        if(isFilled){
            return "filled";
        }
        return "Not filled";
    }

    abstract double getArea();
    abstract double getPerimeter();
}
