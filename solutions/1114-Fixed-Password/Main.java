import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        while(!in.readLine().equals("2002")) 
            System.out.println("Senha Invalida");

        System.out.println("Acesso Permitido");
    }
}