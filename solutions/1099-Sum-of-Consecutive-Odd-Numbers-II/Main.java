import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(in.readLine());
        String []line = new String[2];
        StringBuilder output = new StringBuilder();

        for(int i = 0 ; i < N ; i++){
            int X,Y;
            int soma = 0;
            //le os valores X e Y
            line = in.readLine().split(" ");
            X = Integer.parseInt(line[0]);
            Y = Integer.parseInt(line[1]);
            // garante que X seja o menor
            if(X > Y){
                int temp = X;
                X = Y;
                Y = temp;
            }
            // garante que o valor inicial seja o proximo impar de X
            X++;
            if(X%2 == 0) X++;
            // soma os impares
            for(int j = X; j < Y ; j+=2) soma +=j;
            // aadiciona na saida
            output.append(soma).append("\n");
        }
        System.out.print(output);
    }
}