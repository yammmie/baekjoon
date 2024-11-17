import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        
        int max = Math.max(a, Math.max(b, c));
        
        
        if(max < (a + b + c) - max)
            System.out.println(a + b + c);
        else
            // 가장 긴 막대 max를 max 제외 두 막대 더한 값 - 1만큼 줄여야 함
            // 둘레: max 제외한 두 막대 더한 값 + (max 제외한 두 막대 더한 값 - 1)
            System.out.println(((a + b + c) - max) * 2 - 1);
    }
}