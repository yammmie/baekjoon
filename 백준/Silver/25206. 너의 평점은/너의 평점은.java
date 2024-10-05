import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        double sum = 0.0;
        double gradeTotal = 0.0;

        for(int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            st.nextToken();

            double grade = Double.parseDouble(st.nextToken());
            double level = 0.0;

            switch(st.nextToken()) {
                case "A+":
                    level = 4.5;
                    break;
                case "A0":
                    level = 4.0;
                    break;
                case "B+":
                    level = 3.5;
                    break;
                case "B0":
                    level = 3.0;
                    break;
                case "C+":
                    level = 2.5;
                    break;
                case "C0":
                    level = 2.0;
                    break;
                case "D+":
                    level = 1.5;
                    break;
                case "D0":
                    level = 1.0;
                    break;
                case "F":
                    level = 0.0;
                    break;
                case "P":
                    continue;
            }

            gradeTotal += grade;
            sum += (grade * level);
        }

        System.out.println(sum / gradeTotal);
    }
}