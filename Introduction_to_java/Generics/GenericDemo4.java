package Introduction_to_java.Generics;

class MyArray<T extends Number>{
    T arr[] = (T[]) new Object[10];
    int length = 0;

    public void append(T v) {
        arr[length++]=v;
    }
    public void display()
    {
        for(int i=0; i<length; i++) {
            System.out.println(arr[i]);
        }
    }
}
class MyArrray2 extends MyArray{

}
public class GenericDemo4{
    static <E> void show(E[] list){
        for(E x:list){
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
       
        show(new String[]{"Hi","Bye","go away"});
        show(new Integer[]{13,14,13,12});
        }
       
    }