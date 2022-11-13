package Introduction_to_java.OOPS;

public class Rectangle {
    public int length;
    public int breadth;

    public int area () {
        return length*breadth;
    }

    public int perimeter (int length , int breadth) {
        return 2*(length+breadth);
    }
}
