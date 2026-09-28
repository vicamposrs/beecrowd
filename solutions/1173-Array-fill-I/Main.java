import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();

        int V = Integer.parseInt(in.readLine());

        for(int i = 0; i < 10;i++){
            output.append("N[%d] = %d\n".formatted(i,V));
            V *= 2;
        }
        System.out.print(output);
    }
}