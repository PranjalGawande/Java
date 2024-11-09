package CollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class map {
    public static void main (String args[]) {
        // Stores key value pair

        // HashMap
        Map<String, Integer> mpp = new HashMap<>();

        // TreeMap
        // Sorted on the basis of keys
        // implements BST under
        Map<String, Integer> tMpp = new TreeMap<>();

        mpp.put("One", 1);
        mpp.put("Two", 2);
        mpp.put("Three", 3);

        System.out.println(mpp);
        System.out.println(mpp.containsKey("Three"));;
        mpp.putIfAbsent("One", 11); // not put if already present
        System.out.println(mpp);

        // way to iterate over loop
        for (Map.Entry<String, Integer> e : mpp.entrySet()) {   // mpp.entrySet() gives key:value
            System.out.println(e);

            System.out.println(e.getKey() + " : " + e.getValue());  // to get key and value from entryset
        }

        // to iterate over only keys or values
        for (String key : mpp.keySet()) {
            System.out.println(key);
        }
        for (Integer val : mpp.values()) {
            System.out.println(val);
        }

        System.out.println(mpp.containsKey("Two"));;
        System.out.println(mpp.containsValue(3));
        mpp.remove("One");
        System.out.println(mpp);
        System.out.println(mpp.isEmpty());
    }
}
