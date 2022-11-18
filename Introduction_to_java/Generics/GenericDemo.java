public class GenericDemo<T> {
    T data[] = (T[]) new Object[3]; // typecasting object to type T

    public static void main(String[] args) {
        GenericDemo<String> gd = new GenericDemo();
        /* whatever class name is mention inside <> array will also inherit that */

        gd.data[0] = "Hi";
        gd.data[1] = "Bye";
        gd.data[2] = "10";
        System.out.println(gd.data[2]);

    }
}
