import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder output = new StringBuilder();

        int N = Integer.parseInt(in.readLine());

        for(int i = 0; i < N;i++){
            String [] line = in.readLine().split(" ");

            int X = Integer.parseInt(line[0]);
            int Y = Integer.parseInt(line[1]);

            if(X%2 == 0) X++;

            int sum = Y*(X+Y-1);
            output.append(sum).append("\n");
        }
        System.out.print(output);
    }
}