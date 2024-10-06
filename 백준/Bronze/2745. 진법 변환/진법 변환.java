import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());
        
        int exp = 0;
        int sum = 0;
        
        for(int i = n.length() - 1; i >= 0; i--) {
            char ch = n.charAt(i);
            int tmp = 0;
            
            if('A' <= ch && ch <= 'Z')
                tmp = (ch - 'A' + 10);
            else
                tmp = (ch - '0');
            
            sum += tmp * Math.pow(b, exp);
            exp++;
        }
        
        System.out.println(sum);
    }
}