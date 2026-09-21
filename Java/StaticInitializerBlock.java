import java.io.*;
import java.util.*;

public class StaticInitializerBlock {
        
    static {
        Scanner input = new Scanner(System.in);
        int B = input.nextInt();
        int H = input.nextInt();
        
        if (B > 0 && H > 0) {
            System.out.println(B * H);
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
