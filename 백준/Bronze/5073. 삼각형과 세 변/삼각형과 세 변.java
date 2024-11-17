import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        ArrayList<Integer> angles = new ArrayList<>();
        
        while(true) {
            st = new StringTokenizer(br.readLine(), " ");
            
            angles.clear();
            angles.add(Integer.parseInt(st.nextToken()));
            angles.add(Integer.parseInt(st.nextToken()));
            angles.add(Integer.parseInt(st.nextToken()));
            
            if(angles.get(0) == 0 && angles.get(1) == 0 && angles.get(2) == 0)
                break;
            
            Collections.sort(angles);
            
            if(angles.get(2) < angles.get(0) + angles.get(1)) {
                HashSet<Integer> anglesSet = new HashSet<>(angles);
                
                if(anglesSet.size() == 1)
                    System.out.println("Equilateral");
                else if(anglesSet.size() == 2)
                    System.out.println("Isosceles");
                else
                    System.out.println("Scalene");
            } else
                System.out.println("Invalid");
        }
    }
}