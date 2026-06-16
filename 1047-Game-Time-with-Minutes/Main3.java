// 15/01/2026

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main3{
        public static void main(String [] args)  throws IOException {
 
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String [] linha = reader.readLine().split(" ");

        int horaInicio = Integer.parseInt(linha[0]);
        int minutoInicio = Integer.parseInt(linha[1]);
        int horaFinal = Integer.parseInt(linha[2]);
        int minutoFinal = Integer.parseInt(linha[3]);

        int inicio =  horaInicio*60 + minutoInicio;
        int finall = horaFinal*60 + minutoFinal;

        int duracao = finall - inicio;

        if(duracao < 0) duracao += 24*60; 

        int horas = duracao/60;
        int minutos = duracao%60;

        if(duracao == 0) horas = 24; 

        System.out.println("O JOGO DUROU " + horas +" HORA(S) E " + minutos + " MINUTO(S)");

    }
}