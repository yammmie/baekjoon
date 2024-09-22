import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int nums[] = new int[30];
        
        for(int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }
        
        for(int i = 0; i < 28; i++) {
            int n = Integer.parseInt(br.readLine());
            
            nums[n-1] = 0;
        }
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0)
                bw.write(nums[i] + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}