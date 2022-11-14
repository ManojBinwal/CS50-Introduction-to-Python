package Introduction_to_java.OOPS;

public class Scops {
    public static void main(String[] args) {
        Subjects subs[] = new Subjects[3];
        subs[0] = new Subjects("s101", "DS", 100);
        subs[1] = new Subjects("Al102", "Algorithm", 99);
        subs[2] = new Subjects("s103", "Java", 89);

        for (Subjects s : subs) {
            System.out.println(s);
        }

    }
}
