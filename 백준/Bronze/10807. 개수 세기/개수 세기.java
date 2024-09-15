import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int key = Integer.parseInt(br.readLine());
        
        String strs[] = str.split(" ");
        int nums[] = new int[strs.length];
        int sum = 0;
        
        for(int i = 0; i < strs.length; i++) {
            nums[i] = Integer.parseInt(strs[i]);
        }
        
        for(int n : nums) {
            if(n == key)
                sum++;
        }
        
        System.out.println(sum);
    }
}