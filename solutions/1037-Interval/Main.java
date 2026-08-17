// 02-02-2026
import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        double num = sc.nextDouble();

        if(num < 0 || num > 100){
            System.out.println("Fora de intervalo");
            sc.close();
            return;
        }
        String intervalo = "";
        if( num <= 25 ) intervalo = "[0,25]";
        else if( num <= 50 ) intervalo = "(25,50]";
        else if( num <= 75 ) intervalo = "(50,75]";
        else if( num <= 100 ) intervalo = "(75,100]";

        System.out.println("Intervalo " + intervalo);

        sc.close();
    }
}