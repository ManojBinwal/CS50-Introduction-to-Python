package Introduction_to_java.OOPS;

public class Cuboid extends Rectangle {
    public int height;

    public Cuboid() {
        height = 1;
    }

    public Cuboid(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public int volume() {
        return length * breadth * height;
    }

    public static void main(String[] args) {
        Cuboid c = new Cuboid();
        System.out.println(c.volume());
    }

}
