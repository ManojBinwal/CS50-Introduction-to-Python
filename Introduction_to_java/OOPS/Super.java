package Introduction_to_java.OOPS;

public abstract class Super {
    public Super() {
        System.out.println("Super Constructor");
    }

    public void meth1() {
        System.out.println("Meth1 of Super");
    }

    abstract public void meth2();
}