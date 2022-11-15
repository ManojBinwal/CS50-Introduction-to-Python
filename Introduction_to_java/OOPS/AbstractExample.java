package Introduction_to_java.OOPS;

public class AbstractExample extends Super {
    public void meth2() {
        System.out.println();
    }

    public static void main(String[] args) {
        Super s = new AbstractExample();
        s.meth1();
    }
}