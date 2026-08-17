import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x > y){
            int temp = x;
            x = y;
            y = temp;
        }
        x++;
        if(x%2 ==0)x++;

        int soma = 0;
        for(int i = x; i < y; i+=2){
            soma += i;
        }
        
        System.out.println(soma);

        sc.close();
    }
 
}