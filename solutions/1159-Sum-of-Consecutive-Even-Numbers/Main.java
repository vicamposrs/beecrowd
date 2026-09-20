import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();


        while(true){
            int X = Integer.parseInt(in.readLine());
            if(X == 0) break;
            if(X%2  != 0) X++;
            // X + (X + 2) + (X + 4) + (X + 6) + (X + 7)
            // 5X + 2  + 4 + 6 + 8
            int sum = 5*X + 20;
            output.append(sum).append("\n");
        }

        System.out.print(output);
    }
 
}