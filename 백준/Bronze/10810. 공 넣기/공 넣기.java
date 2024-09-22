import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int nums[] = new int[n];
        
        for(int x = 0; x < nums.length; x++) {
            nums[x] = 0;
        }
        
        for(int x = 0; x < m; x++) {
            st = new StringTokenizer(br.readLine(), " ");
            
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            
            for(int y = i - 1; y < j; y++) {
                nums[y] = k;
            }
        }
        
        for(int x = 0; x < nums.length; x++) {
            bw.write(nums[x] + " ");
        }
        
        bw.write("\n");
        
        bw.flush();
        bw.close();
    }
}
