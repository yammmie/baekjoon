import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 1;
        int room = 1;
        
        if(n == 1)
            System.out.println(cnt);
        else {
            while(room < n) {
                room += cnt * 6;
                cnt++;
            }
            
            System.out.println(cnt);
        }
    }
}