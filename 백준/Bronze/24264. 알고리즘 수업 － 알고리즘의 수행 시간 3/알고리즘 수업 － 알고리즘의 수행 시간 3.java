import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Long n = Long.parseLong(br.readLine());
        
        // MenOfPassion 알고리즘: for문 2번 수행
        System.out.println(n * n);
        System.out.println(2);
    }
}