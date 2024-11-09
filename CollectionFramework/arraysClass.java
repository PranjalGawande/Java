package CollectionFramework;

import java.util.Arrays;

public class arraysClass {
    public static void main (String args[]) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int index = Arrays.binarySearch(nums, 6);   // logn
        System.out.println(index);
        System.out.println(nums[index]);

        System.out.println();

        int[] nums2 = {3, 6, 1, 6, 7, 3};
        Arrays.sort(nums2);
        for (int it : nums2) {
            System.out.println(it);
        }

        Arrays.fill(nums2, 10); // fills every element with given value
        for (int it : nums2) {
            System.out.println(it);
        }
    }
}
