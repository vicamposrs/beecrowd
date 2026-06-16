import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int correctTea = sc.nextInt();

        int[] tries = new int[5];

        for(int i = 0; i < 5; i++){
            tries[i] = sc.nextInt();
        }

        int count = 0;

        for(int i = 0; i < 5 ; i++)
            if(tries[i]==correctTea) count++;

        System.out.println(count);
        sc.close();
    }
}