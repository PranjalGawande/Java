// Method overriding
class A {
    // not calling this if derived class have same function defined
    public void show() {
        System.out.println("show in A");
    }
}

class B extends A { // inherits class A
    // if we write the same function in derived class then it overrides the function of super class
    public void show() {        
        System.out.println("show in B");
    }
}

class C extends B {
    @Override   // show error if not overrided correctly
    public void show() {
        System.out.println("show in C");
    }
}

public class Inheritance {
    public static void main (String args[]) {
        // AdvCalc obj = new AdvCalc();
        // int r1 = obj.add(4, 5);
        // int r2 = obj.sub(10, 8);
        // int r3 = obj.multi(5, 3);
        // int r4 = obj.div(10, 2);
        // System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);

        // B obj = new B();
        // obj.show();     // first check in B then A

        // Dynamic Method Dispatch  => Runtime Polymorphism
        // we can create reference of super class and store inherited class objects
        A obj = new B();
        obj.show(); // invokes B

        obj = new A();  // storing object of A
        obj.show(); // invokes A

        obj = new C();
        obj.show(); // invokes C
    }
}
