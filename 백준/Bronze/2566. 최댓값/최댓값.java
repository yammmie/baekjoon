import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int matrix[][] = new int[9][9];

        int max = 0;
        int x = 0, y = 0;

        for(int i = 0; i < matrix.length; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            for(int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());

                if(max < matrix[i][j]) {
                    max = matrix[i][j];
                    x = i;
                    y = j;
                }
            }
        }

        bw.write(max + "\n" + (x + 1) + " " + (y + 1));

        bw.flush();
        bw.close();
    }
}