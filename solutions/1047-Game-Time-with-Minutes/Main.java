// 15/01/2026

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Duration;
import java.time.LocalTime;
//import java.util.Scanner;

public class Main{
        public static void main(String [] args)  throws IOException {
        //Scanner sc = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String [] linha = reader.readLine().split("\\s+");
            //sc.nextInt();
        int horaInicio = Integer.parseInt(linha[0]);
        int minutoInicio = Integer.parseInt(linha[1]);
        int horaFinal = Integer.parseInt(linha[2]);
        int minutoFinal = Integer.parseInt(linha[3]);

        LocalTime inicio =  LocalTime.of(horaInicio , minutoInicio);
        LocalTime finall = LocalTime.of(horaFinal , minutoFinal);
        Duration duracao =  Duration.between(inicio,finall);

        int horas = duracao.toHoursPart();
        int minutos = duracao.toMinutesPart();

        if(minutos < 0){
            minutos += 60;
            horas--;
        }
        if(horas < 0) horas += 24;

        if(horas == 0 && minutos == 0) horas = 24;

        System.out.println("O JOGO DUROU " + horas +" HORA(S) E " + minutos + " MINUTO(S)");
        //sc.close();
    }
}