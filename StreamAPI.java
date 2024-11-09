import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main (String args[]) {
        List<Integer> nums = Arrays.asList(2, 5, 3, 7, 8, 4);
        
        // For each loop present in List 
        // nums.forEach(n -> System.out.println(n));


        Stream<Integer> s1 = nums.stream();
        
        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);    // returns only no. divisible by 2
        // s2.forEach(n -> System.out.println(n));  // after this also s2 can't be used
        
        Stream<Integer> s3 = s2.map(n -> n*2);  // perform operation on each element
        // s3.forEach(n -> System.out.println(n));

        int ans = s3.reduce(0, (c, e) -> c+e);
        System.out.println(ans);

        // all the above can be done in one statement
        int result = nums.stream()
                        .filter(n -> n%2 == 0)
                        .map(n -> n*2)
                        .reduce(0, (c, e) -> c+e);
        
        System.out.println(result);

        // to return sorted array
        Stream<Integer> sortedValues = nums.stream()
                                        .filter(n -> n%2 == 0)
                                        .sorted();

        sortedValues.forEach(n -> System.out.println(n));

        // to filter with multiple threads
        Stream<Integer> threadFilter = nums.parallelStream()
                                        .filter(n -> n%2 == 0);
        
    }
}
