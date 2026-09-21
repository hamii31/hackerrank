import java.io.*;
import java.util.*;

public class IntToString {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String s = Integer.toString(n);
        
        // Check if the conversion was successfull
        if (s.getClass().getName() == "java.lang.String") {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");  
        }
    }
}
