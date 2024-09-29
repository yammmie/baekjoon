import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int alphabets[] = new int[26];
        
        for(int i = 0; i < alphabet.length; i++) {
            alphabets[i] = -1;
        }
        
        String str = br.readLine();
        
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if(alphabets[ch - 'a'] == -1)
                alphabets[ch - 'a'] = i;
        }
        
        for(int alphabet : alphabet) {
            sb.append(alphabet + " ");
        }
        
        sb.append("\n");
        
        System.out.println(sb);
    }
}
