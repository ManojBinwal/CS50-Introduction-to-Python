package Introduction_to_java.OOPS;

public class Customer implements Member {
    String name;

    Customer(String name) {
        this.name = name;
    }

    public void callback() {
        System.out.println("Ok I will visit " + name);
    }
}
