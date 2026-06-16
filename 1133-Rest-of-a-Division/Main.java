import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        // recebe dois números
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(rd.readLine());
        int Y = Integer.parseInt(rd.readLine());

        // colocar em osdem crescente
        if(X > Y){
            int temp = X;
            X = Y;
            Y = temp;
        }

        // printa numeros no intervalo entre os dois que satifazem a regra
        // reto da divisão por 5 = 2 ou 3
        X++;
        while(X < Y){
            if( X%5 == 2 || X%5 == 3) System.out.println(X);
            X++;
        }
    }
}