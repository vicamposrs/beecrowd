import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int [] sequencia = new int[N];

        for(int i = 0; i < N ; i++) sequencia[i] = sc.nextInt();

        int numAtual = sequencia[0];
        int maxNumerosMarcados = 1;
        for(int i = 1; i < N ; i++){
            if(sequencia[i] != numAtual){
                maxNumerosMarcados++;
                numAtual = sequencia[i];
            }
        }
        System.out.println(maxNumerosMarcados);
        sc.close();
    }
 
}