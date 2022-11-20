package Introduction_to_java.collectionFramework.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(20);
        ArrayList<Integer> arr2 = new ArrayList<>(List.of(50,60,70,80,90));
        arr.add(10);
        arr.add(0,5);
        arr.addAll(1,arr2);
        arr.add(90);

        System.out.println(arr.contains(20));
        System.out.println(arr.lastIndexOf(90));
        arr.set(arr.lastIndexOf(90),100);
        System.out.println(arr);

    }
}