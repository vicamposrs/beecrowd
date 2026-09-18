import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(in.readLine());
        int Z;

        do{
            Z = Integer.parseInt(in.readLine());
        }while(X >= Z);

        int sum = X;
        int numbersSummed = 1;

        while(sum <= Z){
            sum += (X + numbersSummed);
            numbersSummed++;
        }

        System.out.println(numbersSummed);
    }
 
}