import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

class My {
    private int a;
    protected int b;
    public int c;
    int d;
    public My(){}
    public My(int x, int y){}
    public void display(String s1, String s2) {}
    public int show(int x, int y) {return 0;}
    

}
public class ReflectDemo {
    public static void main(String[] args) {
        Class c = My.class;
        // My m = new My();
        // Class c1 = m.getClass();
        System.out.println(c.getName());

        Field field[] = c.getDeclaredFields();
        for(Field f:field) {
        System.out.println(f);
        }
        Constructor con[]=c.getConstructors();
        for(Constructor cp:con){
            System.out.println(cp);
        }
    }
}
