import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfSlugs,slugSpeed;

        String resultado = "";

        while(sc.hasNextInt()){
            // le quantidade
            numberOfSlugs = sc.nextInt();
            int fasterSpeed = sc.nextInt();

            // ler velocidade e achar a maior 
            for(int i = 1; i < numberOfSlugs; i++){
                slugSpeed = sc.nextInt();
                if (slugSpeed > fasterSpeed) fasterSpeed = slugSpeed;
            }

            // classificar grupo
            if(fasterSpeed < 10) resultado += "1";
            else if(fasterSpeed < 20) resultado +="2";
            else /*fasterSpeed >= 20*/ resultado += "3";
            resultado += "\n";
        }

        //imprime resultado
        System.out.print(resultado);

        sc.close();
    }
}
