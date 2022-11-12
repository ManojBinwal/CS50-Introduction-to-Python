package Introduction_to_java.Strings;

public class Stringpool {
    public static void main(String[] args) {
        String str1 = "java";  //compares variable but variable contains reference not object
        String str2 = "java";
        String str3 = "java";
        String str4 = "Java";
        String str5 = new String("java"); //creates object in heap memory

        System.out.println(str1==str2);     //refers to same object in string pool
        System.out.println(str1==str3);    //refers to same object in string pool
        System.out.println(str1==str4);   //objects are different
        System.out.println(str1==str5);  //object is created in heap
    }
}
