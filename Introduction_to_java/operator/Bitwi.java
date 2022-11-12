public class Bitwi {
    public static void main(String[] args) {
        int x = 0b1010;
        int y = 0b0110;
        int z;

        z = x&y;
        System.out.println(z+ " " + Integer.toBinaryString(z));

        z = x|y;
        System.out.println(z + " " + Integer.toBinaryString(z));

        z = x^y;
        System.out.println(z + " " + Integer.toBinaryString(z));

        z = ~x;
        System.out.println(z + " " + Integer.toBinaryString(z));

        z = x>>1;        //right shift
        System.out.println(z + " " + Integer.toBinaryString(z));

        z = x<<1;       // left shift
        System.out.println(z + " " +String.format("%32s", Integer.toBinaryString(z)));

        z = -10>>>1; //unsigned right shift
        System.out.println(z + " " +String.format("%32s", Integer.toBinaryString(z)));





    }
}
