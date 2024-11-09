class A {
    public void show() {
        System.out.println("in A");
    }

    static class B {
        public void config() {
            System.out.println("in B");
        }
    }
}

public class InnerClass {
    public static void main (String args[]) {
        A obj = new A();
        obj.show();

        // Cannot find B 
        // B obj1 = new B();
        // obj1.config();

        // To make obj of B 
        
        // A.B obj1 = obj.new B(); // with object of A 
        A.B obj1 = new A.B();   // if the class is static
        obj1.config();

        // Anonymous Class
        A obj2 = new A() {
            public void show() {
                System.out.println("in anonymous class");
            }
        };
        obj2.show();
    }
}
