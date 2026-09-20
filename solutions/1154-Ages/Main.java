import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int age;
        int sum = 0;
        int quantity =0;
        while(true){
            age = Integer.parseInt(in.readLine());
            if(age < 0) break;
            sum += age;
            quantity++;
        }
        double average = (double)sum/quantity;
        System.out.println("%.2f".formatted(average));
    }
}