import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();

        for(int i = 0; i < 10;i++){
            int num = Integer.parseInt(in.readLine());
            if(num < 1) num = 1;
            String text = "X[%d] = %d\n".formatted(i,num);
            output.append(text);
        }
        System.out.println(output);
    }
}