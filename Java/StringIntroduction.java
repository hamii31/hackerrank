import java.io.*;
import java.util.*;

public class StringIntroduction {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        String A = input.nextLine();
        String B = input.nextLine();
        
        // Sum Lengths
        System.out.println(A.length() + B.length());
        
        // Check lexicographical dominance
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
        
        // Print capitalized
        A = A.substring(0, 1).toUpperCase() + A.substring(1);
        B = B.substring(0, 1).toUpperCase() + B.substring(1);
        
        System.out.println(A + " " + B);
    }
}
