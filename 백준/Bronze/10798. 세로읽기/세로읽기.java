import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int m = 15;
        char matrix[][] = new char[5][m];
        
        for(int i = 0; i < matrix.length; i++) {
            String str = br.readLine();
            
            for(int j = 0; j < str.length(); j++) {
                matrix[i][j] = str.charAt(j);
            }
        }
        
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < matrix.length; j++) {
                if(matrix[j][i] == '\0')
                    continue;
                
                bw.write(matrix[j][i]);
            }
        }
        
        bw.flush();
        bw.close();
    }
}