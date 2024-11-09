package CollectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class set {
    public static void main(String args[]) {
        // HashSet
        // stores unique elements
        // stored in random order
        Set<Integer> hashSet = new HashSet<>();

        // LinkedHashSet
        // Just order will be same as we pushed
        // elements will be unique
        Set<Integer> linkedListSet = new LinkedHashSet<>();

        // TreeSet
        // elements will be sorted and unique
        // implements Binary Search Tree
        Set<Integer> set = new TreeSet<>();

        set.add(15);
        set.add(16);
        set.add(17);
        set.add(15);
        System.out.println(set);

        set.remove(17);
        System.out.println(set.contains(15));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        set.clear();
    }
}
