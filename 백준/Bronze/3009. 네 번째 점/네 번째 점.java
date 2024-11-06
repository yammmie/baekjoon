import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int coord_x[] = new int[3];
        int coord_y[] = new int[3];
        
        for(int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            
            coord_x[i] = Integer.parseInt(st.nextToken());
            coord_y[i] = Integer.parseInt(st.nextToken());
        }
        
        int x = 0, y = 0;
        
        if(coord_x[0] == coord_x[1])
            x = coord_x[2];
        else
            x = coord_x[0] == coord_x[2] ? coord_x[1] : coord_x[0];
        
        if(coord_y[0] == coord_y[1])
            y = coord_y[2];
        else
            y = coord_y[0] == coord_y[2] ? coord_y[1] : coord_y[0];
        
        System.out.println(x + " " + y);
    }
}