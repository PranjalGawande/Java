import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;

// Collection API => concept
// Collection => interface
// Collections => class

// Comparable: comparator implemented in class
class Students implements Comparable<Students> {
    String name;
    int age;

    public Students(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public String toString() {
        return "Student age = " + age + ", name = " + name;
    }

    public int compareTo(Students that) {  
        if (this.age > that.age) {  // this: current obj, that: other obj
            return 1;
        }
        else {
            return -1;
        }
    }
}

class CollectionsInJava {
    public static void main (String args[]) {
        // Collection<Integer> nums = new ArrayList<Integer>();
        // ArrayList
        // List<Integer> nums = new ArrayList<Integer>();
        // nums.add(10);
        // nums.add(20);
        // nums.add(30);
        // nums.add(40);

        List<Integer> a = Arrays.asList(5, 3, 21, 5);   // directly take input array
        
        // HastSet
        // no duplicats and not sorted
        // Set<Integer> nums = new HashSet<Integer>();
        // nums.add(10);
        // nums.add(50);
        // nums.add(30);
        // nums.add(60);
        // nums.add(50);

        // TreeSet
        // no duplicates and in sorted order
        Set<Integer> nums = new TreeSet<Integer>();
        nums.add(10);
        nums.add(50);
        nums.add(30);
        nums.add(60);
        nums.add(50);

        // Iterator in java
        Iterator<Integer> values = nums.iterator();
        while (values.hasNext()) {
            System.out.println(values.next());
        }

        // System.out.println(nums);   // can directly print Array List
        // for loop
        // for (int i = 0; i < nums.size(); i++) {
        //     System.out.println(nums.get(i));    // not nums[i]
        // }
        for (int it : nums) {
            System.out.println(it);
        }
        // System.out.println(nums.indexOf(20));

        
        // HashMap
        // collection of key - value pairs
        // Unique keys
        Map<String, Integer> students = new HashMap<String, Integer>();
        students.put("Pranjal", 24);
        students.put("Aryan", 23);
        students.put("Aryan", 24);

        System.out.println(students);
        System.out.println(students.values());
        System.out.println(students.keySet());  // give all the keys
        for (String key : students.keySet()) {
            System.out.println(key + " : " + students.get(key));
        }

        // Hashtable
        // same as HashMap but synchronised

        // Comparator -> Interface
        // Comparator<Integer> comp = new Comparator<Integer>() {
        //     public int compare(Integer i, Integer j) {  // function will be compare
        //         if (i % 10 > j % 10) {  // sorting based on 2nd digit
        //             return 1;   // swap
        //         }
        //         else {
        //             return -1;
        //         }
        //     }
        // };

        // can write comparator as lambda fucntion
        Comparator<Integer> comp = (i, j) -> (i%10) > (j%10) ? 1 : -1;;


        Comparator<String> com = new Comparator<String>() {
            public int compare(String s1, String s2) {
                if (s1.length() > s2.length()) {
                    return 1;
                }
                else {
                    return -1;
                }
            }
        };

        // Sorting
        List<Integer> arr = new ArrayList<>();
        arr.add(43);
        arr.add(56);
        arr.add(26);
        arr.add(78);

        Collections.sort(arr);
        // using comparator -> sorting according to 2nd element
        Collections.sort(arr, comp);
        System.out.println(arr);

        List<String> s = new ArrayList<String>();
        s.add("giorio");  
        s.add("JSGIEIOGJF");  
        s.add("dgh");  
        s.add("fhuefhw"); 

        Collections.sort(s, com);
        System.out.println(s);

        // Comparable
        List<Students> studs = new ArrayList<>();
        studs.add(new Students(24, "Pranjal"));
        studs.add(new Students(23, "Aryan"));
        studs.add(new Students(30, "Hari"));

        Collections.sort(studs);    // no need of comp comparator here when using comparable
        for (Students st : studs) {
            System.out.println(st);
        }
    }
}