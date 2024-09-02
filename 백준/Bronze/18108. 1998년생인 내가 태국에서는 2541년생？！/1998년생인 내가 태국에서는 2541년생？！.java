import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int year = Integer.parseInt(str);
        int term = 543;
        
        System.out.println(year - term);
    }
}