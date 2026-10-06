import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int L = Integer.parseInt(in.readLine());
        String operation = in.readLine();

        double sum = 0;

        for(int i = 0; i < 12; i++){
            for(int j = 0;j < 12; j++){
                if(i == L)
                    sum += Double.parseDouble(in.readLine());
                else
                    in.readLine();
            }
        }

        if(operation.equals("S"))
            System.out.printf("%.1f\n",sum);
        if(operation.equals("M"))
            System.out.printf("%.1f\n",sum/12.0);

    }
}
