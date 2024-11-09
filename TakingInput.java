import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TakingInput {
    public static void main (String args[]) throws IOException {
        System.out.println("Enter a number: ");

        // int num = System.in.read(); // return ASCII value, not suitable
        // System.out.println(num);


        // one old way of taking input
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);

        // bf.readLine returns string thats why using Integer.parseInt to convert to int
        // int num = Integer.parseInt(bf.readLine());  
        // System.out.println(num);

        // new way of taking input
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // to take int
        System.out.println(num);

        // finally
        // runs irrespective of the exception found or not
        BufferedReader bf = null;
        try {
            bf = new BufferedReader(new InputStreamReader(System.in));
        }
        finally {   // mostly use to close any input, file, etc.
            bf.close();
        }

        // try with resources
        try (BufferedReader bff = new BufferedReader(new InputStreamReader(System.in))) {
            
        }
        // this way bff will be automatically closed
    }
}
