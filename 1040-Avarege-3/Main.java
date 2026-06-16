import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        double [] notas = new double[4];

        for(int i = 0; i < notas.length;i++)notas[i] = sc.nextDouble();
        double soma = 0;
        for(int i = 0; i < notas.length;i++) soma += notas[i]*(((i+1)%4)+1);
        double media = soma/10;
        String resposta;
        media = ((int)(media*10))/10.0;
        resposta = "Media: %.1f\n".formatted(media);

        if(media >= 7.0) resposta += "Aluno aprovado.\n";
        else if(media < 5.0) resposta += "Aluno reprovado.\n";
        else{
            double notaExame = sc.nextDouble();
            media = (notaExame + media)/2;
            media = ((int)(media*10))/10.0;
            resposta += "Aluno em exame.\n";
            resposta += "Nota do exame: %.1f\n".formatted(notaExame);
            if(media >= 5) resposta += "Aluno aprovado.\n";
            else resposta += "Aluno reprovado.\n";
            resposta += "Media final: %.1f\n".formatted(media);
        }
        System.out.print(resposta);
        sc.close();
    }
}