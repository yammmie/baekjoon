import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i <= n; i++) {
            for(int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }

            for(int k = 1; k < i * 2; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for(int i = 1; i < n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            for(int k = 1; k <= ((n - i) * 2) - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}