import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();

        int N = Integer.parseInt(in.readLine());

        for(int i = 0; i < N; i++){
            String line = in.readLine();
            char [][] parts = new char[2][];
            parts[0] = line.substring(0, line.length()/2).toCharArray();     
            parts[1] = line.substring(line.length()/2).toCharArray();
            for(char[] part : parts){
                StringBuilder a = new StringBuilder();
                for(int j = 0; j < part.length; j++)
                    a.append(part[j]);
                output.append(a.reverse());
            }
            output.append("\n");
        }
        System.out.print(output);
    }
    
}