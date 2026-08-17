// 15-03-2026

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int diasTotais = Integer.parseInt(reader.readLine());
        int anos,meses,dias;

        anos = diasTotais/365;
        diasTotais %= 365;
        meses = diasTotais/30;
        dias = diasTotais%30;

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");

    }
}
