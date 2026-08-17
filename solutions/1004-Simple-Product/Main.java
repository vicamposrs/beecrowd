import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int n1, n2, prod;
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        prod = n1*n2;
        System.out.println("PROD = " + prod);
    }
}