import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        // le quantidade de numeros serão lidos
        int N = Integer.parseInt(in.readLine());
        int [] nums = new int[N];

        // le N numeros
        for(int i = 0; i < N; i++) nums[i] = Integer.parseInt(in.readLine());

        //printa o que cada uma eh (EVEN/ODD POSITIVE/NEGATIVE NULL)
        for(int i = 0; i < N; i++){
            // verifica se nulo
            if(nums[i] == 0){
                System.out.println("NULL");
                continue;
            }
            // verifica par ou impar
            if(nums[i]%2 == 0) System.out.print("EVEN ");
            else System.out.print("ODD ");

            // verifica positivo ou negativo
            if(nums[i] > 0) System.out.println("POSITIVE");
            else System.out.println("NEGATIVE");
        }

        in.close();
    }
}