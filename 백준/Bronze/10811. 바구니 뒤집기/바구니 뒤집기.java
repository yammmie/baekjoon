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
        
        for(int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }
        
        for(int x = 0; x < m; x++) {
            st = new StringTokenizer(br.readLine(), " ");
            
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            
            while(i < j) {
                int tmp = nums[i-1];
                nums[i-1] = nums[j-1];
                nums[j-1] = tmp;
                
                i++;
                j--;
            }
        }
        
        for(int i = 0; i < nums.length; i++) {
            bw.write(nums[i] + " ");
        }
        
        bw.write("\n");

        bw.flush();
        bw.close();
    }
}