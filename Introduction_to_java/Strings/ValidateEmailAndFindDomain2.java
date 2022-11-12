package Introduction_to_java.Strings;

public class ValidateEmailAndFindDomain2 {
    public static void main(String[] args) {

        String username = "";
        String domain = "";
        String str = "mail.manojbinwal@gmail.com";

        boolean isemail = ValidateEmail(str);
        System.out.println(isemail);

        username = FindUsername(str);
        System.out.println(username);

        domain = FindDomain(str);
        System.out.println(domain);

    }
    public static String FindDomain(String str)
    {
        int start = str.indexOf("@");
        return str.substring(start+1,str.length());
    }

    public static boolean ValidateEmail(String str)
    {
        boolean isemail = str.matches("[a-zA-Z0-9._]*[@][a-zA-Z]*[.com]*");
        return isemail;
    }

    public static String FindUsername(String str)
    {
        int end = str.indexOf("@");
        return str.substring(0,end);
    }
}
