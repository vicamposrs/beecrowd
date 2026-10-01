import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String operation = in.readLine();
        double sum = 0;
        double num;
        for(int i = 0; i < 7*12;i++)
            in.readLine();


        for(int y = 7; y < 12;y++){
            for(int x = 0; x < 12;x++){
                num = Double.parseDouble(in.readLine());
                if(y >= abs(x - 5.5) + 6.5) sum += num;
            }
        }

        switch (operation) {
            case "S":
                System.out.printf("%.1f\n",sum);
                break;
        
            case "M":
                System.out.printf("%.1f\n",sum/30);
                break;
        }
    }

    static double abs(double x){
        if(x < 0) return -x;
        return x;
    }
}