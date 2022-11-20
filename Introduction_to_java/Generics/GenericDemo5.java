package Introduction_to_java.Generics;

class MyArray5<T>{
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
public class GenericDemo5{
  
    static void fun(MyArray5<? extends Number> obj) //unbounded wild card as good as no parameters
    {
        obj.display();
    }
    public static void main(String[] args) {
       MyArray5<String> ma1 = new MyArray5<>();
       ma1.append("Hi");
       ma1.append("Bye");

       MyArray5<Integer> ma2 = new MyArray5<>();
       ma2.append(10);
       ma2.append(20);

       //fun(ma1);
       fun(ma2);
        
        }
       
    }