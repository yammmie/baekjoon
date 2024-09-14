import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int a = 0;
        int b = 0;
        
        while(true) {
            st = new StringTokenizer(br.readLine(), " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            
            // do while(a != 0 && b != 0)의 경우
            // 첫 반복문부터 0 0을 입력하면 sb에 0이 추가되어 출력되기 때문
            if(a == 0 && b == 0)
                break;
            
            sb.append((a + b) + "\n");
        }
        
        System.out.println(sb);
    }
}