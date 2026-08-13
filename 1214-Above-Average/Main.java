import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String resultado = "";
        int testCases = sc.nextInt();
        for(int i = 0; i < testCases; i++){
            int numberOfPeople = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            int soma = 0;
            for(int j = 0; j < numberOfPeople;j++){
                int num = sc.nextInt();
                list.add(num);
                soma += num;
            }
            double avarege = (double) soma / numberOfPeople;
            int peopleAboveAvarege = 0;
            for(int a : list){
                if( a > avarege) peopleAboveAvarege++;
            }
            double percentage = 100.0*peopleAboveAvarege/numberOfPeople;
            
            BigDecimal bd = BigDecimal.valueOf(percentage)
            .setScale(3, RoundingMode.HALF_EVEN);

            resultado += bd.toPlainString() + "%\n";
        }
        System.out.print(resultado);
        sc.close();
    }
}