package Introduction_to_java.Output;

public class Output {
    public static void main(String[] args) {
        System.out.printf("Hello");
        //   Hello on same line
        System.out.printf("Hello\n");
        //   will print Hello on same line and then change line

        int x = 10;
        float y =12.56f;
        float w = 0.0012f;
        char z = 'A';

        System.out.printf("Hello %d %f %c \n" ,x,y,z);
        /*it will print Hello 10 12.5600000 A
            what it means is you need to mention format specifiers inside the string
            and then list them outside the string in same order.
            This method is similar to printf in C language.
                        Format Specifiers-
                            Char c
                            int  d, o , x    decimal , octal , hexadecimal
                            float f ,e, g    decimal , octal , hexadecimal
        */
        System.out.printf("%x\n", x);
        //  a  ,  it will print 'a' as 10 in hexadecimal format is represented by 'a'

        System.out.printf("%e\n", y);
        /* 1.256000e+01      - this is representation in octal form and means -
        1.256 * 10^1   = 12.56
        */
        System.out.printf("%e\n", w);
        // 1.200000e-03     which means   1.2/1000  0r 1.2 * 10^ -3

    }
}
