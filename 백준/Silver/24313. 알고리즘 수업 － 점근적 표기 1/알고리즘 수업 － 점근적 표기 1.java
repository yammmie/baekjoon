import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        
        // 0 ≤ |ai| ≤ 100 => 절대값, a1과 a0이 음수일 수 있음
        // a0이 음수인 경우 a1와 c 값 비교 필요
        if(((a1 * n) + a0) <= (c * n) && a1 <= c)
            System.out.println(1);
        else
            System.out.println(0);
    }
}