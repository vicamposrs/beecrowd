import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String []line;
        StringBuilder output = new StringBuilder();
        // lê quantidade de pares que serão lidos
        int N = Integer.parseInt(in.readLine());
        // lê par
        for(int i = 0; i < N;i++){
            line = in.readLine().split(" ");
            double X = Double.parseDouble(line[0]);
            int Y = Integer.parseInt(line[1]);
            // se possivel divide e guarda
            if(Y == 0){
                output.append("divisao impossivel\n");
                continue;
            }

            double result = X/Y;
            output.append("%.1f\n".formatted(result));
        }
        //Imprime tudo
        System.out.print(output);
    }
 
}