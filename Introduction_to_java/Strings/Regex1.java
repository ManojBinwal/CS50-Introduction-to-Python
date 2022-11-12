package Introduction_to_java.Strings;

public class Regex1 {
    public static void main(String[] args) {
        String str1 = "abc6def";
        String str2 = "abbcbcabb";
        String str3 = "abc";
        System.out.println(str1.matches(".*")); //true
            //any character any number of times
        System.out.println(str1.matches("[a-zA-Z]*")); //false
        System.out.println(str2.matches("[a-zA-z]*")); //true
            //any letter any number of times

        System.out.println(str3.matches("[a-zA-Z0-9]{3}")); //true
        System.out.println(str1.matches("[a-zA-Z0-9]{3}")); //false
            //any letter 3 times
        System.out.println(str3.matches("[a-zA-Z0-9]{3,7}")); //true
        System.out.println(str1.matches("[a-zA-Z0-9]{3,7}")); //true
        System.out.println(str2.matches("[a-zA-Z0-9]{3,7}")); //false
            //any letter of digit minimum 3 and maximum 7 times
    }
}
