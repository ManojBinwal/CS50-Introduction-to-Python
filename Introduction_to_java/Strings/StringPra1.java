package Introduction_to_java.Strings;

public class StringPra1 {
    public static void main(String[] args) {
        String str1 = "Pyramid";
        String str2 = "pyramid";
        String str3 = "Pyramid";

        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareTo(str3));
        System.out.println(str1.equals(str3));
        System.out.println(str1==str3);
    }
}
