import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        
        int nums[] = new int[n];
        
        st = new StringTokenizer(br.readLine(), " ");
        
        for(int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
            
            if(nums[i] < x)
                bw.write(nums[i] + " ");
        }
        
        bw.flush();
        bw.close();
    }
}