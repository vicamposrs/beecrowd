import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
        Locale.setDefault(Locale.US);

        String nome = in.readLine();
        double salarioFixo = Double.parseDouble(in.readLine());
        double valorVendido = Double.parseDouble(in.readLine());

        double salarioTotal = salarioFixo + 0.15 * valorVendido;

        System.out.printf("TOTAL = R$ %.2f\n",salarioTotal);
        in.close();
    }
}