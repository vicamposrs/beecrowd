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
                num = Double.parseDouble(in.readLine());
                if(y >= abs(x - 5.5) + 6.5) sum += num;
            }
        }

        switch (operation) {
            case "S":
                System.out.println(formatOneDecimalPlace(sum));
                break;
        
            case "M":
                System.out.println(formatOneDecimalPlace(sum/30.0));
                break;
        }
    }

    static double abs(double x){
        if(x < 0) return -x;
        return x;
    }

    static String formatOneDecimalPlace(double value){
        String sinal = "";
        if(value < 0){
            value = -value;
            sinal = "-";
        }
        StringBuilder output = new StringBuilder();
        int integerPart = (int) value;
        double decimalPart = value - integerPart;

        int firstDecimalDigit = (int) (decimalPart * 10);
        double remainder = decimalPart*10 - firstDecimalDigit;
        
        if (remainder > 0.5 || (remainder == 0.5 && firstDecimalDigit % 2 != 0)) {
                firstDecimalDigit++;
        }
        if(firstDecimalDigit == 10){
            firstDecimalDigit = 0;
            integerPart++;
        }

        output.append(sinal).append(integerPart).append(".").append(firstDecimalDigit);
        return output.toString();
    }
}