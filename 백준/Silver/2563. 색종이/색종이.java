import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        
        boolean matrix[][] = new boolean[100][100];
        int cnt = 0;
        
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;
            
            for(int j = x; j < x + 10; j++) {
                for(int k = y; k < y + 10; k++) {
                    if(!matrix[j][k]) {
                        matrix[j][k] = true;
                        cnt++;
                    }
                }
            }
        }
        
        System.out.println(cnt);
    }
}