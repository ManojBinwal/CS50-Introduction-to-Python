package Introduction_to_java.Generics;
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class GenericSwap {
    public static  <T> void swap(T x, T y) {
        T temp;
        temp = x;
        x = y;
        y = temp;
        System.out.println("x = " + x + " y = " + y);
    }
    public static void main(String[] args) {
        
        Object p1 = new Person("Sumit",45);
        Object p2 = new Person("Ravi",49);
        
        swap(p1, p2);
        System.out.println(p1 + " " + p2);


        // String x = new String("Ram");
        // String y = new String("Shyam");
        // System.out.println("x = " + x + " y = " + y);
        // swap(x,y);
        // System.out.println("x = " + x + " y = " + y);

        // int x1 = 99;
        // int y1 = 88;
        // System.out.println("x = " + x1 + " y = " + y1);
        // swap(x1, y1);
        

    }
}
