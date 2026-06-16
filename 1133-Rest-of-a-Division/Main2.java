import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2{
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
        if(X%5 == 3){
            System.out.println(X);
            X += 4;
        } 
        while(X%5 != 2)X++;
        while(X < Y){
            System.out.println(X);
            if(X+1 < Y) System.out.println(X + 1);
            X += 5;
        }
    }
}