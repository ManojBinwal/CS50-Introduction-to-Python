
/*    
* Searches a range of the specified array of ints for the specified value using the
     * binary search algorithm.
     * The range must be sorted (as
     * by the {@link #sort(int[], int, int)} method)
     * prior to making this call.  If it
     * is not sorted, the results are undefined.  If the range contains
     * multiple elements with the specified value, there is no guarantee which
     * one will be found.
     *
     * @param a the array to be searched
     * @param fromIndex the index of the first element (inclusive) to be
     *          searched
     * @param toIndex the index of the last element (exclusive) to be searched
     * @param key the value to be searched for
     * @return index of the search key, if it is contained in the array
     *         within the specified range;
     *         otherwise, <code>(-(<i>insertion point</i>) - 1)</code>.  The
     *         <i>insertion point</i> is defined as the point at which the
     *         key would be inserted into the array: the index of the first
     *         element in the range greater than the key,
     *         or {@code toIndex} if all
     *         elements in the range are less than the specified key.  Note
     *         that this guarantees that the return value will be &gt;= 0 if
     *         and only if the key is found.
     * @throws IllegalArgumentException
     *         if {@code fromIndex > toIndex}
     * @throws ArrayIndexOutOfBoundsException
     *         if {@code fromIndex < 0 or toIndex > a.length}
     * @since 1.6
     */

package Introduction_to_java.collectionFramework.ArrayList.Arrays;
import java.util.Arrays;
public class BinarySearch {
    public static void main(String[] args)
    {
  
        // Get the Array
        // int intArr[] = { 10, 20, 15, 22, 35 };
  
        // Arrays.sort(intArr);
  
        // int intKey = 22;
  
        // // Print the key and corresponding index
        // System.out.println(
        //     intKey + " found at index = "
        //     + Arrays.binarySearch(intArr, intKey));

        int intArr[] = { 10, 20, 15, 22, 35 };
  
        Arrays.sort(intArr);
  
        int intKey = 22;
  
        System.out.println(
            intKey
            + " found at index = "
            + Arrays
                  .binarySearch(intArr, 1, 3, intKey));
    
    }
}
