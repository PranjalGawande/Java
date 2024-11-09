package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class arrayLists {
    public static void main (String args[]) {
        List<Integer> list = new ArrayList<>();
        
        list.add(10);
        list.add(50);
        list.add(20);
        list.add(90);

        System.out.println(list);

        list.add(1, 25); // add at index 1

        System.out.println(list);
        
        List<Integer> newList = new ArrayList<>();
        newList.add(101);
        newList.add(102);

        list.addAll(newList);  // append newlist to list
        System.out.println(list);

        System.out.println(list.get(3));
        
        list.remove(3); // remove index 4 element
        System.out.println(list);

        list.remove(Integer.valueOf(25));   // remove element 25
        System.out.println(list);

        list.set(3, 1000);  // update index 3 element to 1000
        System.out.println(list);

        System.out.println(list.contains(1000));    // return true if present in array

        list.clear();   // remove all element
        System.out.println(list);

    }
}
