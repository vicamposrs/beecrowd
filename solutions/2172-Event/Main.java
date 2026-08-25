import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        long M;
        String resultado = "";
        while(true){
            x = sc.nextInt();
            M = sc.nextLong();

            if(x == 0 && M ==0L) break;

            resultado += x*M + "\n";
        }

        System.out.print(resultado);
    }
}