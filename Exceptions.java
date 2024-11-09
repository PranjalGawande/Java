// Custom exception
class PranjalException extends Exception {  // extends the base exception class
    public PranjalException(String string) {
        super(string);  // to pass the string to catch
    }
}

class A {
    public void show() throws ClassNotFoundException {  //  exception is handled by the callee function, not here
        Class.forName("NewClass");  // if class not found then throws classnotfoundexception
    }
}

public class Exceptions {
    static {
        System.out.println("Class Loaded");
    }
    public static void main (String args[]) {
        // normal statement
        int i = 20;

        // Critical statement
        // int j = 18 / i;

        int j = 0;
        // int arr[] = new int[5];
        // // put critical statements in the try block
        // try {
        //     j = 10 / i; // throw / by zero exception
        //     System.out.println(arr[1]);
        //     System.out.println(arr[5]);
        // }
        // // catch(Exception e) {
        // //     System.out.println("Something went wrong..." + e);
        // // }
        // // can have multiple catch block
        // catch(ArithmeticException e) {
        //     System.out.println("Cannot divide by 0");
        // }
        // catch(ArrayIndexOutOfBoundsException e) {
        //     System.out.println("Stay in your limit");
        // }
        // catch(Exception e) {    // contains all exception, should be at the last
        //     System.out.println("Something went wrong..." + e);
        // }

        try {
            j = 18 / i;
            if (j == 0) {
                // throw creates new object of exception and catch will be called acco. to exception
                // throw new ArithmeticException("throwed exception");

                // custom exception
                throw new PranjalException("Pranjal Exception");
            }
        }
        catch(PranjalException e) {
            System.out.println("My expection: " + e);
        }
        catch(ArithmeticException e) {
            j = 18 / 1;
            System.out.println("default output" + e);
        }

        System.out.println(j);
        System.out.println("Bye");

        // throws
        A obj = new A();

        try {   // exception has to be handled here
            obj.show();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
