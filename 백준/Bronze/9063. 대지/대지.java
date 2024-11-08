import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        
        int x_min = Integer.MAX_VALUE;
        int x_max = Integer.MIN_VALUE;
        int y_min = Integer.MAX_VALUE;
        int y_max = Integer.MIN_VALUE;
        
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            
            x_min = Math.min(x_min, x);
            x_max = Math.max(x_max, x);
            y_min = Math.min(y_min, y);
            y_max = Math.max(y_max, y);
        }
        
        System.out.println((x_max - x_min) * (y_max - y_min));
    }
}