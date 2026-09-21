import java.io.*;
import java.util.*;

public class Loops2 {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        int q = Integer.parseInt(bufferedReader.readLine().trim());
        
        for(int i = 0; i < q; i++) {
            String s = bufferedReader.readLine().trim();
            String[] arr = s.split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            int n = Integer.parseInt(arr[2]);
            
            int res = a + (int)Math.pow(2, 0) * b;
            System.out.print(res + " ");
            for(int j = 1; j < n; j++) {
                res += (int)Math.pow(2, j) * b;
                System.out.print(res + " ");
            }
            System.out.println();
        }
        
        bufferedReader.close();
    }
}
