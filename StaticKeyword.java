class Mobile {
    String brand;
    int price;
    static String name; // shared be all objects i.e. its a class member not object member

    // Use static block to initialize static member
    static {    // called only once before constructor when a class is loaded
        name = "s24";
        System.out.println("in static block");
    }

    public Mobile() {   // Constructor
        brand = "Samsung";
        price = 19999;
        // name = "s24";   // don't initialize here
        System.out.println("in constructor");
    }

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1(Mobile obj) {  // using object passed to use non-static variables
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }
    
}

public class StaticKeyword {
    public static void main (String args[]) throws ClassNotFoundException {
        Mobile mobile1 = new Mobile();
        // mobile1.brand = "Apple";
        // mobile1.price = 99999;
        // Mobile.name = "Iphone 16";  // should be called with class name not obj

        Mobile mobile2 = new Mobile();

        mobile1.show();
 
        // Load a class w/o creating object
        Class.forName("Mobile");

        Mobile.show1(mobile1);  
    }
}
