package Introduction_to_java.Strings;

public class ValidateWebsite {
    public static void main(String[] args) {
        String str = "www.Google.com";
        boolean validate = false;
        if (str.startsWith("www.") && str.endsWith(".com")){
            validate = true;
        }
        System.out.println(validate);
    }

}
