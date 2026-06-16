// 25-01-2026

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) throws IOException{
        //ler quantas vezes será feito
        Scanner sc = new Scanner(System.in);
        int vezes = sc.nextInt();
        long[] kilos = new long[vezes];


        // para cada vez ler um numero(quantidade de casas)
        for(int i = 0; i < vezes; i++){
            //calcular a quantidade de graos e kilos
            kilos[i] = (long)((1.0 << (sc.nextInt())))/12000;
        }
        // exibir quantidade que kg de cada vez
        for (long kilo : kilos) System.out.println(kilo + " kg");

        sc.close();
    }
}
