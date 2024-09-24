import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < n; i++) {
            String str = br.readLine();
            
            sb.append(str.charAt(0));
            sb.append(str.charAt(str.length()-1) + "\n");
        }
        
        System.out.println(sb);
    }
}