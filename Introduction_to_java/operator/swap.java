package Introduction_to_java.operator;

public class swap {
    public static void main(String[] args) {
      char s = 'A';
      char m = 'T';
      s = (char) (s^m);
      m = (char) (s^m);
      s = (char) (s^m);
      System.out.println(s+" "+ m);
    }
}
