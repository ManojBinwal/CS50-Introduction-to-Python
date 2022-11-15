package Introduction_to_java.OOPS;

public class StoreMain {
    public static void main(String[] args) {
        Store st = new Store();
        Customer c1 = new Customer("John");
        Customer c2 = new Customer("Vicky");
        st.register(c1);
        st.register(c2);
        st.inviteSale();

    }
}
