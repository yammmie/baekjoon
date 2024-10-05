import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for(int i = 0; i < n; i++) {
            String str = br.readLine();

            if(wordCheck(str))
                cnt++;
        }

        System.out.println(cnt);
    }

    public static boolean wordCheck(String str) {
        boolean alphabets[] = new boolean[26];
        char prevCh = ' ';

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(ch != prevCh) {
                if(alphabets[ch - 'a'])
                    return false;
                else {
                    alphabets[ch - 'a'] = true;
                    prevCh = ch;
                }
            }
        }

        return true;
    }
}
