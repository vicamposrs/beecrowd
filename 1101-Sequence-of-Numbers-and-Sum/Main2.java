// 02-04-2026

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2{
    public static void main(String [] args)throws IOException{
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        //ler pares de numeros(parar quando tiver algum numero <= 0) e exibir todos inteiros entrr eles e exibir, junto com a soma desses inteiros
        String linha;
        int num1, num2, soma;
        String resposta = "";

        while(true){ 
            linha = rd.readLine();
            num1 = Integer.parseInt(linha.split(" ")[0]);
            num2 = Integer.parseInt(linha.split(" ")[1]);
            // verfica se algum valor é menor que zero
            if(num1 <= 0 || num2 <=0){
                rd.close();
                break;
            }
            // coloca em ordem
            if(num1 > num2){
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }
            // armazena de num1 até num2 e soma os valores em linhas da string de resposta
            soma = 0;
            for(int j = num1; j <= num2; j++){
                resposta += String.format("%d ",j);
                soma += j;
            }
            resposta += String.format("Sum=%d\n",soma);

        }
        System.out.print(resposta);
    }
}