import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Formatter;

public class Main2{
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();
        Formatter formatter = new Formatter(output);

        Double num = Double.parseDouble(in.readLine());

        for(int i = 0; i < 100;i++){
            formatter.format("N[%d] = %.4f%n",i, num);
            num /= 2.0;
        }

        System.out.print(output);
    }
}