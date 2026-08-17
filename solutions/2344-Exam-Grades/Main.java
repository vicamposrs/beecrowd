import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int nota = sc.nextInt();

        char conceito;

        if(nota == 0) conceito = 'E';
        else if(nota <= 35) conceito = 'D';
        else if(nota <= 60) conceito = 'C';
        else if(nota <= 85) conceito = 'B';
        else if(nota <= 100) conceito = 'A';
        else conceito = '0';

        System.out.println(conceito);
        sc.close();
    }
}