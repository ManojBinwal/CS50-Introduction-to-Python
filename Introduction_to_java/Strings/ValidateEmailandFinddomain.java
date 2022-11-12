package Introduction_to_java.Strings;

public class ValidateEmailandFinddomain {
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
        //System.out.println(start);
        String domain = "";
        int end = str.length();
        int i = 0;
        while(start<end-1){
            domain += str.charAt(start+1);
            start = start + 1;
        }
        return domain;
    }

    public static boolean ValidateEmail(String str)
    {
        boolean isemail = str.matches("[a-zA-Z0-9._]*[@][a-zA-Z]*[.com]*");
        return isemail;
    }

    public static String FindUsername(String str)
    {
        int i = 0;
        String username = "";
        while(str.charAt(i)!='@')
        {
            username += str.charAt(i);
            i++;
        }
        return username;
    }
}
