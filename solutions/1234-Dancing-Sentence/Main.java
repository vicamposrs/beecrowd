import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder output = new StringBuilder();
        String line;

        while((line = in.readLine()) != null){
            int stat = 1;
            for(char c : line.toCharArray()){
                if(c == ' '){
                    output.append(c);
                    continue;
                }
                if(stat == 1 && c >= 'a' && c <= 'z')
                    c -= 32;
                if(stat == 0 && c >= 'A' && c <= 'Z')
                    c += 32;
                output.append(c);
                stat = (stat +1)%2;
            }
            output.append("\n");
        }
        System.out.print(output);
    }
}