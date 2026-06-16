import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String [] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String linha []= reader.readLine().split(" ");
        float x = Float.parseFloat(linha[0]);
        float y = Float.parseFloat(linha[1]);

        if(x == 0 && y == 0){
            System.out.println("Origem");
            return;
        }
        if(x == 0 ) {
            System.out.println("Eixo Y");
            return;
        }
        if(y == 0 ) {
            System.out.println("Eixo X");
            return;
        }

        if(y > 0){
            if(x > 0) System.out.println("Q1");
            else System.out.println("Q2");
        }
        else{
            if(x < 0 ) System.out.println("Q3");
            else System.out.println("Q4");
        }

    }
}