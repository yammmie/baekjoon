import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        br.readLine();
        int sum = 0;
        
        for(byte ch : br.readLine().getBytes()) {
            sum += ch - '0';
        }
        
        System.out.println(sum);
    } 
}