package Introduction_to_java.Strings;

public class StringsIntro {
    public static void main(String[] args) {

                String str1 = "Java Program";
        String str2 = new String("Java");

        char c[] = {'H','e','l','l','o'};
        String str3 = new String(c);
        String str6 = new String(c,0,4);
        //it takes starting index and number of characters as argument.

        byte b[] = {65,66,67,68};
        String str4 = new String(b);
        String str5 = new String(b,2,2);
        //it take starting index and number of elements as argument

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
        System.out.println(str6);

    }
}
