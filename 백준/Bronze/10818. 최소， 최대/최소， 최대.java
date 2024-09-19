import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        
        int nums[] = new int[n];
        
        for(int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(nums);
        
        bw.write(nums[0] + " " + nums[n-1]);
        bw.flush();
        bw.close();
    }
}