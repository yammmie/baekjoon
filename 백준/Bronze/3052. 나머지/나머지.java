import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        boolean chks[] = new boolean[42];
        
        for(int i = 0; i < 10; i++) {
            int n = Integer.parseInt(br.readLine());
            
            chks[n % 42] = true;
        }
        
        int cnt = 0;
        
        for(boolean chk : chks) {
            if(chk)
                cnt++;
        }
        
        System.out.println(cnt);
    }
}