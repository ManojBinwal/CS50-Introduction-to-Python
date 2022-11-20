package Introduction_to_java.Generics;

public class MyArray<T> {
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

class GenericDemo2{
    public static void main(String[] args) {
        MyArray<Integer> ma = new MyArray<>();
        ma.append(10);
        ma.append(20);
        ma.append(30);
    }
}
