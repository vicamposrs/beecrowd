import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder output = new StringBuilder();

        int N = Integer.parseInt(in.readLine());

        for(int i = 0; i < N; i++){
            int X = Integer.parseInt(in.readLine());
            int divisorsSum  = 0;

            for(int j = 1; j <= X/2;j++){
                if(X%j == 0) divisorsSum += j;
            }

            output.append(X);
            if(divisorsSum  == X) output.append(" eh perfeito\n");
            else output.append("nao eh perfeito\n");
        }

        System.out.print(output);

    }
}
