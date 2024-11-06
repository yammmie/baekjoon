import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        
        // 정상으로 올라간 후에는 미끄러지지 않으므로
        // 목표 길이 v에서 미끄러지는 길이 b를 미리 빼줌
        int day = (v - b) / (a - b);
        
        if((v - b) % (a - b) != 0)
            day++;
        
        System.out.println(day);
    }
}