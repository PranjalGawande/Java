public class JavaString {
    public static void main (String args[]) {
        // String s = "Aryan";

        // String is a class 
        // Making object of String  
        // String name = new String("Pranjal");    // same as above

        // System.out.println(s);
        // System.out.println(name);
        // System.out.println(name.hashCode());
        // System.out.println(name.charAt(4));
        // System.out.println(name.concat(" Gawande"));
        

        // String s1 = "Pranjal";
        // String s2 = "Pranjal";
        // System.out.println(s1 == s2);

        // String Buffer
        StringBuffer sb = new StringBuffer("Pranjal");
        
        System.out.println(sb.capacity());   // 16 => default buffer capacity
        System.out.println(sb.length());    // 7

        // String Buffer provides several methods to manipulate data
        sb.append(" Gawande");
        System.out.println(sb);

        String s = sb.toString();   // to convert String Buffer to String

        // sb.deleteCharAt(1);

        sb.insert(7, " Java");  // insert at a given position

        sb.setLength(30);   // increasing the length

        System.out.println(sb);
        

    }
}
