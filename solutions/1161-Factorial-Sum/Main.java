import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String [] args)throws IOException{
        // ler dois falores M , N até EOF (cada par por linha)
        Scanner sc = new Scanner(System.in);
        long M, N;
        ArrayList<Long> resultados = new ArrayList<>();

       
        for(int i = 0; sc.hasNext(); i++){
            M = sc.nextLong();
            N = sc.nextLong();
             // calcular seus fatoriais e soma-los
            resultados.add(fat(M) + fat(N));
        }

        // exibilos (cada par por linha)
        for (Long resultado : resultados) {
            System.out.println(resultado);
        }
        sc.close();
    }

    public static long fat(long n){
        long fatorial = 1;
        while( n > 1)
            fatorial *= n--;
        return fatorial;
    }
}