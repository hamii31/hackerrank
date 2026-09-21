import java.io.*;
import java.util.*;

public class StdinStdout1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstInteger = scanner.nextInt();
        int secondInteger = scanner.nextInt();
        int thirdInteger = scanner.nextInt();
        
        System.out.println(firstInteger);
        System.out.println(secondInteger);
        System.out.println(thirdInteger);
    }
}
