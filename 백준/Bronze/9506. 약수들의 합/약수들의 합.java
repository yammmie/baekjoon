import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder("");
        
        while(true) {
            int n = Integer.parseInt(br.readLine());
            
            if(n == -1)
                break;
            
            ArrayList<Integer> multiples = new ArrayList<>();
            int sum = 0;
            
            for(int i = 1; i <= n; i++) {
                if(n % i == 0 && i != n) {
                    multiples.add(i);
                    sum += i;
                }
            }
            
            if(n == sum) {
                sb.append(n + " = ");
                
                for(Integer multiple : multiples) {
                    if(multiple == 1)
                        sb.append(multiple);
                    else
                        sb.append(" + " + multiple);
                }   
                
                sb.append("\n");
            } else
                sb.append(n + " is NOT perfect.\n");
        }
        
        System.out.println(sb);
    }
}