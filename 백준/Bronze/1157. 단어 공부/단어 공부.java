import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int alphabets[] = new int[26];
        String str = br.readLine().toUpperCase();
        
        for(int i = 0; i < alphabets.length; i++) {
            alphabets[i] = 0;
        }
        
        for(int i = 0; i < str.length(); i++) {
            alphabets[str.charAt(i) - 'A']++;
        }
        
        int max = 0;
        char ch = ' ';
        
        for(int i = 0; i < alphabets.length; i++) {
            if(alphabets[i] > max) {
                max = alphabets[i];
                ch = (char)(i + 'A');
            } else if(alphabets[i] == max)
                ch = '?';
        }
        
        System.out.println(ch);
    }
}