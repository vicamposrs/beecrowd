import java.io.IOException;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double R = sc.nextDouble();
        final double pi = 3.14159;
        double A = R*R*pi;
        
        System.out.printf("A=%.4f\n",A);
 
    }
}