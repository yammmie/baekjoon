import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        
        if(90 <= num)
            System.out.println("A");
        else if(80 <= num)
            System.out.println("B");
        else if(70 <= num)
            System.out.println("C");
        else if(60 <= num)
            System.out.println("D");
        else
            System.out.println("F");
    }
}