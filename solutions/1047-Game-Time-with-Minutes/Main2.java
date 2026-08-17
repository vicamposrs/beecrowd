// 15/01/2026

import java.io.IOException;
import java.util.Scanner;

public class Main2{
    public static void main(String [] args)  throws IOException {
        Scanner sc = new Scanner(System.in);

        int horaInicio = sc.nextInt();
        int minutoInicio = sc.nextInt();
        int horaFinal = sc.nextInt();
        int minutoFinal = sc.nextInt();

        int duracaoHoras = 0, duracaoMinutos;

        if(minutoInicio > minutoFinal) duracaoHoras++;

        duracaoMinutos = minutoFinal-minutoInicio;
        duracaoHoras = horaFinal - horaInicio - duracaoHoras;

        if(duracaoHoras < 0) duracaoHoras += 24;
        if(duracaoMinutos < 0) duracaoMinutos += 60;

        if(duracaoHoras == 0 && duracaoMinutos == 0) duracaoHoras = 24;

        System.out.println("O JOGO DUROU " + duracaoHoras +" HORA(S) E " + duracaoMinutos + " MINUTO(S)");
        sc.close();
    }
}