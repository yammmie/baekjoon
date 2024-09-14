import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int num = Integer.parseInt(br.readLine());
        int a = 0;
        int b = 0;
        
        for(int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            
            sb.append("Case #").append(i + 1).append(": ")
                .append(a + " + " + b + " = ")
                .append((a + b) + "\n");
        }
        
        System.out.println(sb);
    }
}