import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> angles = new ArrayList<>();
        
        angles.add(Integer.parseInt(br.readLine()));
        angles.add(Integer.parseInt(br.readLine()));
        angles.add(Integer.parseInt(br.readLine()));
        
        if((angles.get(0) + angles.get(1) + angles.get(2)) == 180) {
            HashSet<Integer> anglesSet = new HashSet<>(angles);
            
            if(anglesSet.size() == 1)
                System.out.println("Equilateral");
            else if(anglesSet.size() == 2)
                System.out.println("Isosceles");
            else
                System.out.println("Scalene");
        } else
            System.out.println("Error");
    }
}