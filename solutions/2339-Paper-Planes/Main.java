import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        short quantCompetidores , folhasComopradas , folhasPorCompetidor;
        String numeros[] = reader.readLine().split(" ");

        quantCompetidores = Short.parseShort(numeros[0]);
        folhasComopradas = Short.parseShort(numeros[1]);
        folhasPorCompetidor = Short.parseShort(numeros[2]);

        System.out.println((folhasPorCompetidor*quantCompetidores <= folhasComopradas)?"S":"N");
        reader.close();
    }
}