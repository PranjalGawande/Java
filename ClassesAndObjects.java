class Calculator {
    int a;
    public int add(int n1, int n2) {
        int r = n1 + n2;
        return r;
    }
}

public class ClassesAndObjects {
    public static void main(String args[]) {
        int num1 = 3;
        int num2 = 5;

        Calculator obj = new Calculator();
        int ans = obj.add(num1, num2);
        System.out.println(ans);
    }
}
