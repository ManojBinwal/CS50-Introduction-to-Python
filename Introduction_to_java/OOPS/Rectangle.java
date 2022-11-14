package Introduction_to_java.OOPS;

public class Rectangle {
    public int length;
    public int breadth;

    public Rectangle() {
        length = breadth = 5;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Rectangle(int side) {
        this.length = side;
        this.breadth = side;
    }

    public int area() {
        return length * breadth;
    }

    public int perimeter(int length, int breadth) {
        return 2 * (length + breadth);
    }
}
