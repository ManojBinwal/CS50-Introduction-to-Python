package Introduction_to_java.OOPS;

public class Circle {
    protected int radius = 0;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int r) {
        if (r >= 0) {
            radius = r;
        } else {
            System.out.println("value out of range!");
        }
    }

    public double area() {
        return Math.PI * ((radius) * (radius));
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
