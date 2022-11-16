package Introduction_to_java.Exception_Handling;

class Exceptionapractice1 {
    public static void main(String[] args) {
        try {
            int A[] = { 30, 20, 10, 40, 0 };
            int c = A[0] / A[4];
            System.out.println(c);
            System.out.println(A[5]);
            System.out.println(A[0] / A[4]);
        } catch (ArithmeticException e) {
            System.out.println("Enter numbre greater than zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index upto 4 only");
        } finally {
            System.out.println("Bye");
        }
    }
}