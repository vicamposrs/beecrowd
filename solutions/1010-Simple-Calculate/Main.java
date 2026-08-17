//05-02-2026
import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        final int QUANTIDADE_DE_PRODUTOS = 2;

        int [] code = new int[QUANTIDADE_DE_PRODUTOS];
        int [] quantidade = new int[QUANTIDADE_DE_PRODUTOS];
        double [] precoUnitario = new double[QUANTIDADE_DE_PRODUTOS];

        double valorTotal = 0;
        //ler valores
        for(int i = 0;i < QUANTIDADE_DE_PRODUTOS ; i++){
            code[i] = sc.nextInt();
            quantidade[i] = sc.nextInt();
            precoUnitario[i] = sc.nextDouble();
            //multiplicar quantidade por preço
            //somar os produtos
            valorTotal += quantidade[i] * precoUnitario[i];
        }
        //exbir
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",valorTotal);
        sc.close();
    }
 
}