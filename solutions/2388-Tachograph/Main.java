import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int QuantidadeIntervalos = sc.nextInt();
        int [] tempoEmHora = new int[QuantidadeIntervalos]; //em horas
        int [] velocidadeMedia = new int[QuantidadeIntervalos]; // km/h
        int distanciaTotalPercorrida = 0;

        for(int i = 0; i < QuantidadeIntervalos; i ++){
            tempoEmHora[i] = sc.nextInt();
            velocidadeMedia[i] = sc.nextInt();
        }

        for(int i = 0; i < QuantidadeIntervalos; i ++){
            distanciaTotalPercorrida += tempoEmHora[i] * velocidadeMedia[i];
        }
        System.out.println( distanciaTotalPercorrida);
        sc.close();
    }
}