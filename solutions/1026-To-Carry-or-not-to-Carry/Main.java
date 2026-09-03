import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;

        StringBuilder output = new StringBuilder();
        
        while ((line = in.readLine()) != null) {
            long a = (Long.parseLong(line.split(" ")[0]));
            long b = (Long.parseLong(line.split(" ")[1]));

            output.append(a^b).append("\n");
        }
        System.out.print(output);
    }
}