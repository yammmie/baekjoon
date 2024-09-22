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
        
        for(int k = 0; k < nums.length; k++) {
            nums[k] = k + 1;
        }
        
        for(int k = 0; k < m; k++) {
            st = new StringTokenizer(br.readLine(), " ");
            
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            
            int tmp = nums[j-1];
            nums[j-1] = nums[i-1];
            nums[i-1] = tmp;
        }
        
        for(int k = 0; k < nums.length; k++) {
            bw.write(nums[k] + " ");
        }
        
        bw.write("\n");
        
        bw.flush();
        bw.close();
    }
}