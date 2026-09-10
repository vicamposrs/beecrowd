import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String [] line;
        StringBuilder output = new StringBuilder();
        // enquanto tiver valores
        while(true){
            // le valores
            line = in.readLine().split(" ");
            int X = Integer.parseInt(line[0]);
            int Y = Integer.parseInt(line[1]);
            // verifica se tem algum nulo
            if(X == 0 || Y == 0) break;
            //determina quadrante
            if(Y > 0){
                if(X > 0) output.append("primeiro\n");
                else output.append("segundo\n");
            }
            else{
                if(X < 0) output.append("terceiro\n");
                else output.append("quarto\n");
            }
        }
        System.out.print(output);
            
    }
 
}