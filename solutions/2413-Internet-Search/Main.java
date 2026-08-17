import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int CliquesTerceiroLink = sc.nextInt();
        int CliquesPrimeiroLink = 4 * CliquesTerceiroLink;

        System.out.println(CliquesPrimeiroLink);

        sc.close();
    }
}