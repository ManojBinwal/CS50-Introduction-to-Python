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
public class GenericDemo3{
    public static void main(String[] args) {
        MyArrray2 ma = new MyArrray2();
        ma.append(10);
        ma.append(34.33);
        ma.append(30);

        ma.display();
    }
}
