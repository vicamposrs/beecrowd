import java.util.Scanner;

public class Main{
    public static void  main(String [] args){
        Scanner sc = new Scanner(System.in);
        final int [] PORTIONS = {300,1500,600,1000,150};
        final int DONA_CHICA = 225;
        int [] quantity = new int[5];
        
        for(int i = 0; i < 5 ; i++) quantity[i] = sc.nextInt();

        int grams = DONA_CHICA;

        for(int i = 0; i < 5 ; i++) grams += quantity[i]*PORTIONS[i];

        System.out.println(grams);
    
        sc.close();
    }
}