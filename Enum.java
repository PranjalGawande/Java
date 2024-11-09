// enum is a special class that repr a group of constants
// we can't extend enum other than that everything is same as class
enum Status {
    Running, Failed, Pending, Success, Macbook;      // named constants
}

enum Laptop {
    // creating object in same class
    Macbook(1800), ROG(2000), Vivobook;   // acts as a object that calls constructor

    private int price;

    // default constructor if price not given
    private Laptop() {  // called for every ooject created above
        price = 500;    // default price
    }

    public int getPrice() {
        return price;
    }

    // Generated Getter and setters to update the price
    public void setPrice(int price) {
        this.price = price;
    }

    private Laptop(int price) { // generated constructor
        this.price = price;
    }


}

public class Enum {
    public static void main (String args[]) {
        Status s = Status.Running;
        System.out.println(s);
        System.out.println(s.ordinal());    // to print index 

        // to get all constants
        Status[] ss = Status.values();  // in array
        
        for (Status it : ss) {
            System.out.println(it + ": " + it.ordinal());
        }

        // use of switch case with enum
        switch (s) {
            case Running:       // no need of writing Status.Running
                System.out.println("all good");
                break;
            default:
                break;
        }


        // Modified enum
        Laptop lp = Laptop.Macbook;
        System.out.println(lp + " : " + lp.getPrice());

        for (Laptop lap : Laptop.values()) {
            System.out.println(lap + " : " + lap.getPrice());
        }
    }
}
