import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WithSubstring {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();

        int N = Integer.parseInt(in.readLine());

        for(int i = 0; i < N; i++){
            String line = in.readLine();
            output.append(new StringBuilder(line.substring(0,line.length()/2)).reverse());
            output.append(new StringBuilder(line.substring(line.length()/2)).reverse());
            output.append("\n");
        }
        System.out.print(output);
    }
}
