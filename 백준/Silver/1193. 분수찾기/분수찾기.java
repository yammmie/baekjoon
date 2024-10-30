import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int x = Integer.parseInt(br.readLine());
        
        int cnt = 1, sum = 0;
        
        while(true) {
            if(x <= sum + cnt) {
                if(cnt % 2 == 1) {
                    System.out.println((cnt - (x - sum - 1)) + "/" + (x - sum));
                    break;
                }
                else {
                    System.out.println((x - sum) + "/" + (cnt - (x - sum - 1)));
                    break;
                }
            } else {
                sum += cnt;
                cnt++;
            }
        }
    }
}