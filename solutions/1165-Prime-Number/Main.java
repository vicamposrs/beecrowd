import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();

        int N =  Integer.parseInt(in.readLine());
        
        for(int i = 0; i < N; i++){

            int X = Integer.parseInt(in.readLine());
            boolean isPrime = true;

            for(int j = 2; j <= (int)Math.sqrt(X);j++){
                if(X%j == 0) isPrime = false;
            }
            
            output.append(X);
            if(isPrime) output.append(" eh primo\n");
            else output.append(" nao eh primo\n");
        }
        System.out.print(output);
    }
}