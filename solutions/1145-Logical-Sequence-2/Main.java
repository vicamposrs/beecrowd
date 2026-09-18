import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();

        String [] line = in.readLine().split(" ");
        
        int X = Integer.parseInt(line[0]);
        int Y = Integer.parseInt(line[1]);
        
        for(int i = 1;i < Y ;i++ ){
            output.append(i);
            
            if(i%X == 0)
              output.append("\n");
            else
              output.append(" ");
        }
        output.append(Y).append("\n");
        System.out.print(output);
    }
}