import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        double num;
        String resultado = "";
        for(int i = 0; i < 100; i++){
            num = Double.parseDouble(in.readLine());
            if(num <= 10.0){
                resultado += "A[%d] = %.1f\n".formatted(i,num);
            }
        }
        System.out.print(resultado);
        in.close();
    }
}