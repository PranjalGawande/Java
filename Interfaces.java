// declare abstract method and final static variable
// it contains only abstract method
// class - class : extends
// interface - interface : extends
// class - interface : implements
interface A {
    int x = 10;     // final static variable by default

    void show();    // abstract method by default
}

interface B {
    void run();
}

interface X extends B {

}

class C implements A, X {   // multiple interface 
    public void show() {
        System.out.println("in show");
    }
    public void run() {
        System.out.println("in run");
    }
}

class Interfaces {
    public static void main (String args[]) {
        A obj = new C();
        obj.show();
        
        // A ref does not know about X
        // obj.run();
        X obj1 = new C();
        obj1.run();

        // since final static so access with class
        System.out.println(A.x);
    }
}