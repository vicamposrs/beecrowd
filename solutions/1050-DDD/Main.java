import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        HashMap<Integer, String> ddd = new HashMap<Integer, String>();

        ddd.put(61,"Brasilia");
        ddd.put(71,"Salvador");
        ddd.put(11,"Sao Paulo");
        ddd.put(21,"Rio de Janeiro");
        ddd.put(32,"Juiz de Fora");
        ddd.put(19,"Campinas");
        ddd.put(27,"Vitoria");
        ddd.put(31,"Belo Horizonte");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String cidade = ddd.get(num);
        if (cidade == null) {
            cidade = "DDD nao cadastrado";
        }
        System.out.println(cidade);
        
        sc.close();
    }
 
}