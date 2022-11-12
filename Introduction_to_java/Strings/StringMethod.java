package Introduction_to_java.Strings;

public class StringMethod {
    public static void main(String[] args)
    {
        String str = "   Netbeans   ";

        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.trim());
        System.out.println(str.substring(3));
        System.out.println(str.substring(3,5));
        System.out.println(str.replace('N','P'));
    }
}
