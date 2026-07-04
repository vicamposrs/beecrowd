//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.Scanner;


public class Main{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        //*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double []nota = new double[2];
        nota[0] = sc.nextDouble();
        nota[1] = sc.nextDouble();
        //*nota[0] = Double.parseDouble(reader.readLine());
        //*nota[1] = Double.parseDouble(reader.readLine());
        double []peso = {3.5,7.5};
        double soma = 0;

        for(int i = 0; i < nota.length;i++) soma += nota[i]*peso[i];
        double media = soma/11;

        System.out.printf("MEDIA = %.5f\n",media);
        //*reader.close();
        sc.close();
    }
}
