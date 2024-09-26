import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int arrs[] = new int[26];
        
        for(int i = 0; i < arrs.length; i++) {
            arrs[i] = -1;
        }
        
        String str = br.readLine();
        
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if(arrs[ch - 'a'] == -1)
                arrs[ch - 'a'] = i;
        }
        
        for(int arr : arrs) {
            sb.append(arr + " ");
        }
        
        sb.append("\n");
        
        System.out.println(sb);
    }
}