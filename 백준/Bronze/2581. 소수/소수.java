import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        
        ArrayList<Integer> primes = new ArrayList<>();
        
        for(int i = m; i <= n; i++) {
            int cnt = 0;
            
            for(int j = 1; j <= i; j++) {
                if(i % j == 0)
                    cnt++;
            }
            
            if(cnt == 2)
                primes.add(i);
        }
        
        if(primes.size() == 0) {
            System.out.println(-1);
        } else {
            int sum = 0;
        
            for(Integer prime : primes)
                sum += prime;
        
                System.out.println(sum);
                System.out.println(primes.get(0));
        }
    }
}