package Introduction_to_java.OOPS;

public class Cylinder extends Circle {
    private int height;

    public Cylinder(int height, int radius) {
        this.height = height;
        this.radius = radius;
    }

    @Override
    public double area() {
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }

    public double perimeter() {
        return 4 * radius + 2 * height;
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(7, 7);
        System.out.println(cylinder.volume());
        System.out.println(cylinder.area());
        System.out.println(cylinder.perimeter());
    }
}
