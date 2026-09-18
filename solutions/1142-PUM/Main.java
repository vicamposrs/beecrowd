import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();
        int N = Integer.parseInt(in.readLine());
        
        for(int i = 1; i < N*4;i += 4){
            for(int j = 0; j < 3;j++) 
                output.append(i + j).append(" ");
            output.append("PUM\n");
        }

        System.out.print(output);
    }
}