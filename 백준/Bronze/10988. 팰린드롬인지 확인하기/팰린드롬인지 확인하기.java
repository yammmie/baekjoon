import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        int chk = 1;
        
        for(int i = 0; i < str.length() / 2; i++) {
            if(str.charAt(i) != str.charAt((str.length() - 1) - i))
               chk = 0;
        }

        System.out.println(chk);
    }
}