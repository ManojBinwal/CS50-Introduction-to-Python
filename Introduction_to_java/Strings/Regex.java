package Introduction_to_java.Strings;

public class Regex {
    public static void main(String[] args) {
        String str1 = "ABC";
        System.out.println(str1.matches("..."));  //true
        System.out.println(str1.matches(".."));   //false

        String str2 = "P";
        System.out.println(str2.matches("[Ppqr]")); //true
        System.out.println(str2.matches("[pqr]")); //false
        System.out.println(str1.matches("[ABC]")); //false
        System.out.println(str2.matches("[A-za-z0-9]")); //true
        /*it only mathces single character */
        System.out.println(str1.matches("[A-za-z0-9][A-za-z0-9][A-za-z0-9]")); //true

    }
}
