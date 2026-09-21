import java.io.*;
import java.util.*;

public class DataTypes {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bufferedReader.readLine().trim());
        
        for(int i = 0; i < T; i++) {
            String s = bufferedReader.readLine().trim();
            
            // Try to convert to long first
            try {
                long n = Long.parseLong(s);
                
            } catch (NumberFormatException e) {
                System.out.println(s + " can't be fitted anywhere.");
                continue;
            }
            
            // Try to convert to Int after Long
            try {
                int n = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println(s + " can be fitted in:");
                System.out.println("* long");
                continue;
            }
            
            // Try a Short conversion next
            try {
                short n = Short.parseShort(s);
            } catch (NumberFormatException e) {
                System.out.println(s + " can be fitted in:");
                System.out.println("* int");
                System.out.println("* long");
                continue;
            }
            
            // Finally, try a Byte conversion
            try {
                byte n = Byte.parseByte(s);
            } catch (NumberFormatException e) {
                System.out.println(s + " can be fitted in:");
                System.out.println("* short");
                System.out.println("* int");
                System.out.println("* long");
                continue;
            }
            
            // If it passes all try-catch blocks, it fits in all of the dataTypes
            System.out.println(s + " can be fitted in:");
            System.out.println("* byte");
            System.out.println("* short");
            System.out.println("* int");
            System.out.println("* long");
        }
        
        bufferedReader.close();
    }
}
