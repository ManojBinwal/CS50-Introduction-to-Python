package Introduction_to_java.Strings;

public class StringPrac {
    public static void main(String[] args) {
        String str1 = "Mr.Shahrukh Khan";

        System.out.println(str1.startsWith("Mr."));
            //checks if string starts with "Mr."
        System.out.println(str1.startsWith("Shah",3));
            //checks starts with starting from index 3
        System.out.println(str1.endsWith("Khan"));
        System.out.println(str1.charAt(5));
        System.out.println(str1.indexOf('.'));
        System.out.println(str1.indexOf("Shah"));
        System.out.println(str1.lastIndexOf('k'));



    }

}
