// lambda expr only works with Funcional interface
// Function interface can contain only one method
@FunctionalInterface
interface A {
    int show(int i, int j);
}

public class LambdaExpression {
    public static void main(String args[]) {
        // normal anonymous inner class
        // A obj = new A() {
        // public void show() {
        // System.out.println("in show");
        // }
        // };

        // lambda expr, remove from new to show and add -> after ()
        // A obj = () -> { System.out.println("in show"); };

        // can remove {} if only one statement
        // A obj = () -> System.out.println("in show");

        // if taking 1 input can remove () also
        // A obj = i -> System.out.println("in show");

        // if taking 2 input then () is needed

        // how to return
        // A obj = (i, j) -> return i+j;    // Error, can't use return
        A obj = (i, j) -> i+j;  // return i + j, by defauld returns

        // obj.show();
        // obj.show(4);
        int result = obj.show(4, 5);
        System.out.println(result);
    }
}
