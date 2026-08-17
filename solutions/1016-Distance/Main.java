import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String [] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        final double VELOCIDADE = 0.5; // km/min
        int deslocamento = sc.nextInt();

        int tempo = (int)(deslocamento/VELOCIDADE);

        System.out.println(tempo + " minutos");
        sc.close();
    }
}