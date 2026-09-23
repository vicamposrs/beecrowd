import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();

        String [] line = in.readLine().split(" ");
        char D;
        String N;

        while(!line[0].equals("0") || !line[1].equals("0")){
            D = line[0].charAt(0);
            N = line[1];

            StringBuilder result = new StringBuilder();
            boolean removeZeros = true;

            for(char c : N.toCharArray()){
                if(removeZeros && c == '0')continue;
                if(c == D)continue;
                result.append(c);
                removeZeros = false;
            }
            if(result.isEmpty()) result.append("0");

            output.append(result).append("\n");
            line = in.readLine().split(" ");
        }
        System.out.print(output);
    }
}