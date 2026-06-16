// 21-01-2026

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException  {
        Scanner sc = new Scanner(System.in);
        //ler os valores de vezes
        int quantidadeDeVezes = sc.nextInt();

        //ler dois valores para cada vez
        int [][] cartas = new int[quantidadeDeVezes][2];
        for(int i = 0; i < quantidadeDeVezes; i++){
            cartas[i][0] = sc.nextInt();
            cartas[i][1] = sc.nextInt();
        }

        //tirar o mdc de cada par de valores e exibir
        // algoritmo de euclides
        for(int i = 0; i < quantidadeDeVezes; i++){
            int maior,menor, mdc = 0;
            if(cartas[i][0] > cartas[i][1]){
                maior = cartas[i][0];
                menor = cartas[i][1];
            } else{
                maior = cartas[i][1];
                menor = cartas[i][0];
            }
            while(menor != 0){
                mdc = maior%menor;
                maior = menor;
                menor = mdc;
                mdc = maior;
            }
            System.out.println(mdc);
        }
        sc.close();
    }
}