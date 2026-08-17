import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String linha = reader.readLine();
        String []nums = linha.split("\\s+");
        int abas = Integer.parseInt(nums[0]);
        int acoes = Integer.parseInt(nums[1]);

        for(int i = 0; i < acoes && abas > 0; i++){
            linha = reader.readLine();

            switch (linha) {
                case "clicou":
                    abas--;
                    break;
                case "fechou":
                    abas++;
                    break;
            }
        }

        System.out.println(abas);
    }
}