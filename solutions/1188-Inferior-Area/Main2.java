import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2{
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String operation = in.readLine();
        double sum = 0;
        double num;
        for(int i = 0; i < 7*12;i++)
            in.readLine();


        for(int y = 7; y < 12;y++){
            for(int x = 0; x < 12;x++){
                num = Integer.parseInt(in.readLine());
                if(y >= abs(x - 5.5) + 6.5) sum += num;
            }
        }

        switch (operation) {
            case "S":
                System.out.println(doubleOneDecimalPlace(sum));
                break;
        
            case "M":
                System.out.println(doubleOneDecimalPlace(sum/30.0));
                break;
        }
    }

    static double abs(double x){
        if(x < 0) return -x;
        return x;
    }

    static String doubleOneDecimalPlace(double a){
        StringBuilder output = new StringBuilder();
        int num = (int) a;
        double casas = (num - a) * 10;

        int parteDecimal = (int) casas;
        double resto = casas - parteDecimal;

        if (resto > 0.5 || (resto == 0.5 && parteDecimal % 2 != 0)) {
                parteDecimal++;
        }
        output.append(num).append(".").append(parteDecimal);
        return output.toString();
    }
}