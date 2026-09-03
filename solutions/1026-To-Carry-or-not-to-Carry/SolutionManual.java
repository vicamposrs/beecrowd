import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long soma = 0;
        int c = 1;

        StringBuilder output = new StringBuilder();

        while(sc.hasNext()){
            soma = 0;
            c = 1;

            long a = sc.nextLong();
            long b = sc.nextLong();
            
            while(a != 0 || b != 0){
                int currentBit = (int)((a%2 + b%2)%2);
                soma += currentBit * c;
                a = a/2;
                b = b/2;
                c *= 2;
            }
            output.append(soma).append("\n");
        }
        System.out.println(output);
    }
}