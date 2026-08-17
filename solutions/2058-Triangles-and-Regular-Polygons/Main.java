import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int numeroDeLados = Integer.parseInt(reader.readLine());
        //*int numeroDeTriangulos = numeroDeLados - 2;
        //*System.out.println(numeroDeTriangulos);
        System.out.println(numeroDeLados - 2);

        reader.close();
    }
}