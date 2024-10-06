import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        while(0 < n) {
            int tmp = 0;
            
            if(n % b < 10)
                tmp = (n % b) + '0';
            else
                tmp = (n % b) + 'A' - 10;
            
            sb.append((char)tmp);
            n /= b;
        }
        
        System.out.println(sb.reverse());
    }
}
