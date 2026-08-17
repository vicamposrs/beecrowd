import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main2 {

    private static final BigInteger[] FAT = new BigInteger[21];

    public static void main(String[] args) throws IOException {

        preCalcularFatoriais();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linha;

        while ((linha = br.readLine()) != null) {
            String[] partes = linha.split(" ");
            int m = Integer.parseInt(partes[0]);
            int n = Integer.parseInt(partes[1]);

            BigInteger soma = FAT[m].add(FAT[n]);
            System.out.println(soma);
        }
    }

    private static void preCalcularFatoriais() {
        FAT[0] = BigInteger.ONE;
        for (int i = 1; i <= 20; i++) {
            FAT[i] = FAT[i - 1].multiply(BigInteger.valueOf(i));
        }
    }
}