public class MaskingAndMerging {
    public static void main(String[] args) {
        byte a = 9 , b = 12;
        byte c = 0;

        c=(byte)(b|c);
        a= (byte)(a<<4);
        c=(byte)(a|c);
        System.out.println(String.format("%8s",Integer.toBinaryString(c)));
        System.out.println((c&0b11110000)>>4);
        System.out.println((c&0b00001111));
    }
}
