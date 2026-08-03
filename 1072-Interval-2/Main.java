import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num;
        int in = 0;
        int out = 0;

        for(int i = 0; i < N; i++){
            num = sc.nextInt();
            if(num >= 10 && num <= 20) in++;
            else out++;
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

        sc.close();
 
    }
 
}