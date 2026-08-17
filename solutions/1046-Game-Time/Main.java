import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        int horaInicio = sc.nextInt();
        int horaFinal = sc.nextInt();
        int duracao = 0;

        if(horaInicio >= horaFinal) duracao = 24 - horaInicio + horaFinal;
        else duracao = horaFinal - horaInicio;

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        sc.close();
    }
}