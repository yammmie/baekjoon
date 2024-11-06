import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int cnt = 0;

        while(st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            
            if(num == 1)
                continue;
            
            int tmp = 0;
            
            for(int i = 1; i <= num; i++) {
                if(num % i == 0)
                    tmp++;
            }
            
            if(tmp == 2)
                cnt++;
        }
        
        System.out.println(cnt);
    }
}