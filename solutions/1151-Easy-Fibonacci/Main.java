import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringJoiner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringJoiner output = new StringJoiner(" ");
        int N = Integer.parseInt(in.readLine());

        int fib = 1;
        int ant = -1;
        int temp = 0;
        for(int i = 0 ; i < N; i++){
            temp = fib + ant;
            ant = fib;
            fib = temp;
            output.add(fib + "");
        }
        System.out.println(output);
 
    }
 
}