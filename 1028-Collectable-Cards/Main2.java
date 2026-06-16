// 21-01-2026

import java.io.IOException;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) throws IOException  {

        Scanner sc = new Scanner(System.in);
        //ler os valores de vezes
        int quantidadeDeVezes = sc.nextInt();

        //ler dois valores para cada vez
        int [] mdc = new int[quantidadeDeVezes];
        int a,b;
        for(int i = 0; i < quantidadeDeVezes; i++){
            a = sc.nextInt();
            b = sc.nextInt();

            //tirar o mdc de cada par de valores e exibir
            mdc[i] = mdc(a,b);
        }

        //exibir mdc
        for(int i = 0; i < quantidadeDeVezes; i++)
            System.out.println(mdc[i]);
        
        sc.close();
    }

    public static int mdc(int a, int b){
        // algoritmo de euclides
        int temp;
        while(b != 0){
            temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}