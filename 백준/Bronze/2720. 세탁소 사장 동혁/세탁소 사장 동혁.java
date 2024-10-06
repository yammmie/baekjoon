import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(br.readLine());
        int coins[] = { 25, 10, 5, 1 };
        
        for(int i = 0; i < t; i++) {
            int c = Integer.parseInt(br.readLine());
            
            for(int j = 0; j < coins.length; j++) {
                bw.write(c / coins[j] + " ");
                c %= coins[j];
            }
            
            bw.write("\n");
        }
        
        bw.flush();
        bw.close();
    }
}