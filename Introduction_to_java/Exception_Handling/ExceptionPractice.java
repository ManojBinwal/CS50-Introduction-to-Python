package Introduction_to_java.Exception_Handling;

public class ExceptionPractice {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 2;
            int c = a / b;
            System.out.println(c);
            System.out.println("Bye");
        } catch (ArithmeticException e) {
            System.out.println("Enter number greater than zero");
        }
    }
}
