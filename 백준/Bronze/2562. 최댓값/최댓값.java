import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int nums[] = new int[9];
        
        for(int i = 0; i < 9; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }
        
        int max = 0;
        int index = 0;
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > max) {
                max = nums[i];
                index = i + 1;
            }
        }
        
        bw.write(max + "\n" + index);

        bw.flush();
        bw.close();
    }
}