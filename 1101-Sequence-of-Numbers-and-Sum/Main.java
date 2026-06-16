import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String [] args)throws IOException{
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        //ler pares de numeros(parar quando tiver algum numero <= 0) e exibir todos inteiros entrr eles e exibir, junto com a soma desses inteiros
        String a = "";
        String linha;
        int quantPares = 0;
        int num1, num2, soma;

        while(true){ 
            linha = rd.readLine();
            num1 = Integer.parseInt(linha.split(" ")[0]);
            num2 = Integer.parseInt(linha.split(" ")[1]);
            // verfica se algum valor é menor que zero
            if(num1 <= 0 || num2 <=0){
                rd.close();
                break;
            }
            a += linha+"\n";
            quantPares++;
        }
        int i = 0;
        while(i < quantPares){
            // le a linha
            linha = a.split("\n")[i];
            num1 = Integer.parseInt(linha.split(" ")[0]);
            num2 = Integer.parseInt(linha.split(" ")[1]);
            // coloca em ordem
            if(num1 > num2){
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }
            // exibe de num1 até num2 e soma os valores
            soma = 0;
            for(int j = num1; j <= num2; j++){
                System.out.printf("%d ",j);
                soma += j;
            }
            System.out.printf("Sum=%d\n",soma);
            i++;
        }
    }
}