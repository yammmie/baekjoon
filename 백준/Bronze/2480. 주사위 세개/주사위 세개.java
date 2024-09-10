import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        
        int prize = 0;
        
        if(a != b && a != c && b != c) {
            int max = 0;
            
            if(a > b) {
                if(a > c)
                    max = a;
                else  // c > a > b
                    max = c;
            } else {  // a < b
                if(b > c)
                    max = b;
                else  // c > b > a
                    max = c;
            }
            
            prize = max * 100;
        } else {
            if(a == b && b == c)
                prize = 10000 + (a * 1000);
            else {
                int tmp = 0;

                if(a == b || a == c)
                    tmp = a;
                else
                    tmp = b;
                    
                prize = 1000 + (tmp * 100);
            }
        }
        
        System.out.println(prize);
    }
}