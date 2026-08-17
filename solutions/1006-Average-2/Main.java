import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        float nota1,nota2,nota3;
        nota1 = sc.nextFloat();
        nota2 = sc.nextFloat();
        nota3 = sc.nextFloat();
    
        float media = (nota1*2 + nota2*3 + nota3*5)/10;
        System.out.printf("MEDIA = %.1f\n",media);
        
        sc.close();
    }
}