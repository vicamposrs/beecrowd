//18-01-2026

import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String [] args) throws IOException{

        Scanner sc = new Scanner(System.in);
        int [] valores = {10000,5000,2000,1000,500,200,100,50,25,10,5,1};
        int [] quantidade = new int[12];

        int valor = (int)(100*sc.nextDouble());

        for(int i = 0; i < 12; i++){
            quantidade[i] = (int)(valor/valores[i]);
            valor -= quantidade[i]*valores[i];
        }
       

        System.out.println("NOTAS:");
        for(int i = 0; i < 6;i++) System.out.printf("%d nota(s) de R$ %.2f\n",quantidade[i],valores[i]/100.0);
        System.out.println("MOEDAS:");
        for(int i = 6; i < 12;i++) System.out.printf("%d moeda(s) de R$ %.2f\n",quantidade[i],valores[i]/100.0);
        sc.close();
    }
}