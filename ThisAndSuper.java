// Every constructor in java has a method super() by default

// Every class in java extends Object class
class A extends Object{   // super class
    // Constructor of A
    public A() {
        super();    // default present at the start of every constuctor
        System.out.println("in A");
    }
    public A(int a) {
        super();
        System.out.println("in A int");
    }
}

class B extends A { // sub class
    // Constructor of B
    public B() {
        super();
        System.out.println("in B");
    }
    
    public B(int a) {
        // super();        // so is always calls the default constructor of super class first before running this constructor
        super(a);       // to call the paratmeterized constructor of super class 
        System.out.println("in B int");
    }
}

public class ThisAndSuper {
    public static void main (String args[]) {
        // creating only obj of B
        B obj = new B(2);

    }
}
