import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        long [] fib = new long[61];
        fib[0] = 0;
        fib[1] = 1;
        for(int i = 2;i < 61; i++)
            fib[i] = fib[i-1] + fib[i-2];

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();
        int T = Integer.parseInt(in.readLine());

        for(int i = 0; i < T; i++){
            int N = Integer.parseInt(in.readLine());
            output.append("Fib(%d) = %d\n".formatted(N, fib[N]));
        }
        System.out.print(output);
    }
}