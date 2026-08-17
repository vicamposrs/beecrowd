import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);

        float number = 0;
        int positives = 0;
        float sum = 0;
        for(int i = 0; i < 6; i++){
            number = sc.nextFloat();
            if(number > 0){
                positives++;
                sum += number;
            }
        }
        float average = sum/positives;

        System.out.println(positives + " valores positivos");
        System.out.printf("%.1f\n",average);

        sc.close();
 
    }
 
}