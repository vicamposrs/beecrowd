//20-01-2026

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
    public static void main(String [] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String [] linha = reader.readLine().split(" ");
        double []lados = new double[3];
        for(int i = 0; i < lados.length ; i++) lados[i] = Double.parseDouble(linha[i]);

        boolean ehTriangulo = true;

        for(int i = 0; i < lados.length ; i++){
            if(lados[i%3] >= lados[(i+1)%3] + lados[(i+2)%3]) ehTriangulo = false;
        }

        double temp = 0;

        if(ehTriangulo){
             
            if(lados[1] > lados[0] && lados[1] > lados[2]){
                temp = lados[0];
                lados[0] = lados[1];
                lados[1] = temp;
            }
            else if(lados[2] > lados[0] && lados[2] > lados[1]){
                temp = lados[0];
                lados[0] = lados[2];
                lados[2] = temp;
            }

            double quadradoDoLadoMaior = lados[0]*lados[0];
            double quadradosDosLadosMenores = lados[1]*lados[1] + lados[2]*lados[2];
            if(quadradoDoLadoMaior == quadradosDosLadosMenores) 
                System.out.println("TRIANGULO RETANGULO");
            else if(quadradoDoLadoMaior > quadradosDosLadosMenores) 
                System.out.println("TRIANGULO OBTUSANGULO");
            else 
                System.out.println("TRIANGULO ACUTANGULO");

            if(lados[0] == lados[1] && lados[1] == lados[2])
                System.out.println("TRIANGULO EQUILATERO");
            else if(lados[0] == lados[1] || lados[1] == lados[2] || lados[0] == lados[2])
                System.out.println("TRIANGULO ISOSCELES");
        }
        else System.out.println("NAO FORMA TRIANGULO");

        reader.close();
    }
}
