package Introduction_to_java.OOPS;

class Outer {
    static int x = 10;
    int y = 20;

    static class Inner {
        void display() {
            System.out.println(x);
            // System.out.println(y);
        }
    }
}
