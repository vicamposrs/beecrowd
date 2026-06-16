// 02-02-2026
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String [] args) throws IOException {
        // ler valores a, b ,c
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double a,b,c;
        String []linha = reader.readLine().split(" ");
        a = Double.parseDouble(linha[0]);
        b = Double.parseDouble(linha[1]);
        c = Double.parseDouble(linha[2]);

        //calcular delta
        double delta = b*b - 4*a*c;

        // verificar se existe raizes

        if(delta < 0 || a == 0){
            System.out.println("Impossivel calcular");
            return;
        }

        //calcular raizes

        double x1, x2;

        x1 = (-b + Math.sqrt(delta))/(2*a);
        x2 = (-b - Math.sqrt(delta))/(2*a);

        //mostrar

        System.out.printf("R1 = %.5f\n",x1);
        System.out.printf("R2 = %.5f\n",x2);
    }
}