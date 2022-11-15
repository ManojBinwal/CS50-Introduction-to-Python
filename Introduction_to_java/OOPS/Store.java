package Introduction_to_java.OOPS;

public class Store {
    Member[] member = new Member[100];
    int count = 0;

    public void register(Member m) {
        member[count++] = m;
    }

    public void inviteSale() {
        for (int i = 0; i < count; i++) {
            member[i].callback();
        }
    }
}
