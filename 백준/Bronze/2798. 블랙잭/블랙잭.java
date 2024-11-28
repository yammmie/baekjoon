import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int[] nums = new int[n];
        st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        
        System.out.println(searchNum(nums, n, m));
    }
    
    static int searchNum(int[] nums, int n, int m) {
        int result = 0;
        
        for(int i = 0; i < n - 2; i++) {
            for(int j = i + 1; j < n - 1; j++) {
                for(int k = j + 1; k < n; k++) {
                    int temp = nums[i] + nums[j] + nums[k];
                    
                    if(temp == m)
                        return temp;
                    
                    if(temp < m && result < temp)
                        result = temp;
                }
            }
        }
        
        return result;
    }
}