import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        
        if(minute < 45) {
            hour--;
            minute = 60 - (45 - minute);
            
            if(hour < 0)
                hour = 23;
        } else {
            minute -= 45;
        }
        
        System.out.println(hour + " " + minute);
    }
}