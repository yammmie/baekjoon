import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int num = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            sb.append("Case #")
                .append(i + 1)
                .append(": ")
                .append((Integer.parseInt(st.nextToken())) + (Integer.parseInt(st.nextToken())) + "\n");
        }
        
        System.out.println(sb);
    }
}