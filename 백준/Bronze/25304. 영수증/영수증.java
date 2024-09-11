import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int items[][] = new int[n][2]; 
        StringTokenizer st;
        
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            items[i][0] = Integer.parseInt(st.nextToken());
            items[i][1] = Integer.parseInt(st.nextToken());
        }
        
        int itemsSum = 0;
        
        for(int i = 0; i < items.length; i++) {
            itemsSum += items[i][0] * items[i][1];
        }
        
        if(itemsSum == total)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}