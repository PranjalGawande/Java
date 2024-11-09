package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class collectionClass {
    public static void main(String args[]) {
        // List<Integer> arr = new ArrayList<>();
        List<Integer> arr = Arrays.asList(4, 2, 6, 7, 2, 5, 8, 2);

        System.out.println(Collections.min(arr));   // return min element
        System.out.println(Collections.max(arr));   // return max element
        System.out.println(Collections.frequency(arr, 2));  // return count of given element

        Collections.sort(arr);  // sort in increasing
        System.out.println(arr);

        Collections.sort(arr, Comparator.reverseOrder());   // sort in decreasing
        System.out.println(arr);
        

    }
}
