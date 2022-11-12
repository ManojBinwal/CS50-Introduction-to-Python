package Introduction_to_java.Output;

public class Output2 {

    public static void main(String[] args) {

        int a = 10;
        float b = 123.454343f;
        System.out.printf("%5d\n",a);
        String str = "Java";
        /*it will print 3 empty spaces before a,
            indentation is left.	total width including data is 5.
            if the length of data is more than it will override width */

        System.out.printf("%05d\n",a);
        /*It will print 00010. It fills the empty spaces with 0.   */

        System.out.printf("%6.2f\n",b);
        /*It will print the number in 6 places and only two digits after decimal point.
        123.45
        */
        System.out.printf("%20s\n",str);
        System.out.printf("%-20s\n",str);

    }

}
