package Introduction_to_java.Strings;

public class CheckBinaryHexaDate {
    public static void main(String[] args) {
        int b = 1010001;
        int c = -254;
        String date = "31/12/2022";
        // System.out.println(c);

        boolean isbinary = CheckBinary(b);
        boolean ishex = CheckHex(c);
        boolean isdate = Checkdate(date);

        System.out.println(isbinary);
        System.out.println(ishex);
        System.out.println(isdate);

    }

    public static boolean CheckBinary(int b) {
        String str = "";
        str = String.valueOf(b);
        return str.matches("[01]+");
    }

    public static boolean CheckHex(int c) {
        String str = "";
        str = Integer.toHexString(c);
        return str.matches("[0-9a-fA-F]+");
    }

    public static boolean Checkdate(String str) {
        return str.matches("[0-3][0-9][/][0-1][0-9][/][0-2][0-9]{3}");
    }
}
