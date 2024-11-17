import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        while(true) {
            st = new StringTokenizer(br.readLine(), " ");
            
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            
            if(a == 0 && b == 0 && c == 0)
                break;
            
            int max = Math.max(a, Math.max(b, c));
            
            if(max < (a + b + c) - max) {
                if(a == b && b == c)
                    System.out.println("Equilateral");
                else if(a == b || b == c || a == c)
                    System.out.println("Isosceles");
                else
                    System.out.println("Scalene");
            } else
                System.out.println("Invalid");
        }
    }
}