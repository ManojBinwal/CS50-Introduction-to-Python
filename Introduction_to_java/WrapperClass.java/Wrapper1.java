public class Wrapper1 {
    public static void main(String[] args) {
        Float f = Float.valueOf("123.456");
        float x = f.floatValue();
        float y = f;                    //auto unboxing
        float z = 435.343f;
        f = z;                          //auto boxing
        System.out.println(x+"\n"+y);
    }
}
