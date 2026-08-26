import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        double salary = Double.parseDouble(in.readLine());
        String resultado;

        if(salary <= 2000.0) resultado = "Isento";
        else if(salary <= 3000.0)
            resultado = "R$ %.2f".formatted((salary - 2000)*0.08);
        else if(salary <=4500.0)
            resultado = "R$ %.2f".formatted((salary - 3000)*0.18 + 80);
        else /* salary > 4500 */
            resultado = "R$ %.2f".formatted((salary - 4500)*0.28 + 350);

        System.out.println(resultado);
    }
}