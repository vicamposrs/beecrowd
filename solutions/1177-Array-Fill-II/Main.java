import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();
        int T = Integer.parseInt(in.readLine());

        for(int i = 0; i < 1000; i++){
            int N = i%T;
            output.append("N[").append(i)
            .append("] = ").append(N)
            .append("\n");
        }
        System.out.print(output);
    }
}